
package br.personal.soa.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.5.1
 * Mon Mar 28 15:44:28 BRT 2022
 * Generated source version: 3.5.1
 */

@XmlRootElement(name = "subtrairResponse", namespace = "http://soa.personal.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subtrairResponse", namespace = "http://soa.personal.br/")

public class SubtrairResponse {

    @XmlElement(name = "return")
    private double _return;

    public double getReturn() {
        return this._return;
    }

    public void setReturn(double new_return)  {
        this._return = new_return;
    }

}

