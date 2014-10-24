/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POJO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hai
 */
public class PhieuNhapKho {
    private Integer PhieuNhapId;
    private Integer MaNCC;
    private Integer MaNV;
    private Integer MaKho;
    private Integer MaNhapKho;
    private String NgayNhap;
    private String TinhTrang;
    private Double TongTriGia;
    private List<ChiTietPhieuNhapKho> DSPhieuNhap;

    public Integer getPhieuNhapId() {
        return PhieuNhapId;
    }

    public void setPhieuNhapId(Integer PhieuNhapId) {
        this.PhieuNhapId = PhieuNhapId;
    }

    public Integer getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(Integer MaNCC) {
        this.MaNCC = MaNCC;
    }

    public Integer getMaNV() {
        return MaNV;
    }

    public void setMaNV(Integer MaNV) {
        this.MaNV = MaNV;
    }

    public Integer getMaKho() {
        return MaKho;
    }

    public void setMaKho(Integer MaKho) {
        this.MaKho = MaKho;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public void setDSCTPhieuNhap(List<ChiTietPhieuNhapKho> ct_phieus){
        this.DSPhieuNhap = new ArrayList<>(ct_phieus);
    }
    
    public List<ChiTietPhieuNhapKho> getDSCTPhieuNhap(){
        return DSPhieuNhap;
    }

    public Integer getMaNhapKho() {
        return MaNhapKho;
    }

    public void setMaNhapKho(Integer MaNhapKho) {
        this.MaNhapKho = MaNhapKho;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    /* Can them chi tiet phieu nhap kho de co the tinh tong tri gia moi chi tiet mat hang*/
    public Double getTongTriGia() {    
        Double Tong = (double)0;
        for(ChiTietPhieuNhapKho CTPhieu: this.DSPhieuNhap){
            Tong += (CTPhieu.getThanhTien() + Tong);
        }
        return TongTriGia;
    }
//
//    public void setTongTriGia(String TongTriGia) {
//        this.TongTriGia = TongTriGia;
//    }
}
