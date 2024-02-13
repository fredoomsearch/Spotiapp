package com.MiPrimerApi.MiPrimeraApi.domain.dto.spotifyDtos;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tracks{
    private String href;
    private ArrayList<Item> items;
    private int limit;
    private Object next;
    private int offset;
    private Object previous;
    private int total;
}

