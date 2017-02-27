package net.codepixl.t2de.util.math;

/**
 * Created by aaron on 2/26/2017.
 */
public class Math {
	public static float clamp(float a, float min, float max){
		if(a > max) a = max;
		if(a < min) a = min;
		return a;
	}
}
