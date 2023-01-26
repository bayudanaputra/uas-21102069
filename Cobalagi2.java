/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cobalagi2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Acer
 */
public class Cobalagi2 {

    public static void main(String[] args) {
        String pil="";
        String ulang="ya";
        float rp=0, usd=0, euro=0, yen=0, pounds=0;
        
        rupiah1 RP = new rupiah1();
        euro ER = new euro();
        yen YN = new yen();
        pounds PD = new pounds();
        
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        
        while("ya".equals(ulang)){
        System.out.println("--------------------------");
        System.out.println("------jenis konversi------");
        System.out.println("--------------------------");
        System.out.println("   1. rupiah ke dolar");
        System.out.println("   2. rupiah ke euro");
        System.out.println("   3. rupiah ke yen");
        System.out.println("   4. rupiah ke pounds");
        System.out.print("pilih konversi = ");
        try{
            pil = dtIN.readLine();
        }catch(IOException e){
            System.out.println("Terjadi kendala");
        }
        switch(pil){
            case "1":
                System.out.print("masukkan Nilai rupiah: ");
                try{
                    rp = Float.parseFloat(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                RP.Setrupiah(rp);
                RP.Setdolar(usd);
                System.out.println("nilai konversi Rp --> $ =  "+RP.konversi()+ " dolar");  
        }
        switch(pil){
            case "2":
                System.out.print("masukkan Nilai rupiah: ");
                try{
                    rp = Float.parseFloat(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                ER.Setrupiah(rp);
                ER.Seteuro(euro);
                System.out.println("nilai konversi Rp --> € =  "+ER.konversi()+ " euro");             
        }
        switch(pil){
            case "3":
                System.out.print("masukkan Nilai rupiah: ");
                try{
                    rp = Float.parseFloat(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                YN.Setrupiah(rp);
                YN.Setyen(yen);
                System.out.println("nilai konversi Rp --> ¥ =  "+YN.konversi()+ " yen");             
        }
        switch(pil){
            case "4":
                System.out.print("masukkan Nilai rupiah: ");
                try{
                    rp = Float.parseFloat(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                PD.Setrupiah(rp);
                PD.Setpounds(pounds);
                System.out.println("nilai konversi Rp --> £ =  "+PD.konversi()+ " poundsterling");           
        }
    }
}
}