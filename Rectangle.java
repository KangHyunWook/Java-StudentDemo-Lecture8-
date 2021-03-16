class Rectangle extends TwoDShape {
	Rectangle() {
		super();
	}
	
	Rectangle(double w, String n) {
		super(w, n);
	}
	
	Rectangle(double w, double h, String n) {
		super(w, h, n);
	}
	
	@Override 
	double area() {
		return width*height;
	}
}