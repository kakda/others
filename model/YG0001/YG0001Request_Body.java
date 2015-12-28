package com.mcnc.yuga.model.YG0001;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0001Request_Body {
	/**
	 * userID
	 */
	private String userID = "";
	/**
	 * passwd
	 */
	private String passwd = "";

	public YG0001Request_Body() {
	}

	public YG0001Request_Body(JsonNode jsonNode) {
		this.userID = jsonNode.path("userID").getTextValue();
		this.passwd = jsonNode.path("passwd").getTextValue();
	}

	@JsonProperty("userID")
	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@JsonProperty("passwd")
	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0001Request_Body [");
		builder.append("userID=").append(userID);
		builder.append(", ");
		builder.append("passwd=").append(passwd);
		builder.append("]");
		return builder.toString();
	}
}