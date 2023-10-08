package com.poc.service.applicatif;

import com.poc.model.dto.ScenarioResolutionDTO;
import com.poc.utils.HelpPage;
import org.springframework.data.domain.Pageable;

public interface ResolutionRSA {
    HelpPage<ScenarioResolutionDTO> getAllResolutionsByTransport(String transport, Pageable pageable);
}
