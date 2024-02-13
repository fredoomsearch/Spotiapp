package com.MiPrimerApi.MiPrimeraApi.service;

import com.MiPrimerApi.MiPrimeraApi.domain.dto.CancionDTO;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

        public CancionDTO getADondeVas(){
            CancionDTO aDondeIras = new CancionDTO();

            aDondeIras.setNombre("A donde vas");
            aDondeIras.setArtista("EUKZ");
            aDondeIras.setDuracion("3:33");
            aDondeIras.setGenero("Punk chimbita");

            return aDondeIras;
        }


    public CancionDTO getEnTrajeNegro(){
        //Otra cancion Con Lombok :D
        CancionDTO enTrajeNegro = CancionDTO.builder()
                .nombre("enTrajeNegro")
                .artista("profe JuanGa")
                .duracion("5:00")
                .genero("Rock and roll para borrachos y degenerados")
                .build();

        return enTrajeNegro;
    }

}
