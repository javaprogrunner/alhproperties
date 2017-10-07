/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codechefs.alphalandandhome.orm.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author roland
 */
@Entity
public class PropertyInquiry implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long inquiryInformationID;
	@Temporal(TemporalType.TIMESTAMP)
	private Date inquiryDate;
	private Long property_ID;
	private Long customer_ID;

	
	public PropertyInquiry() {
		super();
	}

	public PropertyInquiry(Date inquiryDate, Long property_ID, Long customer_ID) {
		super();
		this.inquiryDate = inquiryDate;
		this.property_ID = property_ID;
		this.customer_ID = customer_ID;
	}

	// getters methods
	public Long getInquiryInformationID() {
		return inquiryInformationID;
	}

	public void setInquiryDate(Date inquiryDate) {
		this.inquiryDate = inquiryDate;
	}

	public Long getProperty_ID() {
		return property_ID;
	}

	public Long getCustomer_ID() {
		return customer_ID;
	}

	// setters methods
	public void setInquiryInformationID(Long inquiryInformationID) {
		this.inquiryInformationID = inquiryInformationID;
	}

	public Date getInquiryDate() {
		return inquiryDate;
	}

	public void setProperty_ID(Long property_ID) {
		this.property_ID = property_ID;
	}

	public void setCustomer_ID(Long customer_ID) {
		this.customer_ID = customer_ID;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (inquiryInformationID != null ? inquiryInformationID.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof PropertyInquiry)) {
			return false;
		}
		PropertyInquiry other = (PropertyInquiry) object;
		if ((this.inquiryInformationID == null && other.inquiryInformationID != null)
				|| (this.inquiryInformationID != null
						&& !this.inquiryInformationID.equals(other.inquiryInformationID))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.codechefs.alphalandandhome.InquiryInformation[ id=" + inquiryInformationID + " ]";
	}

}
