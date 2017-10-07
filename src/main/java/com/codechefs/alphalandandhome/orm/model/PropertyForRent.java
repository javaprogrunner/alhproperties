/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codechefs.alphalandandhome.orm.model;

import java.io.Serializable;

import javax.persistence.Entity;
/**
 *
 * @author roland
 */
@Entity
public class PropertyForRent extends Property implements Serializable {

    private static final long serialVersionUID = 1L;

    private double rentPerWeek;
    
    
    public PropertyForRent() {
		super();
	}

	public PropertyForRent(Long propertyID, String streetAddress, int numberOfBedrooms, int numberOfBathrooms,
			int numberOfGarages, double rentPerWeek) {
		super(propertyID, streetAddress, numberOfBedrooms, numberOfBathrooms, numberOfGarages);
		this.rentPerWeek = rentPerWeek;
	}

	public double getRentPerWeek() {
        return rentPerWeek;
    }

    public void SetRentPerWeek(double rentPerWeek) {
        this.rentPerWeek= rentPerWeek;
    }
}
