package com.poc.controller;

import com.poc.model.dto.ScenarioResolutionDTO;
import com.poc.service.applicatif.ResolutionCUDSA;
import com.poc.service.applicatif.ResolutionRSA;
import com.poc.utils.HelpPage;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "resolutions")
@RequiredArgsConstructor
public class ResolutionController {

    private final ResolutionCUDSA resolutionCUDSA;
    private final ResolutionRSA resolutionRSA;

    @PostMapping
    public ScenarioResolutionDTO createResolution(@RequestBody ScenarioResolutionDTO resolution) {
        return resolutionCUDSA.createResolution(resolution);
    }

    @GetMapping
    public HelpPage<ScenarioResolutionDTO> getAllResolutionsByTransport(
            @RequestParam(name = "transport", required = false) String transport,
            @RequestParam(defaultValue = "0", required = false) int page,
            @RequestParam(defaultValue = "15", required = false) int size) {
        Pageable pageable = PageRequest.of(page, size);
        return resolutionRSA.getAllResolutionsByTransport(transport, pageable);
    }

}
