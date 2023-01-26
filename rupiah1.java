/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cobalagi2;

/**
 *
 * @author Acer
 */
public class rupiah1 extends matauang2 {
    private float rp, usd;
    
    public void Setrupiah(float nil){
        this.rp = nil;
    }
    public void Setdolar(float nil){
        this.usd = (float) 0.000064;
    }
    public float Getrupiah(){
        return this.rp;
    }
    public float Getdolar(){
        return this.usd = (float) 0.000064;
    }
    public float konversi(){
        return this.rp * this.usd;  
    }
}