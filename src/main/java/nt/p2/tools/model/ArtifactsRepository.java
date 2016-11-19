package nt.p2.tools.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "repository")
public class ArtifactsRepository {

	private String version;

	private String type;

	private String name;

	private Artifacts artifacts;

	private Properties properties;

	private Mappings mappings;

	@XmlAttribute
    public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@XmlAttribute
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "artifacts")
	public Artifacts getArtifacts() {
		return artifacts;
	}

	public void setArtifacts(Artifacts artifacts) {
		this.artifacts = artifacts;
	}

	@XmlElement(name = "properties")
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@XmlElement(name = "mappings")
	public Mappings getMappings() {
		return mappings;
	}

	public void setMappings(Mappings mappings) {
		this.mappings = mappings;
	}
}