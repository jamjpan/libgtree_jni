/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.jamjpan.libgtree_jni;

public class Node {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Node(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Node obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gtreeJNIJNI.delete_Node(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setG(Graph value) {
    gtreeJNIJNI.Node_G_set(swigCPtr, this, Graph.getCPtr(value), value);
  }

  public Graph getG() {
    long cPtr = gtreeJNIJNI.Node_G_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Graph(cPtr, false);
  }

  public void setMatrix(Matrix value) {
    gtreeJNIJNI.Node_matrix_set(swigCPtr, this, Matrix.getCPtr(value), value);
  }

  public Matrix getMatrix() {
    long cPtr = gtreeJNIJNI.Node_matrix_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Matrix(cPtr, false);
  }

  public void setInterv(Matrix value) {
    gtreeJNIJNI.Node_interv_set(swigCPtr, this, Matrix.getCPtr(value), value);
  }

  public Matrix getInterv() {
    long cPtr = gtreeJNIJNI.Node_interv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Matrix(cPtr, false);
  }

  public void setId(int value) {
    gtreeJNIJNI.Node_id_set(swigCPtr, this, value);
  }

  public int getId() {
    return gtreeJNIJNI.Node_id_get(swigCPtr, this);
  }

  public void setFather(int value) {
    gtreeJNIJNI.Node_father_set(swigCPtr, this, value);
  }

  public int getFather() {
    return gtreeJNIJNI.Node_father_get(swigCPtr, this);
  }

  public void setDepth(int value) {
    gtreeJNIJNI.Node_depth_set(swigCPtr, this, value);
  }

  public int getDepth() {
    return gtreeJNIJNI.Node_depth_get(swigCPtr, this);
  }

  public void setChildren(IntVector value) {
    gtreeJNIJNI.Node_children_set(swigCPtr, this, IntVector.getCPtr(value), value);
  }

  public IntVector getChildren() {
    long cPtr = gtreeJNIJNI.Node_children_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVector(cPtr, false);
  }

  public void setGid2bid(SWIGTYPE_p_std__unordered_mapT_int_int_t value) {
    gtreeJNIJNI.Node_gid2bid_set(swigCPtr, this, SWIGTYPE_p_std__unordered_mapT_int_int_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__unordered_mapT_int_int_t getGid2bid() {
    return new SWIGTYPE_p_std__unordered_mapT_int_int_t(gtreeJNIJNI.Node_gid2bid_get(swigCPtr, this), true);
  }

  public void setBid_f(SWIGTYPE_p_std__unordered_mapT_int_int_t value) {
    gtreeJNIJNI.Node_bid_f_set(swigCPtr, this, SWIGTYPE_p_std__unordered_mapT_int_int_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__unordered_mapT_int_int_t getBid_f() {
    return new SWIGTYPE_p_std__unordered_mapT_int_int_t(gtreeJNIJNI.Node_bid_f_get(swigCPtr, this), true);
  }

  public void setBid_c(IntVector value) {
    gtreeJNIJNI.Node_bid_c_set(swigCPtr, this, IntVector.getCPtr(value), value);
  }

  public IntVector getBid_c() {
    long cPtr = gtreeJNIJNI.Node_bid_c_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVector(cPtr, false);
  }

  public void setBid2gid(IntVector value) {
    gtreeJNIJNI.Node_bid2gid_set(swigCPtr, this, IntVector.getCPtr(value), value);
  }

  public IntVector getBid2gid() {
    long cPtr = gtreeJNIJNI.Node_bid2gid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVector(cPtr, false);
  }

  public void setDist2b(SWIGTYPE_p_std__vectorT_long_t value) {
    gtreeJNIJNI.Node_dist2b_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_long_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_long_t getDist2b() {
    long cPtr = gtreeJNIJNI.Node_dist2b_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_long_t(cPtr, false);
  }

  public void setPre_vex(IntVector value) {
    gtreeJNIJNI.Node_pre_vex_set(swigCPtr, this, IntVector.getCPtr(value), value);
  }

  public IntVector getPre_vex() {
    long cPtr = gtreeJNIJNI.Node_pre_vex_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVector(cPtr, false);
  }

  public void setPcls_idx(IntVector value) {
    gtreeJNIJNI.Node_pcls_idx_set(swigCPtr, this, IntVector.getCPtr(value), value);
  }

  public IntVector getPcls_idx() {
    long cPtr = gtreeJNIJNI.Node_pcls_idx_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVector(cPtr, false);
  }

  public void setBid2lgid(IntVector value) {
    gtreeJNIJNI.Node_bid2lgid_set(swigCPtr, this, IntVector.getCPtr(value), value);
  }

  public IntVector getBid2lgid() {
    long cPtr = gtreeJNIJNI.Node_bid2lgid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVector(cPtr, false);
  }

  public Node() {
    this(gtreeJNIJNI.new_Node(), true);
  }

  public void initialize() {
    gtreeJNIJNI.Node_initialize(swigCPtr, this);
  }

  public void stablize() {
    gtreeJNIJNI.Node_stablize(swigCPtr, this);
  }

  public void add_edges2mat() {
    gtreeJNIJNI.Node_add_edges2mat(swigCPtr, this);
  }

  public void add_border(int gid_global, int gid_local) {
    gtreeJNIJNI.Node_add_border(swigCPtr, this, gid_global, gid_local);
  }

  public void add_borders() {
    gtreeJNIJNI.Node_add_borders(swigCPtr, this);
  }

  public void init_matrix() {
    gtreeJNIJNI.Node_init_matrix(swigCPtr, this);
  }

  public void floyd() {
    gtreeJNIJNI.Node_floyd(swigCPtr, this);
  }

  public void sync_dist2father(Node fnode) {
    gtreeJNIJNI.Node_sync_dist2father(swigCPtr, this, Node.getCPtr(fnode), fnode);
  }

  public boolean sync_dist_from_father(Node fnode) {
    return gtreeJNIJNI.Node_sync_dist_from_father(swigCPtr, this, Node.getCPtr(fnode), fnode);
  }

  public void push_up(Node pre_node) {
    gtreeJNIJNI.Node_push_up(swigCPtr, this, Node.getCPtr(pre_node), pre_node);
  }

  public void push_down(Node pre_node, Node fwd_node) {
    gtreeJNIJNI.Node_push_down(swigCPtr, this, Node.getCPtr(pre_node), pre_node, Node.getCPtr(fwd_node), fwd_node);
  }

}
