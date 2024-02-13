package com.MiPrimerApi.MiPrimeraApi.domain.dto.spotifyDtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Image{
    private int height;
    private String url;
    private int width;
}

