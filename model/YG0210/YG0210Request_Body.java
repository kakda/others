package com.mcnc.yuga.model.YG0210;


import java.util.List;
import java.util.Iterator;
import org.codehaus.jackson.JsonNode;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0210Request_Body {
	/**
	 * startDate
	 */
	private String startDate = "";
	/**
	 * userID
	 */
	private String userID = "";
	/**
	 * projects
	 */
	private List<YG0210Request_Body_projects> projects = new ArrayList<YG0210Request_Body_projects>();
	/**
	 * endDate
	 */
	private String endDate = "";
	/**
	 * isSubmit
	 */
	private Boolean isSubmit = null;

	public YG0210Request_Body() {
	}

	public YG0210Request_Body(JsonNode jsonNode) {
		this.startDate = jsonNode.path("startDate").getTextValue();
		this.userID = jsonNode.path("userID").getTextValue();
		this.projects = new ArrayList<YG0210Request_Body_projects>();
		JsonNode projectsNode = jsonNode.path("projects");
		for (Iterator<JsonNode> iter = projectsNode.iterator(); iter.hasNext();) {
			JsonNode node = iter.next();
			projects.add(new YG0210Request_Body_projects(node));
		}
		this.endDate = jsonNode.path("endDate").getTextValue();
		this.isSubmit = jsonNode.path("isSubmit").getBooleanValue();
	}

	@JsonProperty("startDate")
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("userID")
	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@JsonProperty("projects")
	public List<YG0210Request_Body_projects> getProjects() {
		return this.projects;
	}

	public void setProjects(List<YG0210Request_Body_projects> projects) {
		this.projects = projects;
	}

	@JsonProperty("endDate")
	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("isSubmit")
	public Boolean getIsSubmit() {
		return this.isSubmit;
	}

	public void setIsSubmit(Boolean isSubmit) {
		this.isSubmit = isSubmit;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0210Request_Body [");
		builder.append("startDate=").append(startDate);
		builder.append(", ");
		builder.append("userID=").append(userID);
		builder.append(", ");
		builder.append("projects=").append(projects);
		builder.append(", ");
		builder.append("endDate=").append(endDate);
		builder.append(", ");
		builder.append("isSubmit=").append(isSubmit);
		builder.append("]");
		return builder.toString();
	}
}