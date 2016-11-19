package nt.p2.tools.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Provides {

	private Integer size;

    private List<Provided> provided = new ArrayList<>();

	@XmlAttribute
	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@XmlElement(name = "provided")
	public List<Provided> getProvided() {
		return provided;
	}

	public void setProvided(List<Provided> provided) {
		this.provided = provided;
	}
}