package com.MiPrimerApi.MiPrimeraApi.controller;

import com.MiPrimerApi.MiPrimeraApi.domain.dto.CancionDTO;
import com.MiPrimerApi.MiPrimeraApi.service.MyFirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/myController")
public class MiPrimerController {

    @Autowired
    private MyFirstService myFirstService;

    @ResponseBody
    @GetMapping("/myService")
    public CancionDTO getADondeVas() {
        return myFirstService.getADondeVas();
    }

}
