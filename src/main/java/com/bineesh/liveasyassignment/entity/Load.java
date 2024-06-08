package com.bineesh.liveasyassignment.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.UUID;
import java.util.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Load {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int loadId;
    String loadingPoint;
    String unloadingPoint;
    String productType;
    String truckType;
    int noOfTrucks;
    int weight;
    String comment;

    UUID shipperId;

    @JsonFormat(pattern = "dd-MM-yyyy")
    Date date;

}
