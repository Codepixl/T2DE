package net.codepixl.t2de.world.tile;

import net.codepixl.t2de.util.Color4f;

import java.util.HashMap;

/**
 * Created by aaron on 2/26/2017.
 */
public class Tile {
	private static HashMap<Byte, Tile> tileMap = new HashMap<Byte,Tile>();
	private static byte cid = 0;

	public static Tile tileRed = new ColorTile(Color4f.RED);
	public static Tile tileGreen = new ColorTile(Color4f.GREEN);
	public static Tile tileBlue = new ColorTile(Color4f.BLUE);

	private final byte id;

	public Tile(){
		this.id = cid++;
		System.out.println("Registering tile "+this);
		tileMap.put(this.id, this);
	}

	public Color4f getColor(){
		return Color4f.WHITE;
	}

	public static final Tile getTileById(Number id){
		return tileMap.get(id);
	}

	public static final void registerTiles(){} //dummy method to initialize static fields

	public String toString(){
		return getClass()+" ("+id+")";
	}
}
