class IntList implements MyList {
	int data;
	IntList next;
	public IntList(IntList n, int data){
		this.data = data;
		this.next = n;
	}
	public IntList (int data){
		this.data = data;
		this.next = null;
	}
	public MyList next(){
		return (IntList)this.next;
	}
	public int getData(){
		return this.data;
	}
	public void printNode(){
		System.out.print("IntList Node, data is: " + this.data);
	} 
}