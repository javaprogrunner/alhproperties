/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codechefs.alphalandandhome.orm.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author roland
 */
@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String mobileNumber;

    //one to many relationship to PropertyInquiry
    @OneToMany
    private List<PropertyInquiry> inquiries;
    
    public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String emailAddress, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.mobileNumber = mobileNumber;
	}
    
    //Getters Method
    public Long getCustomerID() {
        return customerID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public List<PropertyInquiry> getInquiries(){
        return inquiries;
    }

    //Setters Method
    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public void setInquiries(List<PropertyInquiry> inquiries){
        this.inquiries = inquiries;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerID != null ? customerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerID == null && other.customerID != null) || (this.customerID != null && !this.customerID.equals(other.customerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codechefs.alphalandandhome.Customer[ id=" + customerID + " ]";
    }
    
}
