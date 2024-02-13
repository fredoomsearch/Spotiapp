package com.MiPrimerApi.MiPrimeraApi.domain.entity;

import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TokenEntity {

    @Id
    int id;

    @Column(name = "TOKEN")
    String token;

    @Column(name = "FECHA")
    String fecha;



}
