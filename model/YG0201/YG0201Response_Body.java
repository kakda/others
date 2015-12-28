package com.mcnc.yuga.model.YG0201;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0201Response_Body {
	/**
	 * status
	 */
	private String status = "";
	/**
	 * endDate
	 */
	private String endDate = "";
	/**
	 * startDate
	 */
	private String startDate = "";
	/**
	 * projectType
	 */
	private String projectType = "";
	/**
	 * projectName
	 */
	private String projectName = "";
	/**
	 * ownerTeams
	 */
	private List<YG0201Response_Body_ownerTeams> ownerTeams = new ArrayList<YG0201Response_Body_ownerTeams>();
	/**
	 * projectManager
	 */
	private String projectManager = "";
	/**
	 * assignMM
	 */
	private Double assignMM = 0D;
	/**
	 * AccumulateMM
	 */
	private Double accMM = 0D;
	/**
	 * weekMM
	 */
	private Double weekMM = 0D;
	/**
	 * weekHour
	 */
	private Double weekHour = 0D;
	/**
	 * tcID
	 */
	private String tcID = "";
	/**
	 * tpID
	 */
	private String tpID = "";

	public YG0201Response_Body() {
	}

	public YG0201Response_Body(JsonNode jsonNode) {
		this.status = jsonNode.path("status").getTextValue();
		this.endDate = jsonNode.path("endDate").getTextValue();
		this.startDate = jsonNode.path("startDate").getTextValue();
		this.projectType = jsonNode.path("projectType").getTextValue();
		this.projectName = jsonNode.path("projectName").getTextValue();
		this.ownerTeams = new ArrayList<YG0201Response_Body_ownerTeams>();
		JsonNode ownerTeamsNode = jsonNode.path("ownerTeams");
		for (Iterator<JsonNode> iter = ownerTeamsNode.iterator(); iter
				.hasNext();) {
			JsonNode node = iter.next();
			ownerTeams.add(new YG0201Response_Body_ownerTeams(node));
		}
		this.projectManager = jsonNode.path("projectManager").getTextValue();
		this.assignMM = jsonNode.path("assignMM").getDoubleValue();
		this.accMM = jsonNode.path("accMM").getDoubleValue();
		this.weekMM = jsonNode.path("weekMM").getDoubleValue();
		this.weekHour = jsonNode.path("weekHour").getDoubleValue();
		this.tcID = jsonNode.path("tcID").getTextValue();
		this.tpID = jsonNode.path("tpID").getTextValue();
	}

	@JsonProperty("status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	@JsonProperty("projectType")
	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	@JsonProperty("projectName")
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@JsonProperty("ownerTeams")
	public List<YG0201Response_Body_ownerTeams> getOwnerTeams() {
		return this.ownerTeams;
	}

	public void setOwnerTeams(List<YG0201Response_Body_ownerTeams> ownerTeams) {
		this.ownerTeams = ownerTeams;
	}

	@JsonProperty("projectManager")
	public String getProjectManager() {
		return this.projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	@JsonProperty("assignMM")
	public Double getAssignMM() {
		return this.assignMM;
	}

	public void setAssignMM(Double assignMM) {
		this.assignMM = assignMM;
	}

	@JsonProperty("accMM")
	public Double getAccMM() {
		return this.accMM;
	}

	public void setAccMM(Double accMM) {
		this.accMM = accMM;
	}

	@JsonProperty("weekMM")
	public Double getWeekMM() {
		return this.weekMM;
	}

	public void setWeekMM(Double weekMM) {
		this.weekMM = weekMM;
	}

	@JsonProperty("weekHour")
	public Double getWeekHour() {
		return this.weekHour;
	}

	public void setWeekHour(Double weekHour) {
		this.weekHour = weekHour;
	}

	@JsonProperty("tcID")
	public String getTcID() {
		return this.tcID;
	}

	

	public void setTcID(String tcID) {
		this.tcID = tcID;
	}

	@JsonProperty("tpID")
	public String getTpID() {
		return this.tpID;
	}

	public void setTpID(String tpID) {
		this.tpID = tpID;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0201Response_Body [");
		builder.append("status=").append(status);
		builder.append(", ");
		builder.append("endDate=").append(endDate);
		builder.append(", ");
		builder.append("startDate=").append(startDate);
		builder.append(", ");
		builder.append("projectType=").append(projectType);
		builder.append(", ");
		builder.append("projectName=").append(projectName);
		builder.append(", ");
		builder.append("ownerTeams=").append(ownerTeams);
		builder.append(", ");
		builder.append("projectManager=").append(projectManager);
		builder.append(", ");
		builder.append("assignMM=").append(assignMM);
		builder.append(", ");
		builder.append("accMM=").append(accMM);
		builder.append(", ");
		builder.append("weekMM=").append(weekMM);
		builder.append(", ");
		builder.append("weekHour=").append(weekHour);
		builder.append(", ");
		builder.append("tcID=").append(tcID);
		builder.append(", ");
		builder.append("tpID=").append(tpID);
		builder.append("]");
		return builder.toString();
	}
}