package com.mcnc.yuga.model.YG0200;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 */
public class YG0200Response_Body_categories {
	/**
	 * id
	 */
	private String id = "";
	/**
	 * title
	 */
	private String title = "";

	public YG0200Response_Body_categories() {
	}

	public YG0200Response_Body_categories(JsonNode jsonNode) {
		this.id = jsonNode.path("id").getTextValue();
		this.title = jsonNode.path("title").getTextValue();
	}

	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0200Response_Body_categories [");
		builder.append("id=").append(id);
		builder.append(", ");
		builder.append("title=").append(title);
		builder.append("]");
		return builder.toString();
	}
}