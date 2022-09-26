package com.example.b4.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chuyenbay")
@Data
public class ChuyenBay{

    @Id
    private String maCB;
    private String gaDi;
    private String gaDen;
    private String doDai;
    private String gioDi;
    private String gioDen;
    private Integer chiPhi;
}
