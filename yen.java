/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cobalagi2;

/**
 *
 * @author Acer
 */
public class yen extends matauang2{
    private float rp, yen;
    
    public void Setrupiah(float nil){
        this.rp = nil;
    }
    public void Setyen(float nil){
        this.yen = (float) 0.0086;
    }
    public float Getrupiah(){
        return this.rp;
    }
    public float Getyen(){
        return this.yen = (float) 0.0086;
    }
    public float konversi(){
        return this.rp * this.yen;  
    }
}
