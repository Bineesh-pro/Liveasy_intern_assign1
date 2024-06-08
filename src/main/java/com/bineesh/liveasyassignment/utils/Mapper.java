package com.bineesh.liveasyassignment.utils;

import com.bineesh.liveasyassignment.dto.LoadsDto;
import com.bineesh.liveasyassignment.entity.Load;

import java.util.List;

public class Mapper {
    public static List<LoadsDto> mapToLoadsDto(List<Load> loads){
        return loads.stream().map(t->new LoadsDto(
                t.getLoadingPoint(),
                t.getUnloadingPoint(),
                t.getProductType(),
                t.getTruckType(),
                t.getNoOfTrucks(),
                t.getWeight(),
                t.getComment(),
                t.getDate()
        )).toList();
    }

    public static Load mapToLoad(LoadsDto load,Load l) {
        l.setLoadingPoint(load.getLoadingPoint());
        l.setUnloadingPoint(load.getUnloadingPoint());
        l.setProductType(load.getProductType());
        l.setTruckType(load.getTruckType());
        l.setNoOfTrucks(load.getNoOfTrucks());
        l.setWeight(load.getWeight());
        l.setComment(load.getComment());
        l.setDate(load.getDate());

        return l;
    }
}
