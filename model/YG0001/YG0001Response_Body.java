package com.mcnc.yuga.model.YG0001;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0001Response_Body {
	/**
	 * isReset
	 */
	private Boolean isReset = null;
	/**
	 * empName
	 */
	private String empName = "";
	/**
	 * role
	 */
	private String role = "";
	/**
	 * userID
	 */
	private String userID = "";

	public YG0001Response_Body() {
	}

	public YG0001Response_Body(JsonNode jsonNode) {
		this.isReset = jsonNode.path("isReset").getBooleanValue();
		this.empName = jsonNode.path("empName").getTextValue();
		this.role = jsonNode.path("role").getTextValue();
		this.userID = jsonNode.path("userID").getTextValue();
	}

	@JsonProperty("isReset")
	public Boolean getIsReset() {
		return this.isReset;
	}

	public void setIsReset(Boolean isReset) {
		this.isReset = isReset;
	}

	@JsonProperty("empName")
	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@JsonProperty("role")
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
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
		builder.append("YG0001Response_Body [");
		builder.append("isReset=").append(isReset);
		builder.append(", ");
		builder.append("empName=").append(empName);
		builder.append(", ");
		builder.append("role=").append(role);
		builder.append(", ");
		builder.append("userID=").append(userID);
		builder.append("]");
		return builder.toString();
	}
}