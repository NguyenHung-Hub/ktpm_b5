package com.example.b4.services;

import com.example.b4.models.ChuyenBay;
import com.example.b4.repository.ChuyenBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{

    private final ChuyenBayRepository chuyenBayRepository;

    @Autowired
    public  ChuyenBayServiceImpl(ChuyenBayRepository chuyenBayRepository){
        this.chuyenBayRepository = chuyenBayRepository;
    }



    @Override
    public List<ChuyenBay> getAll() {
        return chuyenBayRepository.findAll();
    }

    @Override
    public ChuyenBay getById(String maCB) {
        return chuyenBayRepository.findByMaCB(maCB);
    }


    @Override
    public ChuyenBay create(ChuyenBay chuyenBay) {
        return chuyenBayRepository.saveAndFlush(chuyenBay);
    }
    @Override
    public ChuyenBay update(ChuyenBay chuyenBay) {
        return chuyenBayRepository.save(chuyenBay);
    }

    @Override
    public List<ChuyenBay>  findChuyenBayByGaDen(String gaDen) {
        return chuyenBayRepository.findChuyenBayByGaDen(gaDen);
    }

}
