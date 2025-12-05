package com.example.demo.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.cloudvendor;
@RestController
@RequestMapping("/")
public class cloudAPIservice {
    cloudvendor cloudvendor;
    @GetMapping("{vendorId}")
    public cloudvendor getVendorDetails(@PathVariable String vendorId) {
        return cloudvendor;
       //return new cloudvendor("AWS", "USA", "123-456-7890", "V001");
    }
 @PostMapping
    public String createcloudvendordetails(@RequestBody cloudvendor vendor){
        //@RequestBody will convert this JSON into your Java object.
        this.cloudvendor=vendor;
    return ("cloud vendor successfully created");
    }
    @PutMapping
        public String updatecloudvendordetails(@RequestBody cloudvendor vendor){
        this.cloudvendor=vendor;
    return "cloud vendor successfully updated";
    }
    @DeleteMapping("{vendorId}")
    public String deletecloudvendordetails(@PathVariable String vendorId){
        this.cloudvendor=null;
    return "cloud vendor successfully deleted";
    }
}

