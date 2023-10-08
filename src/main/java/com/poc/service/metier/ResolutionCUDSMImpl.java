package com.poc.service.metier;

import com.poc.model.domain.ScenarioResolution;
import com.poc.repository.ResolutionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ResolutionCUDSMImpl implements ResolutionCUDSM {

    private final ResolutionRepository resolutionRepository;

    @Override
    public ScenarioResolution createResolution(ScenarioResolution resolution) {
        resolution.setId(UUID.randomUUID().toString());
        return resolutionRepository.save(resolution);
    }
}
