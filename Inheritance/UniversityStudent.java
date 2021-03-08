class UniversityStudent extends Student {
	String major;
	UniversityStudent(String name, int age, char grade, String major) {
		super(name, age, grade);
		this.major = major;
	}

	//overriding ->Dynamic method dispatch -> Polymorphism
	public void show() {
		super.show();
		System.out.println("major: "+major);
	}
}