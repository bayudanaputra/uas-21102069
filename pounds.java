/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cobalagi2;

/**
 *
 * @author Acer
 */
public class pounds extends matauang2 {
    private float rp, pounds;
    
    public void Setrupiah(float nil){
        this.rp = nil;
    }
    public void Setpounds(float nil){
        this.pounds = (float) 0.000053;
    }
    public float Getrupiah(){
        return this.rp;
    }
    public float Getpounds(){
        return this.pounds = (float) 0.000053;
    }
    public float konversi(){
        return this.rp * this.pounds;  
    }
}
