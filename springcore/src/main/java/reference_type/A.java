package reference_type;

public class A {

	private int x;
	private B ob;
	public int getX() {
		return x;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	public A() {
		super();
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
}
