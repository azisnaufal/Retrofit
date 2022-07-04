package ac.id.unikom.myapplication.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("meta")
	private Meta meta;

	@SerializedName("results")
	private List<ResultsItem> results;

	public Meta getMeta(){
		return meta;
	}

	public List<ResultsItem> getResults(){
		return results;
	}
}