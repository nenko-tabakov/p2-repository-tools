package nt.p2.tools.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Unit {

	private String version;

	private Boolean singleton;

	private String id;

	private Update update;

	private Properties properties;

	private Provides provides;

	private Filter filter;

	private Artifacts artifacts;

	private Requires requires;

	private Touchpoint toucpint;

	private TouchpointData touchpointData;

	private Licenses licenses;

	private Copyright copyright;

	@XmlAttribute
    public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@XmlAttribute
	public Boolean getSingleton() {
		return singleton;
	}

	public void setSingleton(Boolean singleton) {
		this.singleton = singleton;
	}

	@XmlAttribute
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement
	public Update getUpdate() {
		return update;
	}

	public void setUpdate(Update update) {
		this.update = update;
	}

	@XmlElement
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@XmlElement
	public Provides getProvides() {
		return provides;
	}

	public void setProvides(Provides provides) {
		this.provides = provides;
	}

	@XmlElement
	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	@XmlElement
	public Artifacts getArtifacts() {
		return artifacts;
	};

	public void setArtifacts(Artifacts artifacts) {
		this.artifacts = artifacts;
	}

	@XmlElement
	public Requires getRequires() {
		return requires;
	}

	public void setRequires(Requires requires) {
		this.requires = requires;
	}

	@XmlElement
	public Touchpoint getToucpint() {
		return toucpint;
	}

	public void setToucpint(Touchpoint toucpint) {
		this.toucpint = toucpint;
	}

	@XmlElement
	public TouchpointData getTouchpointData() {
		return touchpointData;
	}

	public void setTouchpointData(TouchpointData touchpointData) {
		this.touchpointData = touchpointData;
	}

	@XmlElement
	public Licenses getLicenses() {
		return licenses;
	}

	public void setLicenses(Licenses licenses) {
		this.licenses = licenses;
	}

	@XmlElement
	public Copyright getCopyright() {
		return copyright;
	}

	public void setCopyright(Copyright copyright) {
		this.copyright = copyright;
	}

}