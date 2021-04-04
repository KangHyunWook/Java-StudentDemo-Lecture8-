class AutoBoxingDemo {
	public static void main(String[] args) {
		System.out.println("========Manually Boxing========");
		Integer iOb = new Integer(28); //boxing
		
		int i = iOb.intValue(); //unboxing, extracting a value from type wrapper
		Number num = iOb;
		
		System.out.println("iOb val: "+iOb);
		System.out.println("i val: "+i);
		System.out.println("========Auto-Boxing========");
		iOb = 100; // auto-boxing
		i = iOb; // auto-unbox
		System.out.println("iOb val: "+iOb);
		System.out.println("i val: "+i);
	}
}