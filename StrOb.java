class StrOb {
	
	String data;
	
	void insert(String data) {
		this.data = data; //this refers to the current class
	}
	
	String getData() {
		return data;
	}
}