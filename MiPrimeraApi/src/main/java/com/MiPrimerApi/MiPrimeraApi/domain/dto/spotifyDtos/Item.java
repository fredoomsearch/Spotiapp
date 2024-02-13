package com.MiPrimerApi.MiPrimeraApi.domain.dto.spotifyDtos;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item{
    private ArrayList<Artist> artists;
    private ArrayList<String> available_markets;
    private int disc_number;
    private int duration_ms;
    private boolean explicit;
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private boolean is_local;
    private String name;
    private String preview_url;
    private int track_number;
    private String type;
    private String uri;
}