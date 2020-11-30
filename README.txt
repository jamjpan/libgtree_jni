	libgtree_jni (Maven)
	Last updated: <2020-11-26>

This repository contains the g-tree JNI library for Java located at

     https://github.com/jamjpan/libgtree_jni_native

packaged as a convenient Maven artifact. It contains the "swigified"
Java sources (src/main/java), generated using SWIG 3.0.12.

IMPORTANT! This artifact only contains the Java classes to the
libgtree_jni. To use this artifact, you MUST have the other half of
the JNI, the libgtree_jni platform-dependent binary, installed in your
Java library path (e.g. /usr/lib).

If you see

   GtreeTests.load_library:26 » UnsatisfiedLink no gtree_jni in
   java.library.path...

this means you are missing the binary. A release for Linux amd64 is
available at the link at the top, including manual build instructions.

Build
-----
Simply type `mvn install` from this directory to build and install the
artifact into your local Maven repository. To use in other projects,
add the dependency to pom.xml:

<dependencies>
  ...
    <dependency>
      <groupId>com.github.jamjpan</groupId>
      <artifactId>libgtree_jni</artifactId>
      <version>1.0</version>
    </dependency>
  ...
</dependencies>

Usage
-----
See the test GtreeTests.java for example usage.
