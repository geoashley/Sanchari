package com.sanchari.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@Data
public class Trip {
    @Id
    private long id;

    private String tripName;


}
