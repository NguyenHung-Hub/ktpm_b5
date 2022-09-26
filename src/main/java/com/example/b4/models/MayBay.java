package com.example.b4.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "maybay")
@Data
public class MayBay {
    @Id
    private String maMB;
    private String loai;
    private String tamBay;
    @ManyToMany(mappedBy = "mayBays", fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    private List<NhanVien> nhanViens;
}
