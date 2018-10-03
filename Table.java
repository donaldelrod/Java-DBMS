import java.util.*;
import java.lang.*;

public class Table {
	public String name;					//name of table
	public ArrayList<String[]> cols;	//the names and types of columns
	public ArrayList<Object[]> tuples;  //all the tuples with data corresponding to cols
	public ArrayList<String> pks;		//the primary keys for this table
	
	public void Table(String ntableName, ArrayList<Object[]> ncols, ArrayList<String> npks) {
		this.name = ntableName;
		this.cols = ncols;
		this.pks = npks;
		this.tuples = new ArrayList<Object[]>();
	}
	
	public void addTuple(Object[] tuple) {
		tuples.add(tuple);
	}
	
	public Object getColFromTuple(int rowIndex, int colIndex) {
		return tuples.get(rowIndex)[colIndex];
	}
	
	public String stringifyTuple(int rowIndex) {
		Object[] tuple = tuples.get(rowIndex);
		String s = "";
		for (Object o : tuple) {
			s += o.toString() + '\t';
		}
		return s;
	}
}