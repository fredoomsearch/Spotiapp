package com.MiPrimerApi.MiPrimeraApi.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CancionDTO {
    private String nombre;
    private String artista;
    private String duracion;
    private String genero;
}
