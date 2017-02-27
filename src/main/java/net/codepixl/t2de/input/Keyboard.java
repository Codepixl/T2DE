package net.codepixl.t2de.input;

import java.awt.event.KeyEvent;
import java.util.HashMap;

/**
 * Created by aaron on 2/26/2017.
 */
public class Keyboard{
	private static HashMap<Integer, Boolean> keys = new HashMap<Integer, Boolean>();

	public static void __keyPressed(int k) {
		keys.put(k, true);
	}

	public static void __keyReleased(int k) {
		keys.put(k, false);
	}

	public static boolean isKeyDown(int key){
		return keys.getOrDefault(key, false);
	}
}
