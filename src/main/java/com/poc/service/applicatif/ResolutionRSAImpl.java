package com.poc.service.applicatif;

import com.poc.mapper.ScenarioResolutionMapper;
import com.poc.model.dto.ScenarioResolutionDTO;
import com.poc.service.metier.ResolutionRSM;
import com.poc.utils.HelpPage;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResolutionRSAImpl implements ResolutionRSA {

    private final ResolutionRSM resolutionRSM;
    private final ScenarioResolutionMapper resolutionMapper;

    @Override
    public HelpPage<ScenarioResolutionDTO> getAllResolutionsByTransport(
            String transport, Pageable pageable) {
        return resolutionMapper.toDTO(resolutionRSM.getAllResolutionsByTransport(
                transport, pageable), pageable);
    }
}
