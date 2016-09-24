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
	public Object clone() throws CloneNotSupportedException{
		IntList head = (IntList)super.clone();
		IntList new_ptr = head;
		IntList old_ptr = this.next;
		while (old_ptr != null){
			new_ptr.next = (IntList) old_ptr.clone();
			new_ptr = new_ptr.next;
			old_ptr = old_ptr.next;
		}
		new_ptr.next = null;
		return head;
	}
		
}