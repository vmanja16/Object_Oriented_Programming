class LongList implements MyList {
	long data;
	LongList next;
	public LongList(LongList n, long data){
		this.data = data;
		this.next = n;
	}
	public LongList (int data){
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
		System.out.print("LongList Node, data is: " + this.data);
	} 
}