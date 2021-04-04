class GenDemo{
	public static void main(String[] args) {
		Gen<String> str = new Gen<>();
		str.insert("Hello Generic");
		System.out.println(str.getData());
		
		Gen<Integer> intOb = new Gen<>();
		intOb.insert(73);
		System.out.println("Data: "+intOb.getData());
	}

}