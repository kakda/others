package com.mcnc.yuga.model.YG0200;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0200Request_Body {
	/**
	 * projectName
	 */
	private String projectName = "";
	/**
	 * categoryIDs
	 */
	private List<String> categoryIDs = new ArrayList<String>();
	/**
	 * endDate
	 */
	private String endDate = "";
	/**
	 * startDate
	 */
	private String startDate = "";
	/**
	 * end
	 */
	private Integer end = null;
	/**
	 * start
	 */
	private Integer start = null;
	/**
	 * userID
	 */
	private String userID = "";

	public YG0200Request_Body() {
	}

	public YG0200Request_Body(JsonNode jsonNode) {
		this.projectName = jsonNode.path("projectName").getTextValue();
		this.categoryIDs = new ArrayList<String>();
		JsonNode categoryIDsNode = jsonNode.path("categoryIDs");
		for (Iterator<JsonNode> iter = categoryIDsNode.iterator(); iter
				.hasNext();) {
			JsonNode node = iter.next();
			categoryIDs.add(node.getTextValue());
		}
		this.endDate = jsonNode.path("endDate").getTextValue();
		this.startDate = jsonNode.path("startDate").getTextValue();
		this.end = jsonNode.path("end").getIntValue();
		this.start = jsonNode.path("start").getIntValue();
		this.userID = jsonNode.path("userID").getTextValue();
	}

	@JsonProperty("projectName")
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@JsonProperty("categoryIDs")
	public List<String> getCategoryIDs() {
		return this.categoryIDs;
	}

	public void setCategoryIDs(List<String> categoryIDs) {
		this.categoryIDs = categoryIDs;
	}

	@JsonProperty("endDate")
	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("startDate")
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("end")
	public Integer getEnd() {
		return this.end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	@JsonProperty("start")
	public Integer getStart() {
		return this.start;
	}

	public void setStart(Integer start) {
		this.start = start;
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
		builder.append("YG0200Request_Body [");
		builder.append("projectName=").append(projectName);
		builder.append(", ");
		builder.append("categoryIDs=").append(categoryIDs);
		builder.append(", ");
		builder.append("endDate=").append(endDate);
		builder.append(", ");
		builder.append("startDate=").append(startDate);
		builder.append(", ");
		builder.append("end=").append(end);
		builder.append(", ");
		builder.append("start=").append(start);
		builder.append(", ");
		builder.append("userID=").append(userID);
		builder.append("]");
		return builder.toString();
	}
}