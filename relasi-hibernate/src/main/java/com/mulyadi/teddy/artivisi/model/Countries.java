/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mulyadi.teddy.artivisi.model;

import javax.persistence.Column;
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
@Table(name="countries")
public class Countries {
    @Id
    @Column(length = 2)
    private long country_id;
    
    @Column(length= 40)
    private String country_name;
    
    @ManyToOne
    @JoinColumn(name="region_id")
    private Regions region;
}
