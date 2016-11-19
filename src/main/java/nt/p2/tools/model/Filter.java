package nt.p2.tools.model;

import javax.xml.bind.annotation.XmlValue;

public class Filter {

	private String value;

	@XmlValue
    public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}