package com.poc.model.domain;

import com.poc.model.common.AuditModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "resolution")
@Getter
@Setter
public class Resolution extends AuditModel {

    @Id
    private String id;
    private String name;
    private String transport;
    private double cost;
    private String userName;
}
