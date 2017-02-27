package net.codepixl.t2de.world;

import net.codepixl.t2de.T2DE;
import net.codepixl.t2de.input.Keyboard;
import net.codepixl.t2de.world.tile.Tile;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLUtil;

import java.util.Random;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

/**
 * Created by aaron on 2/26/2017.
 */
public class WorldManager {
	private byte[][] tiles = new byte[20][20];
	private Random rand = new Random();
	public float cX = 0, cY = 0;
	public WorldManager(){
		Tile.registerTiles();
		for(int x = 0; x < 20; x++){
			for(int y = 0; y < 20; y++)
				tiles[x][y] = (byte) rand.nextInt(3);
		}
	}
	public void render(){
		glBegin(GL_QUADS);              // Each set of 4 vertices form a quad
		for(int x = -10; x < 10; x++){
			for(int y = -10; y < 10; y++){
				Tile t = Tile.getTileById(tiles[x+10][y+10]);
				float rx = (x - cX) * T2DE.zoomLevel;
				float ry = (y - cY) * T2DE.zoomLevel;
				GL11.glBegin(GL11.GL_QUADS);
					glColor3f(t.getColor().r, t.getColor().g, t.getColor().b); // Red
					glVertex2f(rx,ry);    // x, y
					glVertex2f(rx+T2DE.zoomLevel, ry);
					glVertex2f( rx+T2DE.zoomLevel, ry+T2DE.zoomLevel);
					glVertex2f(rx,  ry+T2DE.zoomLevel);
				GL11.glEnd();
			}
		}
		glEnd();


		if(Keyboard.isKeyDown(GLFW_KEY_W)) cY++;
		if(Keyboard.isKeyDown(GLFW_KEY_A)) cX--;
		if(Keyboard.isKeyDown(GLFW_KEY_S)) cY--;
		if(Keyboard.isKeyDown(GLFW_KEY_D)) cX++;
	}
}
