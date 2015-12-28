package com.mcnc.yuga.model.YG0210;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 */
public class YG0210Request_Body_projects {
	/**
	 * tpID
	 */
	private String tpID = "";
	/**
	 * wed
	 */
	private Double wed = 0D;
	/**
	 * tue
	 */
	private Double tue = 0D;
	/**
	 * tcID
	 */
	private String tcID = "";
	/**
	 * mon
	 */
	private Double mon = 0D;
	/**
	 * sat
	 */
	private Double sat = 0D;
	/**
	 * id
	 */
	private String id = "";
	/**
	 * thu
	 */
	private Double thu = 0D;
	/**
	 * fri
	 */
	private Double fri = 0D;
	/**
	 * sun
	 */
	private Double sun = 0D;

	public YG0210Request_Body_projects() {
	}

	public YG0210Request_Body_projects(JsonNode jsonNode) {
		this.tpID = jsonNode.path("tpID").getTextValue();
		this.wed = jsonNode.path("wed").getDoubleValue();
		this.tue = jsonNode.path("tue").getDoubleValue();
		this.tcID = jsonNode.path("tcID").getTextValue();
		this.mon = jsonNode.path("mon").getDoubleValue();
		this.sat = jsonNode.path("sat").getDoubleValue();
		this.id = jsonNode.path("id").getTextValue();
		this.thu = jsonNode.path("thu").getDoubleValue();
		this.fri = jsonNode.path("fri").getDoubleValue();
		this.sun = jsonNode.path("sun").getDoubleValue();
	}

	@JsonProperty("tpID")
	public String getTpID() {
		return this.tpID;
	}

	public void setTpID(String tpID) {
		this.tpID = tpID;
	}

	@JsonProperty("wed")
	public Double getWed() {
		return this.wed;
	}

	public void setWed(Double wed) {
		this.wed = wed;
	}

	@JsonProperty("tue")
	public Double getTue() {
		return this.tue;
	}

	public void setTue(Double tue) {
		this.tue = tue;
	}

	@JsonProperty("tcID")
	public String getTcID() {
		return this.tcID;
	}

	public void setTcID(String tcID) {
		this.tcID = tcID;
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

	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("thu")
	public Double getThu() {
		return this.thu;
	}

	public void setThu(Double thu) {
		this.thu = thu;
	}

	@JsonProperty("fri")
	public Double getFri() {
		return this.fri;
	}

	public void setFri(Double fri) {
		this.fri = fri;
	}

	@JsonProperty("sun")
	public Double getSun() {
		return this.sun;
	}

	public void setSun(Double sun) {
		this.sun = sun;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0210Request_Body_projects [");
		builder.append("tpID=").append(tpID);
		builder.append(", ");
		builder.append("wed=").append(wed);
		builder.append(", ");
		builder.append("tue=").append(tue);
		builder.append(", ");
		builder.append("tcID=").append(tcID);
		builder.append(", ");
		builder.append("mon=").append(mon);
		builder.append(", ");
		builder.append("sat=").append(sat);
		builder.append(", ");
		builder.append("id=").append(id);
		builder.append(", ");
		builder.append("thu=").append(thu);
		builder.append(", ");
		builder.append("fri=").append(fri);
		builder.append(", ");
		builder.append("sun=").append(sun);
		builder.append("]");
		return builder.toString();
	}
}