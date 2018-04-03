public class Wall extends Block{
	private int x, y, wid, height;
	private int left, right, top, bottom;
//	public Wall() {
//		setLeft(0);
//		setRight(1000);
//		setTop(0);
//		setBottom(600);
//	}

	public Wall(int l, int r, int t, int b) {
		// TODO Auto-generated constructor stub
		setLeft(l);
		setLeft(r);
		setTop(t);
		setBottom(b);
	}
	public void setLeft(int l) {
		// TODO Auto-generated method stub
		left = l;
	}
	public void setRight(int r) {
		// TODO Auto-generated method stub
		right = r;
	}
	public void setTop(int t) {
		top = t;
	}
	public void setBottom(int b) {
		bottom = b;
	}
	public int getLeft() {
		return left;
	}
	public int getRight() {
		return right;
	}
	public int getTop() {
		return top;
	}
	public int getBottom() {
		// TODO Auto-generated method stub
		return bottom;
	}
}