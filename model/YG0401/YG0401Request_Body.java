package com.mcnc.yuga.model.YG0401;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0401Request_Body {
	/**
	 * timecardProjectID
	 */
	private String timecardProjectID = "";
	/**
	 * userID
	 */
	private String userID = "";
	/**
	 * requesterID
	 */
	private String requesterID = "";
	/**
	 * message
	 */
	private String message = "";
	/**
	 * isApproved
	 */
	private Boolean isApproved = null;
	/**
	 * requestID
	 */
	private String requestID = "";

	public YG0401Request_Body() {
	}

	public YG0401Request_Body(JsonNode jsonNode) {
		this.timecardProjectID = jsonNode.path("timecardProjectID")
				.getTextValue();
		this.userID = jsonNode.path("userID").getTextValue();
		this.requesterID = jsonNode.path("requesterID").getTextValue();
		this.message = jsonNode.path("message").getTextValue();
		this.isApproved = jsonNode.path("isApproved").getBooleanValue();
		this.requestID = jsonNode.path("requestID").getTextValue();
	}

	@JsonProperty("timecardProjectID")
	public String getTimecardProjectID() {
		return this.timecardProjectID;
	}

	public void setTimecardProjectID(String timecardProjectID) {
		this.timecardProjectID = timecardProjectID;
	}

	@JsonProperty("userID")
	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@JsonProperty("requesterID")
	public String getRequesterID() {
		return this.requesterID;
	}

	public void setRequesterID(String requesterID) {
		this.requesterID = requesterID;
	}

	@JsonProperty("message")
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("isApproved")
	public Boolean getIsApproved() {
		return this.isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}

	@JsonProperty("requestID")
	public String getRequestID() {
		return this.requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0401Request_Body [");
		builder.append("timecardProjectID=").append(timecardProjectID);
		builder.append(", ");
		builder.append("userID=").append(userID);
		builder.append(", ");
		builder.append("requesterID=").append(requesterID);
		builder.append(", ");
		builder.append("message=").append(message);
		builder.append(", ");
		builder.append("isApproved=").append(isApproved);
		builder.append(", ");
		builder.append("requestID=").append(requestID);
		builder.append("]");
		return builder.toString();
	}
}