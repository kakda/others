package com.mcnc.yuga.model.YG0400;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 */
public class YG0400Response_Body_requestTime {
	/**
	 * requestTime
	 */
	private String requestTime = "";
	/**
	 * timeCardProjectID
	 */
	private String timeCardProjectID = "";
	/**
	 * requester
	 */
	private String requester = "";
	/**
	 * requesterID
	 */
	private String requesterID = "";
	/**
	 * projectID
	 */
	private String projectID = "";
	/**
	 * startDate
	 */
	private String startDate = "";
	/**
	 * requestID
	 */
	private String requestID = "";
	/**
	 * projectName
	 */
	private String projectName = "";
	/**
	 * endDate
	 */
	private String endDate = "";

	public YG0400Response_Body_requestTime() {
	}

	public YG0400Response_Body_requestTime(JsonNode jsonNode) {
		this.requestTime = jsonNode.path("requestTime").getTextValue();
		this.timeCardProjectID = jsonNode.path("timeCardProjectID")
				.getTextValue();
		this.requester = jsonNode.path("requester").getTextValue();
		this.requesterID = jsonNode.path("requesterID").getTextValue();
		this.projectID = jsonNode.path("projectID").getTextValue();
		this.startDate = jsonNode.path("startDate").getTextValue();
		this.requestID = jsonNode.path("requestID").getTextValue();
		this.projectName = jsonNode.path("projectName").getTextValue();
		this.endDate = jsonNode.path("endDate").getTextValue();
	}

	@JsonProperty("requestTime")
	public String getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	@JsonProperty("timeCardProjectID")
	public String getTimeCardProjectID() {
		return this.timeCardProjectID;
	}

	public void setTimeCardProjectID(String timeCardProjectID) {
		this.timeCardProjectID = timeCardProjectID;
	}

	@JsonProperty("requester")
	public String getRequester() {
		return this.requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

	@JsonProperty("requesterID")
	public String getRequesterID() {
		return this.requesterID;
	}

	public void setRequesterID(String requesterID) {
		this.requesterID = requesterID;
	}

	@JsonProperty("projectID")
	public String getProjectID() {
		return this.projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	@JsonProperty("startDate")
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("requestID")
	public String getRequestID() {
		return this.requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
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

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0400Response_Body_requestTime [");
		builder.append("requestTime=").append(requestTime);
		builder.append(", ");
		builder.append("timeCardProjectID=").append(timeCardProjectID);
		builder.append(", ");
		builder.append("requester=").append(requester);
		builder.append(", ");
		builder.append("requesterID=").append(requesterID);
		builder.append(", ");
		builder.append("projectID=").append(projectID);
		builder.append(", ");
		builder.append("startDate=").append(startDate);
		builder.append(", ");
		builder.append("requestID=").append(requestID);
		builder.append(", ");
		builder.append("projectName=").append(projectName);
		builder.append(", ");
		builder.append("endDate=").append(endDate);
		builder.append("]");
		return builder.toString();
	}
}