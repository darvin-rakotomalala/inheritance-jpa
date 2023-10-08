package com.poc.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "resolution")
@Getter
@Setter
@ToString
public class ScenarioResolution extends Resolution {

    private String comment;
    private String orl;
    private String siteXdock;
}
