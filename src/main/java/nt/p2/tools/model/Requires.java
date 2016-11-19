package nt.p2.tools.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Requires {

    private Integer size;

    private List<Required> required = new ArrayList<>();

    @XmlAttribute
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @XmlElement(name = "required")
    public List<Required> getRequired() {
        return required;
    }

    public void setRequired(List<Required> required) {
        this.required = required;
    }

}