package com.apartment.management.system.aptmanagement.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AptOwnerReq {
    private String name;
    private int flatNumber;
}
