package nt.p2.tools.model;

import javax.xml.bind.annotation.XmlAttribute;

public class Touchpoint {

	private String version;

    private String id;

	@XmlAttribute
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@XmlAttribute
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}