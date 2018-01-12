package item3;

public class Paul {
	private static final Paul INSTANCE = new Paul();
	private Paul() {}
	public static Paul getInstance() {
		return INSTANCE;
	}
	public void loveMeDo() {}
}
