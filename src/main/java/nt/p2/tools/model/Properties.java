package nt.p2.tools.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Properties {

    private List<Property> propertites = new ArrayList<>();

    private Integer size;

    @XmlElement(name = "property")
    public List<Property> getPropertites() {
        return propertites;
    }

    public void setPropertites(List<Property> propertites) {
        this.propertites = propertites;
    }

    @XmlAttribute
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}