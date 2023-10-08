package com.poc.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ScenarioResolutionDTO extends ResolutionDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String comment;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orl;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String siteXdock;
}
