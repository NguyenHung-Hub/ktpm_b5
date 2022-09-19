package com.example.b4.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "nhanvien")
@Data
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MaNV;
    private String Ten;
    private String Luong;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinTable(name = "chungnhan", joinColumns = {@JoinColumn(name = "MaNV")},
    inverseJoinColumns = {@JoinColumn(name = "MaMB")})
    private List<MayBay> mayBays;
}
