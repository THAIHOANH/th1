
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thaih
 */
public class LopHocPhan {
    String maLHP;
    String tenLHP;
    String tenGV;
    String thongtinlophoc;
    sinhvien dsSV;

    public LopHocPhan(){}
    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongtinlophoc, sinhvien dsSV) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongtinlophoc = thongtinlophoc;
        this.dsSV = dsSV;
    }
    public int getsoluongSV(){
        int soluongSv = 0;
        return soluongSv;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongtinlophoc() {
        return thongtinlophoc;
    }

    public void setThongtinlophoc(String thongtinlophoc) {
        this.thongtinlophoc = thongtinlophoc;
    }

    public sinhvien getDsSV() {
        return dsSV;
    }

    public void setDsSV(sinhvien dsSV) {
        this.dsSV = dsSV;
    }
    

    @Override
    public String toString() {
        return "LopHocPhan{" + "maLHP=" + maLHP + ", tenLHP=" + tenLHP + ", tenGV=" + tenGV + ", thongtinlophoc=" + thongtinlophoc + ", dsSV=" + dsSV + '}';
    }
 
  }  

class sinhvien{
    String masv;
    String hoten;

    public sinhvien(){}
    public sinhvien(String masv, String hoten) {
        this.masv = masv;
        this.hoten = hoten;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return "sinhvien{" + "masv=" + masv + ", hoten=" + hoten + '}';
    }
  
}
class main{
    public static void main(String[] args) {
        LopHocPhan a = new LopHocPhan();
        a.maLHP="123456";
        a.tenLHP="LT huong doi tuong";
        a.tenGV="Nguyen Van A";
        a.thongtinlophoc="Thu 7, Tiet 4-6, phong A1.1";
        sinhvien sv1=new sinhvien();
        sinhvien sv2=new sinhvien();
        sinhvien sv3=new sinhvien();
        sv1.masv="123";
        sv1.hoten="Nguyen Van A";
        sv2.masv="543";
        sv2.hoten="Le Thi B";
        sv3.masv="321";
        sv3.hoten="Luong Van C";
    }
}
