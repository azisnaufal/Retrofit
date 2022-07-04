package ac.id.unikom.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class ResultsItem{

	@SerializedName("country")
	private String country;

	@SerializedName("city")
	private String city;

	@SerializedName("address_1")
	private String address1;

	@SerializedName("reason_for_recall")
	private String reasonForRecall;

	@SerializedName("address_2")
	private String address2;

	@SerializedName("classification")
	private String classification;

	@SerializedName("openfda")
	private Openfda openfda;

	@SerializedName("recalling_firm")
	private String recallingFirm;

	@SerializedName("recall_number")
	private String recallNumber;

	@SerializedName("product_quantity")
	private String productQuantity;

	@SerializedName("code_info")
	private String codeInfo;

	@SerializedName("initial_firm_notification")
	private String initialFirmNotification;

	@SerializedName("center_classification_date")
	private String centerClassificationDate;

	@SerializedName("product_type")
	private String productType;

	@SerializedName("event_id")
	private String eventId;

	@SerializedName("more_code_info")
	private String moreCodeInfo;

	@SerializedName("distribution_pattern")
	private String distributionPattern;

	@SerializedName("recall_initiation_date")
	private String recallInitiationDate;

	@SerializedName("state")
	private String state;

	@SerializedName("product_description")
	private String productDescription;

	@SerializedName("postal_code")
	private String postalCode;

	@SerializedName("voluntary_mandated")
	private String voluntaryMandated;

	@SerializedName("report_date")
	private String reportDate;

	@SerializedName("status")
	private String status;

	public String getCountry(){
		return country;
	}

	public String getCity(){
		return city;
	}

	public String getAddress1(){
		return address1;
	}

	public String getReasonForRecall(){
		return reasonForRecall;
	}

	public String getAddress2(){
		return address2;
	}

	public String getClassification(){
		return classification;
	}

	public Openfda getOpenfda(){
		return openfda;
	}

	public String getRecallingFirm(){
		return recallingFirm;
	}

	public String getRecallNumber(){
		return recallNumber;
	}

	public String getProductQuantity(){
		return productQuantity;
	}

	public String getCodeInfo(){
		return codeInfo;
	}

	public String getInitialFirmNotification(){
		return initialFirmNotification;
	}

	public String getCenterClassificationDate(){
		return centerClassificationDate;
	}

	public String getProductType(){
		return productType;
	}

	public String getEventId(){
		return eventId;
	}

	public String getMoreCodeInfo(){
		return moreCodeInfo;
	}

	public String getDistributionPattern(){
		return distributionPattern;
	}

	public String getRecallInitiationDate(){
		return recallInitiationDate;
	}

	public String getState(){
		return state;
	}

	public String getProductDescription(){
		return productDescription;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public String getVoluntaryMandated(){
		return voluntaryMandated;
	}

	public String getReportDate(){
		return reportDate;
	}

	public String getStatus(){
		return status;
	}
}