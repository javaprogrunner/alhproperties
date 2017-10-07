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
public class PropertyForSale extends Property implements Serializable {

    private static final long serialVersionUID = 1L;

    private double salePrice;
    
    public PropertyForSale() {
		super();
	}

	public PropertyForSale(Long propertyID, String streetAddress, int numberOfBedrooms, int numberOfBathrooms,
			int numberOfGarages, double salePrice) {
		super(propertyID, streetAddress, numberOfBedrooms, numberOfBathrooms, numberOfGarages);
		this.salePrice = salePrice;
	}

	public double getSalePrice() {
        return salePrice;
    }

    public void SetSalePrice(double salePrice) {
        this.salePrice= salePrice;
    }

}
