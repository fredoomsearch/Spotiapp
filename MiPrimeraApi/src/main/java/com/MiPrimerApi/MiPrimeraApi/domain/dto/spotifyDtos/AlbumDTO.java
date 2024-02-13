package com.MiPrimerApi.MiPrimeraApi.domain.dto.spotifyDtos;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlbumDTO {
    private String album_type;
    private ArrayList<Artist> artists;
    private ArrayList<String> available_markets;
    private ArrayList<Copyright> copyrights;
    private ExternalIds external_ids;
    private ExternalUrls external_urls;
    private ArrayList<Object> genres;
    private String href;
    private String id;
    private ArrayList<Image> images;
    private String label;
    private String name;
    private int popularity;
    private String release_date;
    private String release_date_precision;
    private int total_tracks;
    private Tracks tracks;
    private String type;
    private String uri;
}