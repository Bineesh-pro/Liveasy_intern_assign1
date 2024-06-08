package com.bineesh.liveasyassignment.service;


import com.bineesh.liveasyassignment.dto.LoadsDto;
import com.bineesh.liveasyassignment.entity.Load;
import com.bineesh.liveasyassignment.exception.LoadNotFoundException;
import com.bineesh.liveasyassignment.repo.LoadsRepo;
import com.bineesh.liveasyassignment.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LoadsService {

    @Autowired
    LoadsRepo loadsRepo;

    public String addLoad(Load load){
        loadsRepo.save(load);
        return "loads details added successfully";
    }


    public List<LoadsDto> getLoadsByShipperId(UUID shipperId){
        return Mapper.mapToLoadsDto(loadsRepo.findAllByShipperId(shipperId));
    }

    public Load getLoadById(int loadId){
        return loadsRepo.findById(loadId).orElseThrow(() -> new LoadNotFoundException("no load with such load id"));
    }

    public String deleteLoadById(int loadId){
        loadsRepo.deleteById(loadId);
        return "deleted load with id "+loadId;
    }

    public String updateLoad(int loadId,LoadsDto load){
        Load l = loadsRepo.findById(loadId).orElseThrow(() -> new LoadNotFoundException("no such load"));
        loadsRepo.save(Mapper.mapToLoad(load,l));
        return "load updated";
    }

}
