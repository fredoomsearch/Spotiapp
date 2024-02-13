package com.MiPrimerApi.MiPrimeraApi.repository;

import com.MiPrimerApi.MiPrimeraApi.domain.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<TokenEntity, Integer> {

}
