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
@Table(name = "ABONE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abone.findAll", query = "SELECT a FROM Abone a")
    , @NamedQuery(name = "Abone.findByTc", query = "SELECT a FROM Abone a WHERE a.tc = :tc")
    , @NamedQuery(name = "Abone.findByAdi", query = "SELECT a FROM Abone a WHERE a.adi = :adi")
    , @NamedQuery(name = "Abone.findBySoyadi", query = "SELECT a FROM Abone a WHERE a.soyadi = :soyadi")
    , @NamedQuery(name = "Abone.findByAboneno", query = "SELECT a FROM Abone a WHERE a.aboneno = :aboneno")
    , @NamedQuery(name = "Abone.findBySayacno", query = "SELECT a FROM Abone a WHERE a.sayacno = :sayacno")
    , @NamedQuery(name = "Abone.findByEmaiL", query = "SELECT a FROM Abone a WHERE a.emaiL = :emaiL")})
public class Abone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TC")
    private Integer tc;
    @Basic(optional = false)
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Basic(optional = false)
    @Column(name = "ABONENO")
    private int aboneno;
    @Column(name = "SAYACNO")
    private Integer sayacno;
    @Column(name = "EMA\u0130L")
    private String emaiL;

    public Abone() {
    }

    public Abone(Integer tc) {
        this.tc = tc;
    }

    public Abone(Integer tc, String adi, int aboneno) {
        this.tc = tc;
        this.adi = adi;
        this.aboneno = aboneno;
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

    public int getAboneno() {
        return aboneno;
    }

    public void setAboneno(int aboneno) {
        this.aboneno = aboneno;
    }

    public Integer getSayacno() {
        return sayacno;
    }

    public void setSayacno(Integer sayacno) {
        this.sayacno = sayacno;
    }

    public String getEmaiL() {
        return emaiL;
    }

    public void setEmaiL(String emaiL) {
        this.emaiL = emaiL;
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
        if (!(object instanceof Abone)) {
            return false;
        }
        Abone other = (Abone) object;
        if ((this.tc == null && other.tc != null) || (this.tc != null && !this.tc.equals(other.tc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "faturatakip.Abone[ tc=" + tc + " ]";
    }
    
}
