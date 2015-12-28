package com.mcnc.yuga.model.YG0500;


import java.util.List;
import java.util.Iterator;
import org.codehaus.jackson.JsonNode;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0500Response_Body {
	/**
	 * overtimes
	 */
	private List<YG0500Response_Body_overtimes> overtimes = new ArrayList<YG0500Response_Body_overtimes>();
	/**
	 * total
	 */
	private Integer total = null;

	public YG0500Response_Body() {
	}

	public YG0500Response_Body(JsonNode jsonNode) {
		this.overtimes = new ArrayList<YG0500Response_Body_overtimes>();
		JsonNode overtimesNode = jsonNode.path("overtimes");
		for (Iterator<JsonNode> iter = overtimesNode.iterator(); iter.hasNext();) {
			JsonNode node = iter.next();
			overtimes.add(new YG0500Response_Body_overtimes(node));
		}
		this.total = jsonNode.path("total").getIntValue();
	}

	@JsonProperty("overtimes")
	public List<YG0500Response_Body_overtimes> getOvertimes() {
		return this.overtimes;
	}

	public void setOvertimes(List<YG0500Response_Body_overtimes> overtimes) {
		this.overtimes = overtimes;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0500Response_Body [");
		builder.append("overtimes=").append(overtimes);
		builder.append(", ");
		builder.append("total=").append(total);
		builder.append("]");
		return builder.toString();
	}
}