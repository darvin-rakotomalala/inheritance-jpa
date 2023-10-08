package com.poc.service.metier;

import com.poc.model.domain.ScenarioResolution;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ResolutionRSM {
    Page<ScenarioResolution> getAllResolutionsByTransport(String transport, Pageable pageable);
}
