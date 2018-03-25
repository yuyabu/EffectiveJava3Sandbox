package item85;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	//sample from:https://www.ibm.com/developerworks/jp/java/library/j-5things1/index.html
	void test() {
		{
			try {
				Person ted = new Person("Ted", "Neward", 39);
				Person charl = new Person("Charlotte", "Neward", 38);
				ted.setSpouse(charl);
				charl.setSpouse(ted);
				FileOutputStream fos = new FileOutputStream("tempdata.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(ted);
				oos.close();
			} catch (Exception ex) {
				fail("Exception thrown during test: " + ex.toString());
			}
			try {
				FileInputStream fis = new FileInputStream("tempdata.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Person ted = (Person) ois.readObject();
				ois.close();
				assertEquals(ted.getFirstName(), "Ted");
				assertEquals(ted.getSpouse().getFirstName(), "Charlotte");
				// Clean up the file
				new File("tempdata.ser").delete();
			} catch (Exception ex) {
				fail("Exception thrown during test: " + ex.toString());
			}
		}
	}

}
