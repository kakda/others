package com.mcnc.yuga.model.YG0400;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 */
public class YG0400Response_Body_unsubmits {
	/**
	 * requesterID
	 */
	private String requesterID = "";
	/**
	 * requester
	 */
	private String requester = "";
	/**
	 * timecardProjectID
	 */
	private String timecardProjectID = "";
	/**
	 * requestTime
	 */
	private String requestTime = "";
	/**
	 * startDate
	 */
	private String startDate = "";
	/**
	 * projectName
	 */
	private String projectName = "";
	/**
	 * requestID
	 */
	private String requestID = "";
	/**
	 * projectID
	 */
	private String projectID = "";
	/**
	 * endDate
	 */
	private String endDate = "";

	public YG0400Response_Body_unsubmits() {
	}

	public YG0400Response_Body_unsubmits(JsonNode jsonNode) {
		this.requesterID = jsonNode.path("requesterID").getTextValue();
		this.requester = jsonNode.path("requester").getTextValue();
		this.timecardProjectID = jsonNode.path("timecardProjectID")
				.getTextValue();
		this.requestTime = jsonNode.path("requestTime").getTextValue();
		this.startDate = jsonNode.path("startDate").getTextValue();
		this.projectName = jsonNode.path("projectName").getTextValue();
		this.requestID = jsonNode.path("requestID").getTextValue();
		this.projectID = jsonNode.path("projectID").getTextValue();
		this.endDate = jsonNode.path("endDate").getTextValue();
	}

	@JsonProperty("requesterID")
	public String getRequesterID() {
		return this.requesterID;
	}

	public void setRequesterID(String requesterID) {
		this.requesterID = requesterID;
	}

	@JsonProperty("requester")
	public String getRequester() {
		return this.requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

	@JsonProperty("timecardProjectID")
	public String getTimecardProjectID() {
		return this.timecardProjectID;
	}

	public void setTimecardProjectID(String timecardProjectID) {
		this.timecardProjectID = timecardProjectID;
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

	@JsonProperty("projectName")
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@JsonProperty("requestID")
	public String getRequestID() {
		return this.requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
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

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0400Response_Body_unsubmits [");
		builder.append("requesterID=").append(requesterID);
		builder.append(", ");
		builder.append("requester=").append(requester);
		builder.append(", ");
		builder.append("timecardProjectID=").append(timecardProjectID);
		builder.append(", ");
		builder.append("requestTime=").append(requestTime);
		builder.append(", ");
		builder.append("startDate=").append(startDate);
		builder.append(", ");
		builder.append("projectName=").append(projectName);
		builder.append(", ");
		builder.append("requestID=").append(requestID);
		builder.append(", ");
		builder.append("projectID=").append(projectID);
		builder.append(", ");
		builder.append("endDate=").append(endDate);
		builder.append("]");
		return builder.toString();
	}
}