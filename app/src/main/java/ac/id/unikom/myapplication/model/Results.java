package ac.id.unikom.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Results{

	@SerializedName("total")
	private int total;

	@SerializedName("limit")
	private int limit;

	@SerializedName("skip")
	private int skip;

	public int getTotal(){
		return total;
	}

	public int getLimit(){
		return limit;
	}

	public int getSkip(){
		return skip;
	}
}