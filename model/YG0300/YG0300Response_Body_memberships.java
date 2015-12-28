package com.mcnc.yuga.model.YG0300;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 */
public class YG0300Response_Body_memberships {
	/**
	 * projectName
	 */
	private String projectName = "";
	/**
	 * endDate
	 */
	private String endDate = "";
	/**
	 * requester
	 */
	private String requester = "";
	/**
	 * projectID
	 */
	private String projectID = "";
	/**
	 * requesterID
	 */
	private String requesterID = "";
	/**
	 * requestID
	 */
	private String requestID = "";
	/**
	 * requestTime
	 */
	private String requestTime = "";
	/**
	 * startDate
	 */
	private String startDate = "";

	public YG0300Response_Body_memberships() {
	}

	public YG0300Response_Body_memberships(JsonNode jsonNode) {
		this.projectName = jsonNode.path("projectName").getTextValue();
		this.endDate = jsonNode.path("endDate").getTextValue();
		this.requester = jsonNode.path("requester").getTextValue();
		this.projectID = jsonNode.path("projectID").getTextValue();
		this.requesterID = jsonNode.path("requesterID").getTextValue();
		this.requestID = jsonNode.path("requestID").getTextValue();
		this.requestTime = jsonNode.path("requestTime").getTextValue();
		this.startDate = jsonNode.path("startDate").getTextValue();
	}

	@JsonProperty("projectName")
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@JsonProperty("endDate")
	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("requester")
	public String getRequester() {
		return this.requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

	@JsonProperty("projectID")
	public String getProjectID() {
		return this.projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	@JsonProperty("requesterID")
	public String getRequesterID() {
		return this.requesterID;
	}

	public void setRequesterID(String requesterID) {
		this.requesterID = requesterID;
	}

	@JsonProperty("requestID")
	public String getRequestID() {
		return this.requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	@JsonProperty("requestTime")
	public String getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	@JsonProperty("startDate")
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0300Response_Body_memberships [");
		builder.append("projectName=").append(projectName);
		builder.append(", ");
		builder.append("endDate=").append(endDate);
		builder.append(", ");
		builder.append("requester=").append(requester);
		builder.append(", ");
		builder.append("projectID=").append(projectID);
		builder.append(", ");
		builder.append("requesterID=").append(requesterID);
		builder.append(", ");
		builder.append("requestID=").append(requestID);
		builder.append(", ");
		builder.append("requestTime=").append(requestTime);
		builder.append(", ");
		builder.append("startDate=").append(startDate);
		builder.append("]");
		return builder.toString();
	}
}