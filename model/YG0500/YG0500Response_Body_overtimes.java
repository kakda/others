package com.mcnc.yuga.model.YG0500;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 */
public class YG0500Response_Body_overtimes {
	/**
	 * requestID
	 */
	private String requestID = "";
	/**
	 * requestHour
	 */
	private Double requestHour = 0D;
	/**
	 * actual
	 */
	private Double actual = 0D;
	/**
	 * projectID
	 */
	private String projectID = "";
	/**
	 * projectName
	 */
	private String projectName = "";
	/**
	 * requestTime
	 */
	private String requestTime = "";
	/**
	 * plan
	 */
	private Double plan = 0D;
	/**
	 * requesterID
	 */
	private String requesterID = "";
	/**
	 * startDate
	 */
	private String startDate = "";
	/**
	 * endDate
	 */
	private String endDate = "";
	/**
	 * requester
	 */
	private String requester = "";
	/**
	 * timecardProjectID
	 */
	private String timecardProjectID = "";

	public YG0500Response_Body_overtimes() {
	}

	public YG0500Response_Body_overtimes(JsonNode jsonNode) {
		this.requestID = jsonNode.path("requestID").getTextValue();
		this.requestHour = jsonNode.path("requestHour").getDoubleValue();
		this.actual = jsonNode.path("actual").getDoubleValue();
		this.projectID = jsonNode.path("projectID").getTextValue();
		this.projectName = jsonNode.path("projectName").getTextValue();
		this.requestTime = jsonNode.path("requestTime").getTextValue();
		this.plan = jsonNode.path("plan").getDoubleValue();
		this.requesterID = jsonNode.path("requesterID").getTextValue();
		this.startDate = jsonNode.path("startDate").getTextValue();
		this.endDate = jsonNode.path("endDate").getTextValue();
		this.requester = jsonNode.path("requester").getTextValue();
		this.timecardProjectID = jsonNode.path("timecardProjectID")
				.getTextValue();
	}

	@JsonProperty("requestID")
	public String getRequestID() {
		return this.requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	@JsonProperty("requestHour")
	public Double getRequestHour() {
		return this.requestHour;
	}

	public void setRequestHour(Double requestHour) {
		this.requestHour = requestHour;
	}

	@JsonProperty("actual")
	public Double getActual() {
		return this.actual;
	}

	public void setActual(Double actual) {
		this.actual = actual;
	}

	@JsonProperty("projectID")
	public String getProjectID() {
		return this.projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	@JsonProperty("projectName")
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@JsonProperty("requestTime")
	public String getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	@JsonProperty("plan")
	public Double getPlan() {
		return this.plan;
	}

	public void setPlan(Double plan) {
		this.plan = plan;
	}

	@JsonProperty("requesterID")
	public String getRequesterID() {
		return this.requesterID;
	}

	public void setRequesterID(String requesterID) {
		this.requesterID = requesterID;
	}

	@JsonProperty("startDate")
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
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

	@JsonProperty("timecardProjectID")
	public String getTimecardProjectID() {
		return this.timecardProjectID;
	}

	public void setTimecardProjectID(String timecardProjectID) {
		this.timecardProjectID = timecardProjectID;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0500Response_Body_overtimes [");
		builder.append("requestID=").append(requestID);
		builder.append(", ");
		builder.append("requestHour=").append(requestHour);
		builder.append(", ");
		builder.append("actual=").append(actual);
		builder.append(", ");
		builder.append("projectID=").append(projectID);
		builder.append(", ");
		builder.append("projectName=").append(projectName);
		builder.append(", ");
		builder.append("requestTime=").append(requestTime);
		builder.append(", ");
		builder.append("plan=").append(plan);
		builder.append(", ");
		builder.append("requesterID=").append(requesterID);
		builder.append(", ");
		builder.append("startDate=").append(startDate);
		builder.append(", ");
		builder.append("endDate=").append(endDate);
		builder.append(", ");
		builder.append("requester=").append(requester);
		builder.append(", ");
		builder.append("timecardProjectID=").append(timecardProjectID);
		builder.append("]");
		return builder.toString();
	}
}