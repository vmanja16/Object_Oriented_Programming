class LongList implements MyList {
	long data;
	LongList next;
	public LongList(LongList n, long data){
		this.data = data;
		this.next = n;
	}
	public LongList ( int data){
		this.data = data;
		this.next = null;
	}
	public MyList next(){
		return (LongList)this.next;
	}
	public long getData(){
		return this.data;
	}
	public void printNode(){
		System.out.println("LongList Node, data is: " + this.data);
	} 
	public Object clone()throws CloneNotSupportedException{
		LongList head = (LongList)super.clone();
		LongList new_ptr = head;
		LongList old_ptr = this.next;
		while (old_ptr != null){
			new_ptr.next = (LongList) old_ptr.clone();
			new_ptr = new_ptr.next;
			old_ptr = old_ptr.next;
		}
		new_ptr.next = null;
		return head;
	}
}