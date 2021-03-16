abstract class TwoDShape {
	double width;
	double height;
	String name;
	TwoDShape ob;
	
	TwoDShape() {
		width = 0.0;
		height = 0.0;
		name="none";
	}
	
	TwoDShape(double val, String n) {
		width = height = val;
		name = n;
	}
	
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
	TwoDShape(TwoDShape ob) {
		width = ob.getWidth();
		height = ob.getHeight();
		name = ob.getName();
	}
	
	double getWidth() {return width; }
	double getHeight() {return height; }
	String getName() {return name;}
	
	abstract double area();

}