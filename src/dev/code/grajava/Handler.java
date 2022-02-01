package dev.code.grajava;

import dev.code.grajava.gfx.GameCamera;
import dev.code.grajava.input.KeyManager;
import dev.code.grajava.worlds.World;

public class Handler {
	
	private Game game;
	private World world;

	public void setGame(Game game) {
		this.game = game;
	}
	
	public GameCamera getGameCamera() {
		return game.getGameCamera();
	}
	
	public KeyManager getKeyManager() {
		return game.getKeyManager();
	}
	
	
	public int getWidth() {
		return game.getWidth();
	}
	
	public int getHeight() {
		return game.getHeight();
	}
	
	public Handler(Game game) {
		this.game = game;
	}

	public Game getGame() {
		return game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
