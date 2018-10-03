import java.utils.*;
import Table.java;
import Condition.java;

public class dbCommands {
	
	public static Table createTable(String tableName, ArrayList<Object[]> cols, ArrayList<String> pks) {
		Table t = new Table(tableName, cols, pks);
		return t;
	}
	
	public static void updateTable(Table t, ArrayList<T> cols, String cond) {
		
	}

	public static void insertTable(Table t, ArrayList<Object> cols) {
		t.addTuple(cols.toArray());
	}
	
	public static void deleteFromTable(Table t, Condition c) {
		//delete from animals where kind == dog, kind is column and should be replaced for every tuple's value in the kind column
		
	}
	
	public static void deleteTable(Table t) {
		t = null; //whatever this does its supposed to delete this mf
	}

	public static void showTable(Table t) {
		for (int i = 0; i < t.tuples.size(); i++) {
			
		}
	}
	
}