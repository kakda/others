package com.mcnc.yuga.model.YG0201;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0201Request_Body {
	/**
	 * projectID
	 */
	private String projectID = "";
	/**
	 * endDate
	 */
	private String endDate = "";
	/**
	 * startDate
	 */
	private String startDate = "";
	/**
	 * userID
	 */
	private String userID = "";

	public YG0201Request_Body() {
	}

	public YG0201Request_Body(JsonNode jsonNode) {
		this.projectID = jsonNode.path("projectID").getTextValue();
		this.endDate = jsonNode.path("endDate").getTextValue();
		this.startDate = jsonNode.path("startDate").getTextValue();
		this.userID = jsonNode.path("userID").getTextValue();
	}

	@JsonProperty("projectID")
	public String getProjectID() {
		return this.projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	@JsonProperty("endDate")
	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("startDate")
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("userID")
	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0201Request_Body [");
		builder.append("projectID=").append(projectID);
		builder.append(", ");
		builder.append("endDate=").append(endDate);
		builder.append(", ");
		builder.append("startDate=").append(startDate);
		builder.append(", ");
		builder.append("userID=").append(userID);
		builder.append("]");
		return builder.toString();
	}
}