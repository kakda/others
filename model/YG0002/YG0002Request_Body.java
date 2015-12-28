package com.mcnc.yuga.model.YG0002;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0002Request_Body {
	/**
	 * passwd
	 */
	private String passwd = "";
	/**
	 * userID
	 */
	private String userID = "";

	public YG0002Request_Body() {
	}

	public YG0002Request_Body(JsonNode jsonNode) {
		this.passwd = jsonNode.path("passwd").getTextValue();
		this.userID = jsonNode.path("userID").getTextValue();
	}

	@JsonProperty("passwd")
	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
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
		builder.append("YG0002Request_Body [");
		builder.append("passwd=").append(passwd);
		builder.append(", ");
		builder.append("userID=").append(userID);
		builder.append("]");
		return builder.toString();
	}
}