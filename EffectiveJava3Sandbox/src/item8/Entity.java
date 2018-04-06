package item8;

class Entity{
		public String name;
		@Override
		public void finalize() {
			System.out.println(this.name+"はfinalizeされました");
			
		}
		public Entity(String name) {
			this.name = name;
		}
	}
