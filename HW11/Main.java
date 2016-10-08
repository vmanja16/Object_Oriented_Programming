import java.util.*;
class Main{
	public static int N;
	public int dim;

	public Main(){}

	public static void main(String[] args){
		N = Integer.parseInt(args[0]);
		MatrixMultiply mult = new MatrixMultiply(N);
		mult.run();
	} 




}