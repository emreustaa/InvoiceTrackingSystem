/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faturatakip;

/**
 *
 * @author Emre USTA
 */
public class AboneSınıf {

    private int TC;
    private String ADI;
    private String SOYADI;
    private int ABONENO;
    private int SAYACNO;
    private String EMAİL;
    
    AboneSınıf()
    {
        
    }

    public AboneSınıf(int TC, String ADI, String SOYADI, int ABONENO, int SAYACNO, String EMAİL) {
        this.TC = TC;
        this.ADI = ADI;
        this.SOYADI = SOYADI;
        this.ABONENO = ABONENO;
        this.SAYACNO = SAYACNO;
        this.EMAİL = EMAİL;
    }

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public String getADI() {
        return ADI;
    }

    public void setADI(String ADI) {
        this.ADI = ADI;
    }

    public String getSOYADI() {
        return SOYADI;
    }

    public void setSOYADI(String SOYADI) {
        this.SOYADI = SOYADI;
    }

    public int getABONENO() {
        return ABONENO;
    }

    public void setABONENO(int ABONENO) {
        this.ABONENO = ABONENO;
    }

    public int getSAYACNO() {
        return SAYACNO;
    }

    public void setSAYACNO(int SAYACNO) {
        this.SAYACNO = SAYACNO;
    }

    public String getEMAİL() {
        return EMAİL;
    }

    public void setEMAİL(String EMAİL) {
        this.EMAİL = EMAİL;
    }











}
