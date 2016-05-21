package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Statement implements Cloneable {

	private String sql;
	private List<String> parameters;
	private Record record;
	
	public Statement(String sql, List<String> parameters, Record record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}
	
	@Override
	protected Statement clone() {
		
		try {
			return (Statement) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	// getters
	public String getSql() {
		return sql;
	}
	
	public List<String> getParameters() {
		return parameters;
	}

	public Record getRecord() {
		return record;
	}

}
