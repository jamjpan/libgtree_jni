/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.jamjpan.libgtree_jni;

public class gtreeJNIJNI {
  public final static native long new_IntVector__SWIG_0();
  public final static native long new_IntVector__SWIG_1(long jarg1);
  public final static native long IntVector_size(long jarg1, IntVector jarg1_);
  public final static native long IntVector_capacity(long jarg1, IntVector jarg1_);
  public final static native void IntVector_reserve(long jarg1, IntVector jarg1_, long jarg2);
  public final static native boolean IntVector_isEmpty(long jarg1, IntVector jarg1_);
  public final static native void IntVector_clear(long jarg1, IntVector jarg1_);
  public final static native void IntVector_add(long jarg1, IntVector jarg1_, int jarg2);
  public final static native int IntVector_get(long jarg1, IntVector jarg1_, int jarg2);
  public final static native void IntVector_set(long jarg1, IntVector jarg1_, int jarg2, int jarg3);
  public final static native void delete_IntVector(long jarg1);
  public final static native void data_id_set(int jarg1);
  public final static native int data_id_get();
  public final static native void datasets_set(long jarg1);
  public final static native long datasets_get();
  public final static native void graph_path_set(String jarg1);
  public final static native String graph_path_get();
  public final static native void query_path_set(String jarg1);
  public final static native String query_path_get();
  public final static native void index_path_set(String jarg1);
  public final static native String index_path_get();
  public final static native void MAX_LEAF_SIZE_set(long jarg1);
  public final static native long MAX_LEAF_SIZE_get();
  public final static native void FANOUT_set(long jarg1);
  public final static native long FANOUT_get();
  public final static native void VEX_ID_START_WITH_ZERO_set(boolean jarg1);
  public final static native boolean VEX_ID_START_WITH_ZERO_get();
  public final static native void DIRECTED_GRAPH_set(boolean jarg1);
  public final static native boolean DIRECTED_GRAPH_get();
  public final static native void Forest_Speed_Up_Query_set(boolean jarg1);
  public final static native boolean Forest_Speed_Up_Query_get();
  public final static native void VERBOSE_set(boolean jarg1);
  public final static native boolean VERBOSE_get();
  public final static native void DISP_FREQ_set(long jarg1);
  public final static native long DISP_FREQ_get();
  public final static native void Matrix_n_set(long jarg1, Matrix jarg1_, long jarg2);
  public final static native long Matrix_n_get(long jarg1, Matrix jarg1_);
  public final static native void Matrix_a_set(long jarg1, Matrix jarg1_, long jarg2);
  public final static native long Matrix_a_get(long jarg1, Matrix jarg1_);
  public final static native long new_Matrix();
  public final static native void delete_Matrix(long jarg1);
  public final static native void Matrix_init__SWIG_0(long jarg1, Matrix jarg1_, long jarg2, int jarg3);
  public final static native void Matrix_init__SWIG_1(long jarg1, Matrix jarg1_, long jarg2);
  public final static native long Matrix___bracket__(long jarg1, Matrix jarg1_, int jarg2);
  public final static native void Graph_n_set(long jarg1, Graph jarg1_, long jarg2);
  public final static native long Graph_n_get(long jarg1, Graph jarg1_);
  public final static native void Graph_m_set(long jarg1, Graph jarg1_, long jarg2);
  public final static native long Graph_m_get(long jarg1, Graph jarg1_);
  public final static native void Graph_mCount_set(long jarg1, Graph jarg1_, int jarg2);
  public final static native int Graph_mCount_get(long jarg1, Graph jarg1_);
  public final static native void Graph_id_set(long jarg1, Graph jarg1_, long jarg2, IntVector jarg2_);
  public final static native long Graph_id_get(long jarg1, Graph jarg1_);
  public final static native void Graph_head_set(long jarg1, Graph jarg1_, long jarg2, IntVector jarg2_);
  public final static native long Graph_head_get(long jarg1, Graph jarg1_);
  public final static native void Graph_next_set(long jarg1, Graph jarg1_, long jarg2, IntVector jarg2_);
  public final static native long Graph_next_get(long jarg1, Graph jarg1_);
  public final static native void Graph_adjv_set(long jarg1, Graph jarg1_, long jarg2, IntVector jarg2_);
  public final static native long Graph_adjv_get(long jarg1, Graph jarg1_);
  public final static native void Graph_weights_set(long jarg1, Graph jarg1_, long jarg2);
  public final static native long Graph_weights_get(long jarg1, Graph jarg1_);
  public final static native long new_Graph();
  public final static native void delete_Graph(long jarg1);
  public final static native void Graph_init(long jarg1, Graph jarg1_, long jarg2, long jarg3);
  public final static native void Graph_readOriginalGraph(long jarg1, Graph jarg1_, String jarg2);
  public final static native void Graph_generevGraph(long jarg1, Graph jarg1_, long jarg2, Graph jarg2_);
  public final static native void Graph_addEdge(long jarg1, Graph jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native void Graph_Split__SWIG_0(long jarg1, Graph jarg1_, long jarg2, IntVector jarg2_, long jarg3);
  public final static native void Graph_Split__SWIG_1(long jarg1, Graph jarg1_, long jarg2, IntVector jarg2_);
  public final static native int Graph_Split_test_border_num(long jarg1, Graph jarg1_, int jarg2);
  public final static native void Graph_buildSubgraphs__SWIG_0(long jarg1, Graph jarg1_, long jarg2, IntVector jarg2_, long jarg3, long jarg4);
  public final static native void Graph_buildSubgraphs__SWIG_1(long jarg1, Graph jarg1_, long jarg2, IntVector jarg2_, long jarg3);
  public final static native void Node_G_set(long jarg1, Node jarg1_, long jarg2, Graph jarg2_);
  public final static native long Node_G_get(long jarg1, Node jarg1_);
  public final static native void Node_matrix_set(long jarg1, Node jarg1_, long jarg2, Matrix jarg2_);
  public final static native long Node_matrix_get(long jarg1, Node jarg1_);
  public final static native void Node_interv_set(long jarg1, Node jarg1_, long jarg2, Matrix jarg2_);
  public final static native long Node_interv_get(long jarg1, Node jarg1_);
  public final static native void Node_id_set(long jarg1, Node jarg1_, int jarg2);
  public final static native int Node_id_get(long jarg1, Node jarg1_);
  public final static native void Node_father_set(long jarg1, Node jarg1_, int jarg2);
  public final static native int Node_father_get(long jarg1, Node jarg1_);
  public final static native void Node_depth_set(long jarg1, Node jarg1_, int jarg2);
  public final static native int Node_depth_get(long jarg1, Node jarg1_);
  public final static native void Node_children_set(long jarg1, Node jarg1_, long jarg2, IntVector jarg2_);
  public final static native long Node_children_get(long jarg1, Node jarg1_);
  public final static native void Node_gid2bid_set(long jarg1, Node jarg1_, long jarg2);
  public final static native long Node_gid2bid_get(long jarg1, Node jarg1_);
  public final static native void Node_bid_f_set(long jarg1, Node jarg1_, long jarg2);
  public final static native long Node_bid_f_get(long jarg1, Node jarg1_);
  public final static native void Node_bid_c_set(long jarg1, Node jarg1_, long jarg2, IntVector jarg2_);
  public final static native long Node_bid_c_get(long jarg1, Node jarg1_);
  public final static native void Node_bid2gid_set(long jarg1, Node jarg1_, long jarg2, IntVector jarg2_);
  public final static native long Node_bid2gid_get(long jarg1, Node jarg1_);
  public final static native void Node_dist2b_set(long jarg1, Node jarg1_, long jarg2);
  public final static native long Node_dist2b_get(long jarg1, Node jarg1_);
  public final static native void Node_pre_vex_set(long jarg1, Node jarg1_, long jarg2, IntVector jarg2_);
  public final static native long Node_pre_vex_get(long jarg1, Node jarg1_);
  public final static native void Node_pcls_idx_set(long jarg1, Node jarg1_, long jarg2, IntVector jarg2_);
  public final static native long Node_pcls_idx_get(long jarg1, Node jarg1_);
  public final static native void Node_bid2lgid_set(long jarg1, Node jarg1_, long jarg2, IntVector jarg2_);
  public final static native long Node_bid2lgid_get(long jarg1, Node jarg1_);
  public final static native long new_Node();
  public final static native void Node_initialize(long jarg1, Node jarg1_);
  public final static native void Node_stablize(long jarg1, Node jarg1_);
  public final static native void Node_add_edges2mat(long jarg1, Node jarg1_);
  public final static native void Node_add_border(long jarg1, Node jarg1_, int jarg2, int jarg3);
  public final static native void Node_add_borders(long jarg1, Node jarg1_);
  public final static native void Node_init_matrix(long jarg1, Node jarg1_);
  public final static native void Node_floyd(long jarg1, Node jarg1_);
  public final static native void Node_sync_dist2father(long jarg1, Node jarg1_, long jarg2, Node jarg2_);
  public final static native boolean Node_sync_dist_from_father(long jarg1, Node jarg1_, long jarg2, Node jarg2_);
  public final static native void Node_push_up(long jarg1, Node jarg1_, long jarg2, Node jarg2_);
  public final static native void Node_push_down(long jarg1, Node jarg1_, long jarg2, Node jarg2_, long jarg3, Node jarg3_);
  public final static native long __put__(long jarg1, long jarg2, Node jarg2_);
  public final static native void delete_Node(long jarg1);
  public final static native String node2tring(long jarg1, Node jarg1_);
  public final static native int dijkstra__SWIG_0(int jarg1, long jarg2, Graph jarg2_, long jarg3);
  public final static native long dijkstra__SWIG_1(int jarg1, int jarg2, long jarg3, Graph jarg3_, long jarg4, IntVector jarg4_);
  public final static native long dijkstra__SWIG_2(int jarg1, int jarg2, long jarg3, Graph jarg3_);
  public final static native void SPSP_Generator__SWIG_0(String jarg1, String jarg2);
  public final static native void SPSP_Generator__SWIG_1(String jarg1);
  public final static native void SPSP_Generator__SWIG_2();
  public final static native void GTree_nodes_num_set(long jarg1, GTree jarg1_, int jarg2);
  public final static native int GTree_nodes_num_get(long jarg1, GTree jarg1_);
  public final static native void GTree_nodes_set(long jarg1, GTree jarg1_, long jarg2, Node jarg2_);
  public final static native long GTree_nodes_get(long jarg1, GTree jarg1_);
  public final static native void GTree_gid2leafid_set(long jarg1, GTree jarg1_, long jarg2);
  public final static native long GTree_gid2leafid_get(long jarg1, GTree jarg1_);
  public final static native void GTree_tree_build_time_set(long jarg1, GTree jarg1_, long jarg2);
  public final static native long GTree_tree_build_time_get(long jarg1, GTree jarg1_);
  public final static native long new_GTree();
  public final static native void delete_GTree(long jarg1);
  public final static native void GTree_sync_b2child_nodes(long jarg1, GTree jarg1_, int jarg2);
  public final static native void GTree_build_node(long jarg1, GTree jarg1_, int jarg2);
  public final static native void GTree_build_nodes(long jarg1, GTree jarg1_);
  public final static native void GTree_build_node_matrices(long jarg1, GTree jarg1_);
  public final static native void GTree_buildTree(long jarg1, GTree jarg1_);
  public final static native void GTree_pushBordersUp(long jarg1, GTree jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native void GTree_pushBordersDown(long jarg1, GTree jarg1_, int jarg2, int jarg3, long jarg4, int jarg5);
  public final static native int GTree_findLCA__SWIG_0(long jarg1, GTree jarg1_, int jarg2, int jarg3, long jarg4);
  public final static native int GTree_findLCA__SWIG_1(long jarg1, GTree jarg1_, int jarg2, int jarg3);
  public final static native int GTree_shortest_path_querying(long jarg1, GTree jarg1_, int jarg2, int jarg3);
  public final static native void GTree_find_path_recur(long jarg1, GTree jarg1_, int jarg2, int jarg3, int jarg4, long jarg5, IntVector jarg5_);
  public final static native void GTree_path_recovery__SWIG_0(long jarg1, GTree jarg1_, int jarg2, int jarg3, long jarg4, IntVector jarg4_, int jarg5);
  public final static native void GTree_path_recovery__SWIG_1(long jarg1, GTree jarg1_, int jarg2, int jarg3, long jarg4, IntVector jarg4_);
  public final static native long GTree_max_parti_size(long jarg1, GTree jarg1_, long jarg2, Graph jarg2_);
  public final static native void write_matrix(long jarg1, long jarg2, Matrix jarg2_);
  public final static native void read_matrix(long jarg1, long jarg2, Matrix jarg2_);
  public final static native void write_tree_node(long jarg1, long jarg2, Node jarg2_);
  public final static native void read_tree_node(long jarg1, long jarg2, Node jarg2_);
  public final static native void write_GTree(long jarg1, GTree jarg1_);
  public final static native void read_GTree(long jarg1, GTree jarg1_);
  public final static native void recover_path_from_prevs__SWIG_0(long jarg1, int jarg2, int jarg3, long jarg4, IntVector jarg4_);
  public final static native void recover_path_from_prevs__SWIG_1(int jarg1, int jarg2, long jarg3, IntVector jarg3_, long jarg4, IntVector jarg4_);
}
