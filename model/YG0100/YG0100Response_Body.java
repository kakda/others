package com.mcnc.yuga.model.YG0100;


import java.util.List;
import java.util.Iterator;
import org.codehaus.jackson.JsonNode;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0100Response_Body {
	/**
	 * total
	 */
	private Integer total = null;
	/**
	 * notices
	 */
	private List<YG0100Response_Body_notices> notices = new ArrayList<YG0100Response_Body_notices>();

	public YG0100Response_Body() {
	}

	public YG0100Response_Body(JsonNode jsonNode) {
		this.total = jsonNode.path("total").getIntValue();
		this.notices = new ArrayList<YG0100Response_Body_notices>();
		JsonNode noticesNode = jsonNode.path("notices");
		for (Iterator<JsonNode> iter = noticesNode.iterator(); iter.hasNext();) {
			JsonNode node = iter.next();
			notices.add(new YG0100Response_Body_notices(node));
		}
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@JsonProperty("notices")
	public List<YG0100Response_Body_notices> getNotices() {
		return this.notices;
	}

	public void setNotices(List<YG0100Response_Body_notices> notices) {
		this.notices = notices;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0100Response_Body [");
		builder.append("total=").append(total);
		builder.append(", ");
		builder.append("notices=").append(notices);
		builder.append("]");
		return builder.toString();
	}
}