package com.mulyadi.teddy.artivisi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author teddy
 */
@Entity
@Table(name="regions")
public class Regions {
    @Id
    private long region_id;
    
    @Column(length = 25)
    private long region_name;

    
}
