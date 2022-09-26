package com.example.b4.models;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "nhanvien")
@Data
public class NhanVien {
    @Id
    private String maNV;
    private String ten;
    private Integer luong;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinTable(name = "chungnhan", joinColumns = {@JoinColumn(name = "maNV")},
    inverseJoinColumns = {@JoinColumn(name = "maMB")})
    private List<MayBay> mayBays;
}
