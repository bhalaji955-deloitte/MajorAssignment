package com.payementService.paymentServices.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PaymentService {
    public String pay() {
        double num= Math.random();
        if(num%2 == 0){
            return "Paid";
        }
        return "Unpaid";
    }
}
