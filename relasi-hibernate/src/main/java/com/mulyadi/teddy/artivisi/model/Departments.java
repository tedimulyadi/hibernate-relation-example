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
@Table(name="department")
public class Departments {
    
    @Id
    private long department_id;
    
    private String department_name;
    
    @ManyToOne
    @JoinColumn(name="location_id")
    private Locations location;
}
