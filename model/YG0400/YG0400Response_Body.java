package com.mcnc.yuga.model.YG0400;


import java.util.List;
import java.util.Iterator;
import org.codehaus.jackson.JsonNode;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0400Response_Body {
	/**
	 * unsubmits
	 */
	private List<YG0400Response_Body_unsubmits> unsubmits = new ArrayList<YG0400Response_Body_unsubmits>();
	/**
	 * total
	 */
	private Integer total = null;

	public YG0400Response_Body() {
	}

	public YG0400Response_Body(JsonNode jsonNode) {
		this.unsubmits = new ArrayList<YG0400Response_Body_unsubmits>();
		JsonNode unsubmitsNode = jsonNode.path("unsubmits");
		for (Iterator<JsonNode> iter = unsubmitsNode.iterator(); iter.hasNext();) {
			JsonNode node = iter.next();
			unsubmits.add(new YG0400Response_Body_unsubmits(node));
		}
		this.total = jsonNode.path("total").getIntValue();
	}

	@JsonProperty("unsubmits")
	public List<YG0400Response_Body_unsubmits> getUnsubmits() {
		return this.unsubmits;
	}

	public void setUnsubmits(List<YG0400Response_Body_unsubmits> unsubmits) {
		this.unsubmits = unsubmits;
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
		builder.append("YG0400Response_Body [");
		builder.append("unsubmits=").append(unsubmits);
		builder.append(", ");
		builder.append("total=").append(total);
		builder.append("]");
		return builder.toString();
	}
}