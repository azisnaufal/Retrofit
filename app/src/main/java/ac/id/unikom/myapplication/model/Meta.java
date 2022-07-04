package ac.id.unikom.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Meta{

	@SerializedName("license")
	private String license;

	@SerializedName("last_updated")
	private String lastUpdated;

	@SerializedName("terms")
	private String terms;

	@SerializedName("results")
	private Results results;

	@SerializedName("disclaimer")
	private String disclaimer;

	public String getLicense(){
		return license;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public String getTerms(){
		return terms;
	}

	public Results getResults(){
		return results;
	}

	public String getDisclaimer(){
		return disclaimer;
	}
}