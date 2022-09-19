package com.example.b4.repository;

import com.example.b4.models.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay,String> {
//    ChuyenBay findByMaCB(String maCB);

}
