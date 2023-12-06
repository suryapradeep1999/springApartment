package com.apartment.management.system.aptmanagement.serviceimpl;

import com.apartment.management.system.aptmanagement.entity.AptOwner;
import com.apartment.management.system.aptmanagement.repository.AptOwnerRepository;
import com.apartment.management.system.aptmanagement.service.AptOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AptOwnerServiceImpl implements AptOwnerService {
    @Autowired
    AptOwnerRepository aptOwnerRepository;
    @Override
    public AptOwner addOwner(AptOwner aptOwner) {
        return aptOwnerRepository.save(aptOwner);

    }

    @Override
    public void deleteOwner(Long id) {
        aptOwnerRepository.deleteById(id);
    }

    @Override
    public void updateOwner(AptOwner aptOwner) {
        Optional<AptOwner> aptOwner1=aptOwnerRepository.findById(aptOwner.getId());
        if(aptOwner1.isPresent()){
            aptOwner1.get().setEmail(aptOwner.getEmail());
            aptOwner1.get().setOwnerName(aptOwner.getOwnerName());
            aptOwner1.get().setApartmentName(aptOwner.getApartmentName());
        }
        aptOwnerRepository.save(aptOwner);

    }

    @Override
    public List<AptOwner> getAllOwnerDetails() {
        List<AptOwner> ownerList = new ArrayList<>();
        try {
            ownerList= aptOwnerRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return ownerList;
    }

}
