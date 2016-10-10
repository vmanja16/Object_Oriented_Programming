import java.lang.*; 	
import java.util.*;
class Matrix{
	public int N;
	public int [][] A;
	public int [][] B;
	public int [][] C;
	public Matrix(int N){
		this.N = N;
	}
	public void multiply(int number_of_threads){
		// 1 Thread
		if (number_of_threads == 1){
			long diff = System.currentTimeMillis();
			for (int r = 0; r < N; r++){
				for(int c = 0; c < N; c++){
					A[r][c] = 0;
					for(int i = 0; i < N; i++){
						A[r][c] += A[r][i] * B[i][c];
					} 

				}
			}
			diff  = System.currentTimeMillis() - diff;
			System.out.println(diff);
		}
		// 2 Threads
		if (number_of_threads == 2){
			long diff = System.currentTimeMillis();

		}
	}
	public void callFill(){
		try{fill(N);}
		catch (DimensionException e){
			System.out.print("Please enter a valid dimension: ");
			Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            callFill();
		}
	}
	public void fill(int N) throws DimensionException{
		if ((N % 2 != 0) || (N <1) ){
			throw new DimensionException(Integer.toString(N));
		}
		A = new int[N][N];
		B = new int[N][N];
		C = new int[N][N];
		Random rand = new Random();

		for (int i = 0; i < N; i++){
			for (int j = 0; j < N; j++){
				B[i][j] = 1;//rand.nextInt(10);
				C[i][j] = 1;//rand.nextInt(10);
			}
		}
	}

} // end class