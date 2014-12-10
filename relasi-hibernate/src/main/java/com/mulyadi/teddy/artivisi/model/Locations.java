/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mulyadi.teddy.artivisi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author teddy
 */
@Entity
@Table(name="locations")
public class Locations {
    
    @Id
    private long location_id;
    
    private String street_address;
    
    private String postal_code;
    
    private String city;
    
    private String state_province;
    
    @ManyToOne
    @JoinColumn(name="country_id")
    private Countries country_id;
}
