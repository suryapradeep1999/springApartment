package com.apartment.management.system.aptmanagement.controller;

import com.apartment.management.system.aptmanagement.entity.AptOwner;
import com.apartment.management.system.aptmanagement.service.AptOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AptController {
    @Autowired
    AptOwnerService service;


    @PostMapping("/addowner")
    public ResponseEntity<AptOwner> addOwner(@RequestBody AptOwner aptOwner){
       return new ResponseEntity<>( service.addOwner(aptOwner),HttpStatus.CREATED);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> addOwner(@PathVariable("id") Long id ){
         service.deleteOwner(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateOwner(@RequestBody AptOwner aptOwner){
        service.updateOwner(aptOwner);
        return new ResponseEntity<>("",HttpStatus.OK);
    }

    @GetMapping("/getdetails")
    public ResponseEntity<List<AptOwner>> getDetails(){
        List<AptOwner> ownerList = new ArrayList<>();
        ownerList = service.getAllOwnerDetails();

        if(ownerList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(ownerList,HttpStatus.OK);
        }
    }


}
