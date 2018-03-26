package item5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

class Test5 {

	@Test
	void test() {
		Supplier<Tile> redTileFactory = () -> new Tile("red");
		Supplier<Tile> blueTileFactory = () -> new Tile("blue");
		Supplier<Tile> yellowTileFactory = () -> new Tile("yellow");
		Mosaic redMosaic = Mosaic.create(redTileFactory);
		Mosaic blueMosaic = Mosaic.create(blueTileFactory);
		Mosaic yellowMosaic = Mosaic.create(yellowTileFactory);
		
		System.out.println(redMosaic.asText());//this is red color mosaic
		System.out.println(blueMosaic.asText());//this is blue color mosaic
		System.out.println(yellowMosaic.asText());//this is yellow color mosaic
	}

}
