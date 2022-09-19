package com.example.b4.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "maybay")
@Data
public class MayBay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MaMB;
    private String Loai;
    private String TamBay;
    @ManyToMany(mappedBy = "mayBays")
    private List<NhanVien> nhanViens;
}
