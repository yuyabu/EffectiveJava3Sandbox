package item8;

public class Code8 {
	
	class Entity{
		public String name;
		@Override
		public void finalize() {
			System.out.println(this.name+"はfinalizeされました");
			
		}
	}
}
