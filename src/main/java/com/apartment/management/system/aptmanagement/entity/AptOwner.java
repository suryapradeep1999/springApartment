package com.apartment.management.system.aptmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "apt_owner")
public class AptOwner  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String ownerName;
    @Column(nullable = false)
    private String flatNo;
    @Column(nullable = false)
    private String apartmentName;
    @Column(nullable = false, unique = true)
    private String email;
}
