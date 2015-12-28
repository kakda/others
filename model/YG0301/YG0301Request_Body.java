package com.mcnc.yuga.model.YG0301;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0301Request_Body {
	/**
	 * isApproved
	 */
	private Boolean isApproved = null;
	/**
	 * message
	 */
	private String message = "";
	/**
	 * requestID
	 */
	private String requestID = "";
	/**
	 * requesterID
	 */
	private String requesterID = "";
	/**
	 * userID
	 */
	private String userID = "";
	/**
	 * plannedMM
	 */
	private Double plannedMM = 0D;
	/**
	 * projectID
	 */
	private String projectID = "";

	public YG0301Request_Body() {
	}

	public YG0301Request_Body(JsonNode jsonNode) {
		this.isApproved = jsonNode.path("isApproved").getBooleanValue();
		this.message = jsonNode.path("message").getTextValue();
		this.requestID = jsonNode.path("requestID").getTextValue();
		this.requesterID = jsonNode.path("requesterID").getTextValue();
		this.userID = jsonNode.path("userID").getTextValue();
		this.plannedMM = jsonNode.path("plannedMM").getDoubleValue();
		this.projectID = jsonNode.path("projectID").getTextValue();
	}

	@JsonProperty("isApproved")
	public Boolean getIsApproved() {
		return this.isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}

	@JsonProperty("message")
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("requestID")
	public String getRequestID() {
		return this.requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	@JsonProperty("requesterID")
	public String getRequesterID() {
		return this.requesterID;
	}

	public void setRequesterID(String requesterID) {
		this.requesterID = requesterID;
	}

	@JsonProperty("userID")
	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@JsonProperty("plannedMM")
	public Double getPlannedMM() {
		return this.plannedMM;
	}

	public void setPlannedMM(Double plannedMM) {
		this.plannedMM = plannedMM;
	}

	@JsonProperty("projectID")
	public String getProjectID() {
		return this.projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0301Request_Body [");
		builder.append("isApproved=").append(isApproved);
		builder.append(", ");
		builder.append("message=").append(message);
		builder.append(", ");
		builder.append("requestID=").append(requestID);
		builder.append(", ");
		builder.append("requesterID=").append(requesterID);
		builder.append(", ");
		builder.append("userID=").append(userID);
		builder.append(", ");
		builder.append("plannedMM=").append(plannedMM);
		builder.append(", ");
		builder.append("projectID=").append(projectID);
		builder.append("]");
		return builder.toString();
	}
}