package com.mcnc.yuga.model.YG0300;


import java.util.List;
import java.util.Iterator;
import org.codehaus.jackson.JsonNode;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0300Response_Body {
	/**
	 * memberships
	 */
	private List<YG0300Response_Body_memberships> memberships = new ArrayList<YG0300Response_Body_memberships>();
	/**
	 * total
	 */
	private Integer total = null;

	public YG0300Response_Body() {
	}

	public YG0300Response_Body(JsonNode jsonNode) {
		this.memberships = new ArrayList<YG0300Response_Body_memberships>();
		JsonNode membershipsNode = jsonNode.path("memberships");
		for (Iterator<JsonNode> iter = membershipsNode.iterator(); iter
				.hasNext();) {
			JsonNode node = iter.next();
			memberships.add(new YG0300Response_Body_memberships(node));
		}
		this.total = jsonNode.path("total").getIntValue();
	}

	@JsonProperty("memberships")
	public List<YG0300Response_Body_memberships> getMemberships() {
		return this.memberships;
	}

	public void setMemberships(List<YG0300Response_Body_memberships> memberships) {
		this.memberships = memberships;
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
		builder.append("YG0300Response_Body [");
		builder.append("memberships=").append(memberships);
		builder.append(", ");
		builder.append("total=").append(total);
		builder.append("]");
		return builder.toString();
	}
}