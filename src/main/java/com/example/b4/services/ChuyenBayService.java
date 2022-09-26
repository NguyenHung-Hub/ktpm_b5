package com.example.b4.services;

import com.example.b4.models.ChuyenBay;

import java.util.List;

public interface ChuyenBayService {
    List<ChuyenBay> getAll();
    ChuyenBay getById(String maCB);
    ChuyenBay create(ChuyenBay chuyenBay);
    ChuyenBay update(ChuyenBay chuyenBay);

    List<ChuyenBay>  findChuyenBayByGaDen(String gaDen);


}