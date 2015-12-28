package com.mcnc.yuga.model.YG0200;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 */
public class YG0200Response_Body_project {
	/**
	 * id
	 */
	private String id = "";
	/**
	 * fri
	 */
	private Double fri = 0D;
	/**
	 * mon
	 */
	private Double mon = 0D;
	/**
	 * sat
	 */
	private Double sat = 0D;
	/**
	 * tpID
	 */
	private String tpID = "";
	/**
	 * sun
	 */
	private Double sun = 0D;
	/**
	 * name
	 */
	private String name = "";
	/**
	 * thu
	 */
	private Double thu = 0D;
	/**
	 * tue
	 */
	private Double tue = 0D;
	/**
	 * wed
	 */
	private Double wed = 0D;
	/**
	 * projectTypeID
	 */
	private String projectTypeID = "";
	/**
	 * status
	 */
	private String status = "";
	/**
	 * tcID
	 */
	private String tcID = "";

	public YG0200Response_Body_project() {
	}

	public YG0200Response_Body_project(JsonNode jsonNode) {
		this.id = jsonNode.path("id").getTextValue();
		this.fri = jsonNode.path("fri").getDoubleValue();
		this.mon = jsonNode.path("mon").getDoubleValue();
		this.sat = jsonNode.path("sat").getDoubleValue();
		this.tpID = jsonNode.path("tpID").getTextValue();
		this.sun = jsonNode.path("sun").getDoubleValue();
		this.name = jsonNode.path("name").getTextValue();
		this.thu = jsonNode.path("thu").getDoubleValue();
		this.tue = jsonNode.path("tue").getDoubleValue();
		this.wed = jsonNode.path("wed").getDoubleValue();
		this.projectTypeID = jsonNode.path("projectTypeID").getTextValue();
		this.status = jsonNode.path("status").getTextValue();
		this.tcID = jsonNode.path("tcID").getTextValue();
	}

	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("fri")
	public Double getFri() {
		return this.fri;
	}

	public void setFri(Double fri) {
		this.fri = fri;
	}

	@JsonProperty("mon")
	public Double getMon() {
		return this.mon;
	}

	public void setMon(Double mon) {
		this.mon = mon;
	}

	@JsonProperty("sat")
	public Double getSat() {
		return this.sat;
	}

	public void setSat(Double sat) {
		this.sat = sat;
	}

	@JsonProperty("tpID")
	public String getTpID() {
		return this.tpID;
	}

	public void setTpID(String tpID) {
		this.tpID = tpID;
	}

	@JsonProperty("sun")
	public Double getSun() {
		return this.sun;
	}

	public void setSun(Double sun) {
		this.sun = sun;
	}

	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("thu")
	public Double getThu() {
		return this.thu;
	}

	public void setThu(Double thu) {
		this.thu = thu;
	}

	@JsonProperty("tue")
	public Double getTue() {
		return this.tue;
	}

	public void setTue(Double tue) {
		this.tue = tue;
	}

	@JsonProperty("wed")
	public Double getWed() {
		return this.wed;
	}

	public void setWed(Double wed) {
		this.wed = wed;
	}

	@JsonProperty("projectTypeID")
	public String getProjectTypeID() {
		return this.projectTypeID;
	}

	public void setProjectTypeID(String projectTypeID) {
		this.projectTypeID = projectTypeID;
	}

	@JsonProperty("status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("tcID")
	public String getTcID() {
		return this.tcID;
	}

	public void setTcID(String tcID) {
		this.tcID = tcID;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0200Response_Body_project [");
		builder.append("id=").append(id);
		builder.append(", ");
		builder.append("fri=").append(fri);
		builder.append(", ");
		builder.append("mon=").append(mon);
		builder.append(", ");
		builder.append("sat=").append(sat);
		builder.append(", ");
		builder.append("tpID=").append(tpID);
		builder.append(", ");
		builder.append("sun=").append(sun);
		builder.append(", ");
		builder.append("name=").append(name);
		builder.append(", ");
		builder.append("thu=").append(thu);
		builder.append(", ");
		builder.append("tue=").append(tue);
		builder.append(", ");
		builder.append("wed=").append(wed);
		builder.append(", ");
		builder.append("projectTypeID=").append(projectTypeID);
		builder.append(", ");
		builder.append("status=").append(status);
		builder.append(", ");
		builder.append("tcID=").append(tcID);
		builder.append("]");
		return builder.toString();
	}
}