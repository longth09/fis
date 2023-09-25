package com.demo.speacks.infrastructure.repository;

import com.demo.speacks.domain.model.Speakers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeackRepository extends JpaRepository<Speakers, Long> {
}
