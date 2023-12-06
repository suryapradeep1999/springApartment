package com.apartment.management.system.aptmanagement.service;

import com.apartment.management.system.aptmanagement.entity.AptOwner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AptOwnerService {
    public AptOwner addOwner(AptOwner aptOwner);

    public void deleteOwner(Long id);

    void updateOwner(AptOwner aptOwner);

    List<AptOwner> getAllOwnerDetails();
}
