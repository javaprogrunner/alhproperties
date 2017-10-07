/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codechefs.alphalandandhome.orm.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author roland
 */
@Entity
@Table(name = "Property")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Property_Type")
public class Property implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long propertyID;
	protected String streetAddress;
	protected int numberOfBedrooms;
	protected int numberOfBathrooms;
	protected int numberOfGarages;

	
	public Property() {
		super();
	}

	public Property(Long propertyID, String streetAddress, int numberOfBedrooms, int numberOfBathrooms,
			int numberOfGarages) {
		super();
		this.propertyID = propertyID;
		this.streetAddress = streetAddress;
		this.numberOfBedrooms = numberOfBedrooms;
		this.numberOfBathrooms = numberOfBathrooms;
		this.numberOfGarages = numberOfGarages;
	}

	// Getters Methods
	public Long getPropertyID() {
		return propertyID;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public int NumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public int NumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public int NumberOfGarages() {
		return numberOfGarages;
	}

	// Setters Methods
	public void setPropertyID(Long propertyID) {
		this.propertyID = propertyID;
	}

	public void SetStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public void SetNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public void SetNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	public void SetNumberOfGarages(int numberOfGarages) {
		this.numberOfGarages = numberOfGarages;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (propertyID != null ? propertyID.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Property)) {
			return false;
		}
		Property other = (Property) object;
		if ((this.propertyID == null && other.propertyID != null)
				|| (this.propertyID != null && !this.propertyID.equals(other.propertyID))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.codechefs.alphalandandhome.Property[ id=" + propertyID + " ]";
	}

}
