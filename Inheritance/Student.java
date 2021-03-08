class Student extends Person{
	char grade;
	Student(String name, int age, char grade) {
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	
	public void show() {
		System.out.println(name+" is "+age+" years old\n"
		+"Grade: "+grade);
	}
}	