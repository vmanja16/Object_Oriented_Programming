import java.lang.*;
import java.io.*;

public class test {
	public test(){}
	public static void main (String[] args){
	
	
	Integer i1 = new Integer(0);
	Integer i2 = new Integer(10);
	Long i3 = new Long(7);
	Double x = new Double(22);
	
	Long l1 = IntegerArithmetic.divide(i2, i1);
	Long l2 = IntegerArithmetic.subtract(i3, i1);
	Long fail = IntegerArithmetic.multiply(i3, x);
	System.out.println(l1);
	System.out.println(l2);
	
	
	}
	
}
