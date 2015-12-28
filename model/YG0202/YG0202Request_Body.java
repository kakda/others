package com.mcnc.yuga.model.YG0202;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0202Request_Body {
	/**
	 * tcID
	 */
	private String tcID = "";
	/**
	 * userID
	 */
	private String userID = "";
	/**
	 * startDate
	 */
	private String startDate = "";
	/**
	 * tpID
	 */
	private String tpID = "";
	/**
	 * endDate
	 */
	private String endDate = "";
	/**
	 * projectID
	 */
	private String projectID = "";
	/**
	 * status
	 */
	private String status = "";

	public YG0202Request_Body() {
	}

	public YG0202Request_Body(JsonNode jsonNode) {
		this.tcID = jsonNode.path("tcID").getTextValue();
		this.userID = jsonNode.path("userID").getTextValue();
		this.startDate = jsonNode.path("startDate").getTextValue();
		this.tpID = jsonNode.path("tpID").getTextValue();
		this.endDate = jsonNode.path("endDate").getTextValue();
		this.projectID = jsonNode.path("projectID").getTextValue();
		this.status = jsonNode.path("status").getTextValue();
	}

	@JsonProperty("tcID")
	public String getTcID() {
		return this.tcID;
	}

	public void setTcID(String tcID) {
		this.tcID = tcID;
	}

	@JsonProperty("userID")
	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@JsonProperty("startDate")
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("tpID")
	public String getTpID() {
		return this.tpID;
	}

	public void setTpID(String tpID) {
		this.tpID = tpID;
	}

	@JsonProperty("endDate")
	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("projectID")
	public String getProjectID() {
		return this.projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	@JsonProperty("status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0202Request_Body [");
		builder.append("tcID=").append(tcID);
		builder.append(", ");
		builder.append("userID=").append(userID);
		builder.append(", ");
		builder.append("startDate=").append(startDate);
		builder.append(", ");
		builder.append("tpID=").append(tpID);
		builder.append(", ");
		builder.append("endDate=").append(endDate);
		builder.append(", ");
		builder.append("projectID=").append(projectID);
		builder.append(", ");
		builder.append("status=").append(status);
		builder.append("]");
		return builder.toString();
	}
}