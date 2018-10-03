import java.util.*;
import Type.java;
import IntegerT.java;
import VARCHAR.java;


public class Condition {
	public Object x;
	public Object y;
	public String op;
	boolean ret;
	
	String operations[] = {"==", "<=", ">=", "!=", "<", ">"};
	
	//after the object is created, the result of the condition can be found by accessing the member "ret"
	public Condition (Object a, Object b, String nop) {
		this.x = a;
		this.y = b;
		this.op = nop;
		
		
		if (x instanceof VARCHAR && y instanceof VARCHAR) {
			
			String xs = (String)x;
			String ys = (String)y;
			
			if (this.op.equals("==")) 
				ret = xs.equals(ys);
			else if (this.op.equals("!="))
				ret = !xs.equals(ys);
			else ret = false;
		}
		else if (x instanceof IntegerT && y instanceof IntegerT) {
			
			int xi = (int)x;
			int yi = (int)y;
			
			
			switch (nop) {
			case ">":
				ret = xi > yi;
				break;
			case "<":
				ret = xi < yi;
				break;
			case ">=":
				ret = xi >= yi;
				break;
			case "<=":
				ret = xi <= yi;
				break;
			case "==":
				ret = xi == yi;
				break;
			case "!=":
				ret = xi != yi;
				break;
			}
		}
		else ret = false; //we need to throw some sort of error here if the types mismatch or if an op is called on unsupported types
	}	
}
