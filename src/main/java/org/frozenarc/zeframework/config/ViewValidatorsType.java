package org.frozenarc.zeframework.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             	This represents list of View Validator. 
 *             
 * 
 * <p>Java class for ViewValidatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewValidatorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ViewValidator" type="{http://www.frozenarc.org/zeframework/config}ViewValidatorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewValidatorsType", propOrder = {
    "viewValidator"
})
public class ViewValidatorsType {

    @XmlElement(name = "ViewValidator")
    protected List<ViewValidatorType> viewValidator;

    /**
     * Gets the value of the viewValidator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewValidator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewValidator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewValidatorType }
     * 
     * 
     */
    public List<ViewValidatorType> getViewValidator() {
        if (viewValidator == null) {
            viewValidator = new ArrayList<ViewValidatorType>();
        }
        return this.viewValidator;
    }

}
