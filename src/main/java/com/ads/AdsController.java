package com.ads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdsController {
    @Autowired
    private AdsRepository adsRepository;

    @RequestMapping(value = "/getAllAds", method = RequestMethod.GET)
    public List<Ads> getAllPets() {
        return adsRepository.findAll();
    }

}
