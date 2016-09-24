import java.lang.*;
class IntegerArithmetic {
	
	public IntegerArithmetic(){}
	public static Long add(Object op1, Object op2){
		long l1 = getPrimitiveLong(op1);
		long l2 = getPrimitiveLong(op2);
		return new Long(l1+l2);
	}
	public static Long subtract(Object op1, Object op2){		
		long l1 = getPrimitiveLong(op1);
		long l2 = getPrimitiveLong(op2);
		return new Long(l1-l2);
	}
	public static Long multiply(Object op1, Object op2){		
		long l1 = getPrimitiveLong(op1);
		long l2 = getPrimitiveLong(op2);
		return new Long(l1*l2);
	}
	public static Long divide(Object op1, Object op2){
		long l1 = getPrimitiveLong(op1);
		long l2 = getPrimitiveLong(op2);
		if (l2 == 0){throw new IllegalArgumentException("Divisor is 0!");}
		return new Long(l1/l2);
	}
	private static long getPrimitiveLong(Object obj){
		if (obj instanceof Integer){ return (long)( (Integer) obj).intValue();}
		if (obj instanceof Long){ return (long)( (Long) obj).intValue();}
		throw new IllegalArgumentException("Argument " + obj + " is not a valid type!");
	}
}