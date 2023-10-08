package com.poc.repository;

import com.poc.model.domain.ScenarioResolution;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResolutionRepository extends JpaRepository<ScenarioResolution, String> {
    Page<ScenarioResolution> findByTransport(String transport, Pageable pageable);
}
