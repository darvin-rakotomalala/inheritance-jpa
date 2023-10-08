package com.poc.service.applicatif;

import com.poc.mapper.ScenarioResolutionMapper;
import com.poc.model.dto.ScenarioResolutionDTO;
import com.poc.service.metier.ResolutionCUDSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResolutionCUDSAImpl implements ResolutionCUDSA {

    private final ResolutionCUDSM resolutionCUDSM;
    private final ScenarioResolutionMapper scenarioResolutionMapper;

    @Override
    public ScenarioResolutionDTO createResolution(ScenarioResolutionDTO resolution) {
        return scenarioResolutionMapper.toDTO(resolutionCUDSM.createResolution(
                scenarioResolutionMapper.toDO(resolution)));
    }
}
