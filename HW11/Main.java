import java.util.*;
class Main{
	public static int N;
	public int dim;
	public static int[][] A;
	public static long start_time;

	public Main(){}

	public static void main(String[] args){
		if (args.length == 1){N = Integer.parseInt(args[0]);}
		else{N = 0;}
		Matrix matrix = new Matrix(N);
		matrix.callFill();
		
		// ONE THREAD
		Thread zero = new MatrixMultiply(matrix, 0, N, 0, N);
		long start_time = System.currentTimeMillis();
		zero.start();
		try{zero.join();}
		catch(InterruptedException err) {}
		printTime(System.currentTimeMillis() - start_time, 1);

		// TWO THREADS
		zero = new MatrixMultiply(matrix, 0, N/2, 0, N);
		Thread one = new MatrixMultiply(matrix, N/2, N, 0, N);
		start_time = System.currentTimeMillis();

		zero.start(); one.start();
		try{zero.join(); one.join();}
		catch(InterruptedException err) {}
		printTime(System.currentTimeMillis() - start_time, 2);

		// FOUR THREADS
		zero = new MatrixMultiply(matrix, 0, N/2, 0, N/2);
		one = new MatrixMultiply(matrix, 0, N/2, N/2, N);
		Thread two = new MatrixMultiply(matrix, N/2, N, 0, N/2);
		Thread three = new MatrixMultiply(matrix, N/2, N, N/2, N);		
		start_time = System.currentTimeMillis();

		zero.start(); one.start(); two.start(); three.start();
		try{zero.join(); one.join();}
		catch(InterruptedException err) {}
		printTime(System.currentTimeMillis() - start_time, 4);


	} 

	public static void printTime(long run_time, int num_threads){
		System.out.println(num_threads + " Thread Runtime: " + Long.toString(run_time) 
			             + " milliseconds");
	}


}