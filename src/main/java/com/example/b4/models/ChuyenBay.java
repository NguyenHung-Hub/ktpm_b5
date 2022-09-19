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
    private String MaCB;
    private String GaDi;
    private String GaDen;
    private String DoDai;
    private String GioDi;
    private String GioDen;
    private String ChiPhi;
}
