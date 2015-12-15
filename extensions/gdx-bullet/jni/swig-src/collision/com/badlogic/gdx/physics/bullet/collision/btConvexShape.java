/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConvexShape extends btCollisionShape {
	private long swigCPtr;
	
	protected btConvexShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btConvexShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConvexShape, normally you should not need this constructor it's intended for low-level usage. */
	public btConvexShape(long cPtr, boolean cMemoryOwn) {
		this("btConvexShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btConvexShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btConvexShape obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btConvexShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public Vector3 localGetSupportingVertex(Vector3 vec) {
	return CollisionJNI.btConvexShape_localGetSupportingVertex(swigCPtr, this, vec);
}

  public Vector3 localGetSupportingVertexWithoutMargin(Vector3 vec) {
	return CollisionJNI.btConvexShape_localGetSupportingVertexWithoutMargin(swigCPtr, this, vec);
}

  public Vector3 localGetSupportVertexWithoutMarginNonVirtual(Vector3 vec) {
	return CollisionJNI.btConvexShape_localGetSupportVertexWithoutMarginNonVirtual(swigCPtr, this, vec);
}

  public Vector3 localGetSupportVertexNonVirtual(Vector3 vec) {
	return CollisionJNI.btConvexShape_localGetSupportVertexNonVirtual(swigCPtr, this, vec);
}

  public float getMarginNonVirtual() {
    return CollisionJNI.btConvexShape_getMarginNonVirtual(swigCPtr, this);
  }

  public void getAabbNonVirtual(Matrix4 t, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btConvexShape_getAabbNonVirtual(swigCPtr, this, t, aabbMin, aabbMax);
  }

  public void project(Matrix4 trans, Vector3 dir, SWIGTYPE_p_float minProj, SWIGTYPE_p_float maxProj, Vector3 witnesPtMin, Vector3 witnesPtMax) {
    CollisionJNI.btConvexShape_project(swigCPtr, this, trans, dir, SWIGTYPE_p_float.getCPtr(minProj), SWIGTYPE_p_float.getCPtr(maxProj), witnesPtMin, witnesPtMax);
  }

  public void batchedUnitVectorGetSupportingVertexWithoutMargin(btVector3 vectors, btVector3 supportVerticesOut, int numVectors) {
    CollisionJNI.btConvexShape_batchedUnitVectorGetSupportingVertexWithoutMargin(swigCPtr, this, btVector3.getCPtr(vectors), vectors, btVector3.getCPtr(supportVerticesOut), supportVerticesOut, numVectors);
  }

  public void getAabbSlow(Matrix4 t, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btConvexShape_getAabbSlow(swigCPtr, this, t, aabbMin, aabbMax);
  }

  public int getNumPreferredPenetrationDirections() {
    return CollisionJNI.btConvexShape_getNumPreferredPenetrationDirections(swigCPtr, this);
  }

  public void getPreferredPenetrationDirection(int index, Vector3 penetrationVector) {
    CollisionJNI.btConvexShape_getPreferredPenetrationDirection(swigCPtr, this, index, penetrationVector);
  }

}
