package com.bineesh.liveasyassignment.controller;


import com.bineesh.liveasyassignment.dto.LoadsDto;
import com.bineesh.liveasyassignment.entity.Load;
import com.bineesh.liveasyassignment.service.LoadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class LoadsController {

    @Autowired
    LoadsService loadsService;

    @PostMapping("load")
    public String postLoad(@RequestBody Load load){
        return loadsService.addLoad(load);
    }

    @GetMapping("load")
    public List<LoadsDto> getLoadByShipperId(@RequestParam UUID shipperId){
        return loadsService.getLoadsByShipperId(shipperId);
    }

    @GetMapping("load/{loadId}")
    public Load getLoadById(@PathVariable int loadId){
        return loadsService.getLoadById(loadId);
    }

    @PutMapping("load/{loadId}")
    public String updateLoad(@PathVariable int loadId,@RequestBody LoadsDto load){
        return loadsService.updateLoad(loadId,load);
    }


    @DeleteMapping("load/{loadId}")
    public String deleteLoad(@PathVariable int loadId){
        return loadsService.deleteLoadById(loadId);
    }


}
