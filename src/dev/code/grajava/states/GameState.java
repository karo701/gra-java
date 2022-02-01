package dev.code.grajava.states;

import java.awt.Graphics;

import dev.code.grajava.Handler;
import dev.code.grajava.entities.creatures.Player;
import dev.code.grajava.tiles.Tile;
import dev.code.grajava.worlds.World;

public class GameState extends State{

	private Player player;
	private World world; 
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "res/world/world1.txt");
		handler.setWorld(world);
		player = new Player(handler, 100, 100);
		
		
	}
	@Override
	public void update() {
		world.update();
		player.update();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
		//Tile.tiles[0].render(g, 0, 0);
		
	}

}
