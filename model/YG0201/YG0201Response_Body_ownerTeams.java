package com.mcnc.yuga.model.YG0201;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 */
public class YG0201Response_Body_ownerTeams {
	/**
	 * team
	 */
	private String team = "";
	/**
	 * year
	 */
	private Integer year = null;

	public YG0201Response_Body_ownerTeams() {
	}

	public YG0201Response_Body_ownerTeams(JsonNode jsonNode) {
		this.team = jsonNode.path("team").getTextValue();
		this.year = jsonNode.path("year").getIntValue();
	}

	@JsonProperty("team")
	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@JsonProperty("year")
	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0201Response_Body_ownerTeams [");
		builder.append("team=").append(team);
		builder.append(", ");
		builder.append("year=").append(year);
		builder.append("]");
		return builder.toString();
	}
}