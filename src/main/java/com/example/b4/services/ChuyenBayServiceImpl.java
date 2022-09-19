package com.example.b4.services;

import com.example.b4.models.ChuyenBay;
import com.example.b4.repository.ChuyenBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{

    private final ChuyenBayRepository chuyenBayRepository;

    @Autowired
    public  ChuyenBayServiceImpl(ChuyenBayRepository chuyenBayRepository){
        this.chuyenBayRepository = chuyenBayRepository;
    }

    @Override
    public ChuyenBay create(ChuyenBay chuyenBay) {
        return chuyenBayRepository.saveAndFlush(chuyenBay);
    }

//    @Override
//    public ChuyenBay getById(String maCB) {
//        return chuyenBayRepository.findByMaCB(maCB);
//    }
}
