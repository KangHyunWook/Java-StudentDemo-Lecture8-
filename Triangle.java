class Triangle extends TwoDShape {
	
	Triangle() {
		super();
	}
	
	Triangle(TwoDShape ob) {
		super(ob);
	}
	
	Triangle(double w, double h, String n) {
		super(w, h, n);
	}
	
	double area() {
		return width*height/2.0;
	}
}