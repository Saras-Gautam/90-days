package com.post.priceservice.controll;

import com.post.priceservice.modell.Price;
import com.post.priceservice.services.PriceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PriceController {
    @Autowired
    PriceService priceService;

    @GetMapping("/price")
    public List<Price> getPriceList(){
        return priceService.getPriceList();
    }

    @PostMapping("/price")
    public Boolean addPriceList(@RequestBody Price price){
        priceService.addPriceList(price);
        return true;
    }
}