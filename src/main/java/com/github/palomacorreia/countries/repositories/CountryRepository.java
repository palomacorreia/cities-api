package com.github.palomacorreia.countries.repositories;

import com.github.palomacorreia.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
