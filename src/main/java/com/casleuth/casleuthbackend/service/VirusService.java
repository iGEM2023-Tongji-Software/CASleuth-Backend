package com.casleuth.casleuthbackend.service;

import com.casleuth.casleuthbackend.entity.virus;
import com.casleuth.casleuthbackend.mapper.VirusMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VirusService {

    @Autowired
    private VirusMapper virusMapper;
   public List selectPage(Integer pageNum, Integer pageSize, String name){
       return virusMapper.selectPage(pageNum, pageSize, name);
   }

    public Integer selectTotalNum(String name) {
       return virusMapper.selectTotalNum(name);
    }

    public virus selectVirusById(int virusId) {
       return virusMapper.selectVirusById(virusId);
    }

    public String selectAccession(int virusId,String type) {
       return virusMapper.selectAccession(virusId,type);
    }

}