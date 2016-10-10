import java.util.*;

class MatrixMultiply extends Thread{
	public Matrix matrix;
	public int thread_number;
	public long run_time;
	public int number_of_threads;
	public int c_start, c_end, r_start, r_end;
	public MatrixMultiply(Matrix matrix, int c_start, int c_end,
		                  int r_start, int r_end){
		this.matrix = matrix;		
		this.c_start = c_start;
		this.c_end = c_end;
		this.r_start = r_start;
		this.r_end = r_end;
	}
	public void multiply(){	
		for (int r = r_start; r < r_end; r++){
			for(int c = c_start; c < c_end; c++){
				matrix.A[r][c] = 0;
				for(int i = 0; i < matrix.N; i++){
					matrix.A[r][c] += matrix.B[r][i] * matrix.C[i][c];
				} 
			}
		}
	}
	public long getThreadTime(){return run_time;}

	public void run(){
		run_time = System.currentTimeMillis();
		multiply();
		run_time = System.currentTimeMillis() - run_time;
	}

} // end class