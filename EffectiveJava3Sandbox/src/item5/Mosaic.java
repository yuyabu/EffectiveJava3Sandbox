package item5;

import java.util.function.Supplier;

public class Mosaic {
	
	static Mosaic create(Supplier<? extends Tile> tileFactory) {
		return new Mosaic(tileFactory.get());
	}
	Mosaic(){}
	Mosaic(Tile tile){	
		this.tile = tile;
	}
	private Tile tile;
	
	public String asText() {
		return "this is "+tile.getColor()+" color mosaic";
	}
}
