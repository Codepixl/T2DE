package net.codepixl.t2de.world.tile;

import net.codepixl.t2de.util.Color4f;

/**
 * Created by aaron on 2/26/2017.
 */
public class ColorTile extends Tile{
	private Color4f color;
	public ColorTile(Color4f color){
		super();
		this.color = color;
	}
	@Override
	public Color4f getColor(){
		return color;
	}
}
