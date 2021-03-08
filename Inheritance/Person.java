class Person {
	String name;
	int age;
	
	Person() {
	}
	
	Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+" is "+age+" years old.");
	}
}