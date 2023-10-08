package com.poc.mapper;

import com.poc.common.mapper.DtoMapper;
import com.poc.model.domain.ScenarioResolution;
import com.poc.model.dto.ScenarioResolutionDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ScenarioResolutionMapper extends DtoMapper<ScenarioResolutionDTO, ScenarioResolution> {

}
