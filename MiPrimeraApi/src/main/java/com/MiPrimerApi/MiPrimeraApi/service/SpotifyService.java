package com.MiPrimerApi.MiPrimeraApi.service;

import com.MiPrimerApi.MiPrimeraApi.domain.dto.enums.AlbumesEnum;
import com.MiPrimerApi.MiPrimeraApi.domain.dto.spotifyDtos.AlbumDTO;
import com.MiPrimerApi.MiPrimeraApi.domain.entity.TokenEntity;
import com.MiPrimerApi.MiPrimeraApi.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpotifyService {

    @Autowired
    TokenRepository tokenRepository;

    public String saveTokenOnBD(){
        TokenEntity tokenEntity = TokenEntity.builder()
                .id(1)
                .token("Bearer BQBh29Gcb3X22vBh-T-EtncwFwOiIzqGE4rOt67595ACkKpQxv9jr9kQkvD0c6NmZ0pfyqknYYpu27nr0QeXrweRpXVjI3qrlpQbPmXsaP143hJI1v4")
                .build();
        return tokenRepository.save(tokenEntity).getToken();
    }




    public String getTokenFromBD(){
        return tokenRepository.findById(1).get().getToken();
    }


    public AlbumDTO getAlbum(String nombreAlbum){

        String albumId = AlbumesEnum.valueOf(nombreAlbum).getId();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", "Bearer BQBh29Gcb3X22vBh-T-EtncwFwOiIzqGE4rOt67595ACkKpQxv9jr9kQkvD0c6NmZ0pfyqknYYpu27nr0QeXrweRpXVjI3qrlpQbPmXsaP143hJI1v4");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<AlbumDTO> response=
        restTemplate.exchange(
        "https://api.spotify.com/v1/albums/"+albumId,
        HttpMethod.GET,
        new HttpEntity<>(headers),
        AlbumDTO.class);
        return response.getBody();
    }

}
