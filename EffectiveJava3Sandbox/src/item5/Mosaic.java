package item5;

import java.util.function.Supplier;

public class Mosaic {
	
	Mosaic create(Supplier<? extends Tile> tileFactory) {
		return new Mosaic(tileFactory.get());
	}
	Mosaic(){}
	Mosaic(Tile tile){	
		this.tile = tile;
	}
	private Tile tile;
	
	public String asText() {
		return null;
		//return "this is "+tile.+""
	}
}
