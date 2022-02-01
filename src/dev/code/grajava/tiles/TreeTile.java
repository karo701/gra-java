package dev.code.grajava.tiles;

import dev.code.grajava.gfx.Assets;

public class TreeTile extends Tile{

	public TreeTile(int id) {
		super(Assets.tree, id);
		// TODO Auto-generated constructor stub
	}

	public boolean isSolid() {
		return true;
	}
}
