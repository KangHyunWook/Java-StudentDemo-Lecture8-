class StudentDemo {
	public static void main(String[] args) {
		
		Student student = new Student("Jacob", 17, 'B');
		UniversityStudent uniStudent = 
			new UniversityStudent("Michael", 23, 'A', "CompSci");
		
		System.out.println("A student info:");
		student.show();
		
		System.out.println("A university student info: ");
		uniStudent.show();
		System.out.println("=========================");
		
		//Superclass reference
		Person p;
		System.out.println("Student: ");
		p = student; //Strongly typed language compatibility
		p.show(); //polymorphism
		System.out.println("Uni student: ");
		p = uniStudent;
		p.show();
		
	}
}