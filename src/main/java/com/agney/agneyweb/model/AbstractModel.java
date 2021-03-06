package com.agney.agneyweb.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractModel {
    @Id
    @GeneratedValue
    private long id;
}
