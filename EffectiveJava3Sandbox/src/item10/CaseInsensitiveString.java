package item10;

public class CaseInsensitiveString {
	private final String s;


	public CaseInsensitiveString(String s) {
		if(s==null)
			throw new NullPointerException();
		this.s = s;
	}
	
	//不完全性- 対称性を守っていない!
	@Override public boolean equals(Object o) {
		if(o instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(
					((CaseInsensitiveString) o).s);
		if(o instanceof String)//一方向の相互作用；
			return s.equalsIgnoreCase((String)o);
		return false;
		}
}
