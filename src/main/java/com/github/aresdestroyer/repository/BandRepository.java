package com.github.aresdestroyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.aresdestroyer.domain.Band;

public interface BandRepository extends JpaRepository<Band, Long> {

}
