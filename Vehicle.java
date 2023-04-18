/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thaih
 */
public class Vehicle {
       String tenchuxe;
       String loaixe;
       double dungtich;
       int trigia;
       double thuephainop;
       
       public Vehicle(){}
       
       public Vehicle( String tenchuxe, String loaixe, double dungtich, int trigia, double thuephainop){
           this.tenchuxe = tenchuxe;
           this.loaixe = loaixe;
           this.dungtich = dungtich;
           this.trigia = trigia;
           this.thuephainop = thuephainop;
       }
       public String getTenchuxe(){
           return tenchuxe;
       }
       public void setTenchuxe(String tenchuxe){
           this.tenchuxe = tenchuxe;
       }
       public String getLoaixe(){
           return loaixe;
       }
       public void setLoaixe(String loaixe){
           this.loaixe = loaixe;
       }
       public double getDungtich(){
           return dungtich;
       }
       public void setDungtich(double dungtich){
           this.dungtich = dungtich;
       }
       public int getTrigia(){
           return trigia;
       }
       public void setTrigia(int trigia){
           this.trigia = trigia;
       }
       public double getThuephainop(){
           return thuephainop;
       }
       public void setThuephainop(double thuephainop){
           this.thuephainop = thuephainop;
       }
       public double Tinhthuephainop(){
           if (this.getDungtich()<100){
               return this.getTrigia() *0.01;
           }
           else if (this.getDungtich()>=100 && this.getDungtich()<=200){
               return this.getTrigia() *0.03;
           }
           else {
           return this.getTrigia()*0.05;
       }
       }
       public void nhap(){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Nhap ten chu xe:");
           tenchuxe = scanner.nextLine();
           System.out.println("Nhap loai xe:");
           loaixe = scanner.nextLine();
           System.out.println("Nhap dung tich:");
           dungtich = scanner.nextDouble();
           System.out.println("Nhap tri gia:");
           trigia = scanner.nextInt();
           System.out.println("Nhap thue phai nop:");
           thuephainop =scanner.nextDouble();

       }
       public void xuat(){
           System.out.println("ten chu xe:"+tenchuxe);
           System.out.println("loai xe"+ loaixe);
           System.out.println("dung tich"+dungtich);
           System.out.println("tri gia"+trigia);
           System.out.println("thue phai nop"+thuephainop);
       }
       class QuanLy {
       
    ArrayList<Vehicle>vh; 
    public QuanLy(){
        vh= new ArrayList<>();
    }
    public void them(Vehicle a){
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng cần thêm:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Lần nhập thứ "+ (i+1)+":");
            a = new Vehicle();
            a.nhap();
           vh.add(a);
        }
    }
       
       public void xuat(){
           for(Vehicle x:vh){
               x.xuat();
           }
       }
    public void menu(){
        System.out.println("nhap thon tin xe:");
        System.out.println("Xuat thong ke khai thue");
        System.out.println("thoat!");
    }
       }
       class Main {
    public static void main(String[] args) {
        QuanLy a = null;
        Vehicle c = new Vehicle();
        int n;
       Scanner sc= new Scanner(System.in);
       do
      {
      a.menu();
      System.out.print("Lựa chọn: ");
     n= sc.nextInt();
     switch(n)
    {
    case 1:{
        a.them(c);
        break;
    }
    case 2:{
        a.xuat();
        break;
    }
    case 3:
    
        break;
        default:
break;
    }
      
      }
       while(n!3);
       }    
       }
       
       
 
     
      