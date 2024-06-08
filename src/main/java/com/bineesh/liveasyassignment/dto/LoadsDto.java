package com.bineesh.liveasyassignment.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoadsDto {
    String loadingPoint;
    String unloadingPoint;
    String productType;
    String truckType;
    int noOfTrucks;
    int weight;
    String comment;


    @JsonFormat(pattern = "dd-MM-yyyy")
    Date date;
}
