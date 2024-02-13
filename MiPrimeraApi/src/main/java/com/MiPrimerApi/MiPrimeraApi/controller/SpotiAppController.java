package com.MiPrimerApi.MiPrimeraApi.controller;

import com.MiPrimerApi.MiPrimeraApi.domain.dto.CancionDTO;
import com.MiPrimerApi.MiPrimeraApi.domain.dto.spotifyDtos.AlbumDTO;
import com.MiPrimerApi.MiPrimeraApi.service.MyFirstService;
import com.MiPrimerApi.MiPrimeraApi.service.SpotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/spotiApp")
public class SpotiAppController {

    @Autowired
    private SpotifyService spotifyService;

    @PostMapping("/saveToken")
    public String saveToken(){
        return spotifyService.saveTokenOnBD();
    }

    @GetMapping("/getToken")
    public String getToken(){
        return spotifyService.getTokenFromBD();
    }


    @ResponseBody
    @GetMapping("/getAlbum/{nombreAlbum}")
    public AlbumDTO getAlbumTheHives(@PathVariable("nombreAlbum") String nombreAlbum) {
        return spotifyService.getAlbum(nombreAlbum);
    }

}
