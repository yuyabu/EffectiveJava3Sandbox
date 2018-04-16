package item10;

public class ColorPoint extends Point{

	private Color color;
	public ColorPoint(int x, int y,Color color) {
		super(x, y);
		this.color = color;
	}
	
	//不完全 - 対称性を守っていない
//	@Override public boolean equals(Object o) {
//		if(!(o instanceof ColorPoint))
//			return false;
//		return super.equals(o) && ((ColorPoint)o).color ==color;
//	}
	//不完全 - 推移性を犠牲にしている
	@Override public boolean equals(Object o) {
		if(!(o instanceof Point))
			return false;
		//oが普通のポイントなら、色を無視した比較をする。
		if(!(o instanceof ColorPoint))
			return o.equals(this);
		//oは、ColorPoint。完全な比較を行う。
		return super.equals(o) && ((ColorPoint) o).color == color;
	}
	
	

}
