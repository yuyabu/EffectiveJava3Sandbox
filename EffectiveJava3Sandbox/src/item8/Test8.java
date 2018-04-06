package item8;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test8 {

	@Test
	void test() {
		Entity entity = new Entity("たかしくん");
		entity = null;
		System.gc();
	}

}
