package net.codepixl.t2de.util;

/**
 * Created by aaron on 2/26/2017.
 */
public class Color4f {
	public static Color4f RED = new Color4f(1,0,0,1);
	public static Color4f GREEN = new Color4f(0,1,0,1);
	public static Color4f BLUE = new Color4f(0,0,1,1);
	public static Color4f BLACK = new Color4f(0,0,0,1);
	public static Color4f WHITE = new Color4f(1,1,1,1);
	public static Color4f TRANSPARENT = new Color4f(0,0,0,0);

	public float r,g,b,a;
	public Color4f(float r, float g, float b, float a){
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}
	public Color4f(Color4f a){
		this.r = a.r;
		this.g = a.g;
		this.b = a.b;
		this.a = a.a;
	}
}
