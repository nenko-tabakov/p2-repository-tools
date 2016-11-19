package nt.p2.tools.model;

import javax.xml.bind.annotation.XmlAttribute;

public class Update {

	private String id;

    private Integer severity;
	
	private String range;

	@XmlAttribute
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlAttribute
	public Integer getSeverity() {
		return severity;
	}

	public void setSeverity(Integer severity) {
		this.severity = severity;
	}

	@XmlAttribute
	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}
}