package net.codepixl.t2de.util.math;

/**
 * Created by aaron on 2/26/2017.
 */
public class Vector3f {
	public float x = 0,y = 0,z = 0;
	public Vector3f(){}
	public Vector3f(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector3f(Vector3f a){
		this.x = a.x;
		this.y = a.y;
		this.z = a.z;
	}
}
