/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faturatakip;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Emre USTA
 */
@Entity
@Table(name = "PERSONEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personel.findAll", query = "SELECT p FROM Personel p")
    , @NamedQuery(name = "Personel.findByTc", query = "SELECT p FROM Personel p WHERE p.tc = :tc")
    , @NamedQuery(name = "Personel.findByAdi", query = "SELECT p FROM Personel p WHERE p.adi = :adi")
    , @NamedQuery(name = "Personel.findBySoyadi", query = "SELECT p FROM Personel p WHERE p.soyadi = :soyadi")
    , @NamedQuery(name = "Personel.findByPersonelno", query = "SELECT p FROM Personel p WHERE p.personelno = :personelno")
    , @NamedQuery(name = "Personel.findBy\u015eube", query = "SELECT p FROM Personel p WHERE p.\u015fube = :\u015fube")})
public class Personel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TC")
    private Integer tc;
    @Basic(optional = false)
    @Column(name = "ADI")
    private String adi;
    @Basic(optional = false)
    @Column(name = "SOYADI")
    private String soyadi;
    @Basic(optional = false)
    @Column(name = "PERSONELNO")
    private int personelno;
    @Basic(optional = false)
    @Column(name = "\u015eUBE")
    private String şube;

    public Personel() {
    }

    public Personel(Integer tc) {
        this.tc = tc;
    }

    public Personel(Integer tc, String adi, String soyadi, int personelno, String şube) {
        this.tc = tc;
        this.adi = adi;
        this.soyadi = soyadi;
        this.personelno = personelno;
        this.şube = şube;
    }

    public Integer getTc() {
        return tc;
    }

    public void setTc(Integer tc) {
        this.tc = tc;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getPersonelno() {
        return personelno;
    }

    public void setPersonelno(int personelno) {
        this.personelno = personelno;
    }

    public String getŞube() {
        return şube;
    }

    public void setŞube(String şube) {
        this.şube = şube;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tc != null ? tc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personel)) {
            return false;
        }
        Personel other = (Personel) object;
        if ((this.tc == null && other.tc != null) || (this.tc != null && !this.tc.equals(other.tc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "faturatakip.Personel[ tc=" + tc + " ]";
    }
    
}
