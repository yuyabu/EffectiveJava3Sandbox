package item10.code2;

import item10.*;

//equals契約を破ることなく値要素を追加する
public class ColorPoint {
	private Point point;
	private Color color;
	
	public ColorPoint(int x, int y, Color color) {
		if(color == null)
			throw new NullPointerException();
		point = new Point(x,y);
		this.color = color;
	}
	/**
	 * このカラーポイントのポイントとしてのビューを返す
	 */
	public Point asPoint() {
		return point;
	}
	
	@Override public boolean equals(Object o) {
		if(!(o instanceof ColorPoint))
			return false;
		ColorPoint cp = (ColorPoint) o;
		return cp.point.equals(point) && cp.color.equals(color);
	}

}
