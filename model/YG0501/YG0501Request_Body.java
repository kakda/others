package com.mcnc.yuga.model.YG0501;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0501Request_Body {
	/**
	 * isApproved
	 */
	private Boolean isApproved = null;
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
	 * requestID
	 */
	private String requestID = "";
	/**
	 * timecardProjectID
	 */
	private String timecardProjectID = "";

	public YG0501Request_Body() {
	}

	public YG0501Request_Body(JsonNode jsonNode) {
		this.isApproved = jsonNode.path("isApproved").getBooleanValue();
		this.userID = jsonNode.path("userID").getTextValue();
		this.requesterID = jsonNode.path("requesterID").getTextValue();
		this.message = jsonNode.path("message").getTextValue();
		this.requestID = jsonNode.path("requestID").getTextValue();
		this.timecardProjectID = jsonNode.path("timecardProjectID")
				.getTextValue();
	}

	@JsonProperty("isApproved")
	public Boolean getIsApproved() {
		return this.isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
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

	@JsonProperty("requestID")
	public String getRequestID() {
		return this.requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
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
		builder.append("YG0501Request_Body [");
		builder.append("isApproved=").append(isApproved);
		builder.append(", ");
		builder.append("userID=").append(userID);
		builder.append(", ");
		builder.append("requesterID=").append(requesterID);
		builder.append(", ");
		builder.append("message=").append(message);
		builder.append(", ");
		builder.append("requestID=").append(requestID);
		builder.append(", ");
		builder.append("timecardProjectID=").append(timecardProjectID);
		builder.append("]");
		return builder.toString();
	}
}