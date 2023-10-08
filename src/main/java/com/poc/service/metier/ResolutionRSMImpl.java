package com.poc.service.metier;

import com.poc.model.domain.ScenarioResolution;
import com.poc.repository.ResolutionRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResolutionRSMImpl implements ResolutionRSM {

    private final ResolutionRepository resolutionRepository;

    @Override
    public Page<ScenarioResolution> getAllResolutionsByTransport(String transport, Pageable pageable) {
        if (StringUtils.isBlank(transport)) {
            return resolutionRepository.findAll(pageable);
        }
        return resolutionRepository.findByTransport(transport, pageable);
    }
}
