/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cobalagi2;

/**
 *
 * @author Acer
 */
public class euro extends matauang2 {
    private float rp, euro;
    
    public void Setrupiah(float nil){
        this.rp = nil;
    }
    public void Seteuro(float nil){
        this.euro = (float) 0.000060;
    }
    public float Getrupiah(){
        return this.rp;
    }
    public float Geteuro(){
        return this.euro = (float) 0.000060;
    }
    public float konversi(){
        return this.rp * this.euro;  
    }
}