import java.lang.*; 	
import java.util.*;
class MatrixMultiply{
	public int N;
	public int [][] A;
	public int [][] B;
	public int [][] C;
	public MatrixMultiply(int N){
		this.N = N;
	}
	public void run(){
		callFill(N);
	}

	public void callFill(int dim){
		try{fill(dim);}
		catch (DimensionException e){
			System.out.print("Please enter a valid dimension: ");
			Scanner scan = new Scanner(System.in);
            dim = scan.nextInt();
            callFill(dim);
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
				B[i][j] = rand.nextInt(10);
				C[i][j] = rand.nextInt(10);
			}
		}
	}

} // end class