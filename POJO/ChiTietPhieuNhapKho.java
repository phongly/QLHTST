/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POJO;

import java.sql.Date;

/**
 *
 * @author hai
 */
public class ChiTietPhieuNhapKho {
   

    public Integer getMaCTPNhapKho() {
        return MaCTPNhapKho;
    }

    public void setMaCTPNhapKho(Integer MaCTPNhapKho) {
        this.MaCTPNhapKho = MaCTPNhapKho;
    }

    public Integer getMaNhapKho() {
        return MaNhapKho;
    }

    public void setMaNhapKho(Integer MaNhapKho) {
        this.MaNhapKho = MaNhapKho;
    }

    public Integer getMaMatHang() {
        return MaMatHang;
    }

    public void setMaMatHang(Integer MaMatHang) {
        this.MaMatHang = MaMatHang;
    }

    public Integer getSoluong() {
        return Soluong;
    }

    public void setSoluong(Integer Soluong) {
        this.Soluong = Soluong;
    }

    public Integer getDonGia() {
        return DonGia;
    }

    public void setDonGia(Integer DonGia) {
        this.DonGia = DonGia;
    }

    public Integer getChietKhau() {
        return ChietKhau;
    }

    public void setChietKhau(Integer ChietKhau) {
        this.ChietKhau = ChietKhau;
    }

    public String getNgayCapNhat() {
        return NgayCapNhat;
    }

    public void setNgayCapNhat(String NgayCapNhat) {
        this.NgayCapNhat = NgayCapNhat;
    }

    public Double getThanhTien() {
        return this.ThanhTien = (double) Soluong*DonGia;
    }

    public void setThanhTien(Double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
    private Integer MaCTPNhapKho;
    private Integer MaNhapKho;
    private Integer MaMatHang;
    private Integer Soluong;
    private Integer DonGia;
    private Integer ChietKhau;
    private String NgayCapNhat;
    private Double ThanhTien;
}
