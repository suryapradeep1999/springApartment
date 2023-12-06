package com.apartment.management.system.aptmanagement.repository;

import com.apartment.management.system.aptmanagement.entity.AptOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AptOwnerRepository extends JpaRepository<AptOwner,Long> {

}
