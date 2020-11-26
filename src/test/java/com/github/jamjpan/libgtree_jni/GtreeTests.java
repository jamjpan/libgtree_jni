import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.github.jamjpan.libgtree_jni.GTree;
import com.github.jamjpan.libgtree_jni.IntVector;
import com.github.jamjpan.libgtree_jni.gtreeJNI;

@TestMethodOrder(OrderAnnotation.class)
public class GtreeTests {

    @BeforeAll
    static void load_library() {
	try {
	    System.loadLibrary("gtree_jni");
	}
	catch (Exception e) {
	    fail("Native binary failed to load. Reason: "+e);
	}
    }

    @Test
    @Order(1)
    void gtree_build_succeeds() {
	try {
	    gtreeJNI.setGraph_path("src/test/data/cal.gr");
	    gtreeJNI.setIndex_path("src/test/data/cal.gtree");
	    gtreeJNI.setVEX_ID_START_WITH_ZERO(false);

	    GTree gtree = new GTree();
	    gtree.buildTree();
	    gtreeJNI.write_GTree(gtree);
	}
	catch (Exception e) {
	    fail("G-tree build failed. Reason: "+e);
	}
    }

    @Test
    @Order(2)
    void gtree_query_succeeds() {
	Integer from = 20562;
	Integer to = 11820;

	gtreeJNI.setIndex_path("src/test/data/cal.gtree");

	GTree gtree = new GTree();
	gtreeJNI.read_GTree(gtree);

	// Perform forward query and recover the path.
	// IMPORTANT: path recovery doesn't work unless the distance
	// query is first performed!
	Integer forward = gtree.shortest_path_querying(from, to);
	IntVector forward_path = new IntVector();
	gtree.path_recovery(from, to, forward_path);

	// Perform reverse query and recover the path.
	Integer reverse = gtree.shortest_path_querying(to, from);
	IntVector reverse_path = new IntVector();
	gtree.path_recovery(to, from, reverse_path);

	// Check forward and reverse queries are equal.
	assertEquals(forward, 536972);
	assertEquals(forward, reverse);

	// For now just check endpoints...
	int size = (int) forward_path.size();

	assertEquals(forward_path.size(), reverse_path.size());
	assertEquals(forward_path.get(0), from);
	assertEquals(forward_path.get(size - 1), to);
	assertEquals(reverse_path.get(0), to);
	assertEquals(reverse_path.get(size - 1), from);
    }

    @AfterAll
    static void cleanup() {
	try {
	    Path path =
	    	FileSystems.getDefault().getPath("src/test/data", "cal.gtree");
	    boolean deleted = Files.deleteIfExists(path);
	    assertTrue(deleted);
	}
	catch (Exception e) {
	    fail("Cleanup failed. Reason: "+e);
	}
    }
}

