//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.22 at 09:26:46 AM PKT 
//


package com.aspose.examples.examplesmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}DataFile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"dataFile"
})
@XmlRootElement(name = "OutputFiles")
public class OutputFiles {

	@XmlElement(name = "DataFile", required = true)
	protected DataFile dataFile;

	/**
	 * Gets the value of the dataFile property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link DataFile }
	 *     
	 */
	public DataFile getDataFile() {
		return dataFile;
	}

	/**
	 * Sets the value of the dataFile property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link DataFile }
	 *     
	 */
	public void setDataFile(DataFile value) {
		this.dataFile = value;
	}

}
