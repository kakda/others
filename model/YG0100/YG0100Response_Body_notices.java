package com.mcnc.yuga.model.YG0100;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 */
public class YG0100Response_Body_notices {
	/**
	 * endDate
	 */
	private String endDate = "";
	/**
	 * noticeTime
	 */
	private String noticeTime = "";
	/**
	 * isResponded
	 */
	private Boolean isResponded = null;
	/**
	 * flag
	 */
	private String flag = "";
	/**
	 * noticeType
	 */
	private String noticeType = "";
	/**
	 * isApproved
	 */
	private Boolean isApproved = null;
	/**
	 * message
	 */
	private String message = "";
	/**
	 * noticeID
	 */
	private String noticeID = "";
	/**
	 * senderName
	 */
	private String senderName = "";
	/**
	 * receiverName
	 */
	private String receiverName = "";
	/**
	 * projectName
	 */
	private String projectName = "";
	/**
	 * plannedWorkSize
	 */
	private Double plannedWorkSize = 0D;
	/**
	 * startDate
	 */
	private String startDate = "";
	/**
	 * projectManager
	 */
	private String projectManager = "";

	public YG0100Response_Body_notices() {
	}

	public YG0100Response_Body_notices(JsonNode jsonNode) {
		this.endDate = jsonNode.path("endDate").getTextValue();
		this.noticeTime = jsonNode.path("noticeTime").getTextValue();
		this.isResponded = jsonNode.path("isResponded").getBooleanValue();
		this.flag = jsonNode.path("flag").getTextValue();
		this.noticeType = jsonNode.path("noticeType").getTextValue();
		this.isApproved = jsonNode.path("isApproved").getBooleanValue();
		this.message = jsonNode.path("message").getTextValue();
		this.noticeID = jsonNode.path("noticeID").getTextValue();
		this.senderName = jsonNode.path("senderName").getTextValue();
		this.receiverName = jsonNode.path("receiverName").getTextValue();
		this.projectName = jsonNode.path("projectName").getTextValue();
		this.plannedWorkSize = jsonNode.path("plannedWorkSize")
				.getDoubleValue();
		this.startDate = jsonNode.path("startDate").getTextValue();
		this.projectManager = jsonNode.path("projectManager").getTextValue();
	}

	@JsonProperty("endDate")
	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("noticeTime")
	public String getNoticeTime() {
		return this.noticeTime;
	}

	public void setNoticeTime(String noticeTime) {
		this.noticeTime = noticeTime;
	}

	@JsonProperty("isResponded")
	public Boolean getIsResponded() {
		return this.isResponded;
	}

	public void setIsResponded(Boolean isResponded) {
		this.isResponded = isResponded;
	}

	@JsonProperty("flag")
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@JsonProperty("noticeType")
	public String getNoticeType() {
		return this.noticeType;
	}

	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
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

	@JsonProperty("noticeID")
	public String getNoticeID() {
		return this.noticeID;
	}

	public void setNoticeID(String noticeID) {
		this.noticeID = noticeID;
	}

	@JsonProperty("senderName")
	public String getSenderName() {
		return this.senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	@JsonProperty("receiverName")
	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	@JsonProperty("projectName")
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@JsonProperty("plannedWorkSize")
	public Double getPlannedWorkSize() {
		return this.plannedWorkSize;
	}

	public void setPlannedWorkSize(Double plannedWorkSize) {
		this.plannedWorkSize = plannedWorkSize;
	}

	@JsonProperty("startDate")
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("projectManager")
	public String getProjectManager() {
		return this.projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0100Response_Body_notices [");
		builder.append("endDate=").append(endDate);
		builder.append(", ");
		builder.append("noticeTime=").append(noticeTime);
		builder.append(", ");
		builder.append("isResponded=").append(isResponded);
		builder.append(", ");
		builder.append("flag=").append(flag);
		builder.append(", ");
		builder.append("noticeType=").append(noticeType);
		builder.append(", ");
		builder.append("isApproved=").append(isApproved);
		builder.append(", ");
		builder.append("message=").append(message);
		builder.append(", ");
		builder.append("noticeID=").append(noticeID);
		builder.append(", ");
		builder.append("senderName=").append(senderName);
		builder.append(", ");
		builder.append("receiverName=").append(receiverName);
		builder.append(", ");
		builder.append("projectName=").append(projectName);
		builder.append(", ");
		builder.append("plannedWorkSize=").append(plannedWorkSize);
		builder.append(", ");
		builder.append("startDate=").append(startDate);
		builder.append(", ");
		builder.append("projectManager=").append(projectManager);
		builder.append("]");
		return builder.toString();
	}
}