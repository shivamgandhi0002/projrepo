package example;

public class Circle12 {
	int radius;
	private static float pi=3.14f;
	
	public Circle12(int radius) {
		super();
		this.radius = radius;
		
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public static float getPi() {
		return pi;
	}

	public static void setPi(float pi) {
		Circle12.pi = pi;
	}
	
	public float getArea() {
		return pi*this.radius*this.radius;
	}
		
		
		public float getPerimeter() {
			return 2*pi*this.radius;
	}
	
	

}
