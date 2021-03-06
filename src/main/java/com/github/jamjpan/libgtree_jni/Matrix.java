/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.jamjpan.libgtree_jni;

public class Matrix {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Matrix(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Matrix obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gtreeJNIJNI.delete_Matrix(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setN(long value) {
    gtreeJNIJNI.Matrix_n_set(swigCPtr, this, value);
  }

  public long getN() {
    return gtreeJNIJNI.Matrix_n_get(swigCPtr, this);
  }

  public void setA(SWIGTYPE_p_long value) {
    gtreeJNIJNI.Matrix_a_set(swigCPtr, this, SWIGTYPE_p_long.getCPtr(value));
  }

  public SWIGTYPE_p_long getA() {
    long cPtr = gtreeJNIJNI.Matrix_a_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_long(cPtr, false);
  }

  public Matrix() {
    this(gtreeJNIJNI.new_Matrix(), true);
  }

  public void init(long n, int default_value) {
    gtreeJNIJNI.Matrix_init__SWIG_0(swigCPtr, this, n, default_value);
  }

  public void init(long n) {
    gtreeJNIJNI.Matrix_init__SWIG_1(swigCPtr, this, n);
  }

  public SWIGTYPE_p_long __bracket__(int x) {
    long cPtr = gtreeJNIJNI.Matrix___bracket__(swigCPtr, this, x);
    return (cPtr == 0) ? null : new SWIGTYPE_p_long(cPtr, false);
  }

}
