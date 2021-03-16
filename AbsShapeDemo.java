class AbsShapeDemo {
	public static void main(String[] args) {
		TwoDShape []shapes = new TwoDShape[4];
					
		shapes[0] = new Rectangle(4.0, "Regular Rectangle"); //길이가 4인 정사각형
		shapes[1] = new Rectangle(2.0, 5.0, "Rectangle"); //넓이와 높이가 2, 5인 직사각형
		shapes[2] = new Triangle(5.0, 7.0, "Triangle"); //넓이와 높이가 5, 7인 삼각형.
		shapes[3] = new Triangle(shapes[2]); //shapes[2]와 같은 도형
		for (int i=0; i<4; i++) {
			System.out.println("Shape: "+ shapes[i].getName());
			System.out.println("Area: "+shapes[i].area());
			System.out.println();
		}
	}	
}		