package item32;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		
		Code code = new Code();
		code.cantUserGenericsAndVarargs(null);
		List<String> tempList = List.of("test","32");
		List<String> tempList2 = List.of("test2","32");
		code.cantUserGenericsAndVarargs(tempList,tempList2);
		
		
	}

}
