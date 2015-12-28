package com.mcnc.yuga.model.YG0200;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0200Response_Body {
	/**
	 * categories
	 */
	private List<YG0200Response_Body_categories> categories = new ArrayList<YG0200Response_Body_categories>();
	/**
	 * total
	 */
	private Integer total = null;
	/**
	 * holidays
	 */
	private List<Integer> holidays = new ArrayList<Integer>();
	/**
	 * isEditable
	 */
	private Boolean isEditable = null;
	/**
	 * project
	 */
	private List<YG0200Response_Body_project> project = new ArrayList<YG0200Response_Body_project>();

	public YG0200Response_Body() {
	}

	public YG0200Response_Body(JsonNode jsonNode) {
		this.categories = new ArrayList<YG0200Response_Body_categories>();
		JsonNode categoriesNode = jsonNode.path("categories");
		for (Iterator<JsonNode> iter = categoriesNode.iterator(); iter
				.hasNext();) {
			JsonNode node = iter.next();
			categories.add(new YG0200Response_Body_categories(node));
		}
		this.total = jsonNode.path("total").getIntValue();
		this.holidays = new ArrayList<Integer>();
		JsonNode holidaysNode = jsonNode.path("holidays");
		for (Iterator<JsonNode> iter = holidaysNode.iterator(); iter.hasNext();) {
			JsonNode node = iter.next();
			holidays.add(node.getIntValue());
		}
		this.isEditable = jsonNode.path("isEditable").getBooleanValue();
		this.project = new ArrayList<YG0200Response_Body_project>();
		JsonNode projectNode = jsonNode.path("project");
		for (Iterator<JsonNode> iter = projectNode.iterator(); iter.hasNext();) {
			JsonNode node = iter.next();
			project.add(new YG0200Response_Body_project(node));
		}
	}

	@JsonProperty("categories")
	public List<YG0200Response_Body_categories> getCategories() {
		return this.categories;
	}

	public void setCategories(List<YG0200Response_Body_categories> categories) {
		this.categories = categories;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@JsonProperty("holidays")
	public List<Integer> getHolidays() {
		return this.holidays;
	}

	public void setHolidays(List<Integer> holidays) {
		this.holidays = holidays;
	}

	@JsonProperty("isEditable")
	public Boolean getIsEditable() {
		return this.isEditable;
	}

	public void setIsEditable(Boolean isEditable) {
		this.isEditable = isEditable;
	}

	@JsonProperty("project")
	public List<YG0200Response_Body_project> getProject() {
		return this.project;
	}

	public void setProject(List<YG0200Response_Body_project> project) {
		this.project = project;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0200Response_Body [");
		builder.append("categories=").append(categories);
		builder.append(", ");
		builder.append("total=").append(total);
		builder.append(", ");
		builder.append("holidays=").append(holidays);
		builder.append(", ");
		builder.append("isEditable=").append(isEditable);
		builder.append(", ");
		builder.append("project=").append(project);
		builder.append("]");
		return builder.toString();
	}
}