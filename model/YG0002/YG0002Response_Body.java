package com.mcnc.yuga.model.YG0002;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0002Response_Body {
	/**
	 * userID
	 */
	private String userID = "";
	/**
	 * isReset
	 */
	private Boolean isReset = null;

	public YG0002Response_Body() {
	}

	public YG0002Response_Body(JsonNode jsonNode) {
		this.userID = jsonNode.path("userID").getTextValue();
		this.isReset = jsonNode.path("isReset").getBooleanValue();
	}

	@JsonProperty("userID")
	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@JsonProperty("isReset")
	public Boolean getIsReset() {
		return this.isReset;
	}

	public void setIsReset(Boolean isReset) {
		this.isReset = isReset;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0002Response_Body [");
		builder.append("userID=").append(userID);
		builder.append(", ");
		builder.append("isReset=").append(isReset);
		builder.append("]");
		return builder.toString();
	}
}