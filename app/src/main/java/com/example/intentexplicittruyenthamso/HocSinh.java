package com.example.intentexplicittruyenthamso;

import java.io.Serializable;

public class HocSinh implements Serializable {
    private String HoTen;
    private int Namsinh;

    public HocSinh(String hoTen, int namsinh) {
        HoTen = hoTen;
        Namsinh = namsinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int namsinh) {
        Namsinh = namsinh;
    }
}
