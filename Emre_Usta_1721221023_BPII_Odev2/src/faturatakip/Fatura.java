/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faturatakip;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Emre USTA
 */
@Entity
@Table(name = "FATURA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fatura.findAll", query = "SELECT f FROM Fatura f")
    , @NamedQuery(name = "Fatura.findByFaturano", query = "SELECT f FROM Fatura f WHERE f.faturano = :faturano")
    , @NamedQuery(name = "Fatura.findByFaturaturu", query = "SELECT f FROM Fatura f WHERE f.faturaturu = :faturaturu")
    , @NamedQuery(name = "Fatura.findByIlkodemetarihi", query = "SELECT f FROM Fatura f WHERE f.ilkodemetarihi = :ilkodemetarihi")
    , @NamedQuery(name = "Fatura.findBySonodemetarihi", query = "SELECT f FROM Fatura f WHERE f.sonodemetarihi = :sonodemetarihi")
    , @NamedQuery(name = "Fatura.findByFaturatutari", query = "SELECT f FROM Fatura f WHERE f.faturatutari = :faturatutari")
    , @NamedQuery(name = "Fatura.findByAdres", query = "SELECT f FROM Fatura f WHERE f.adres = :adres")
    , @NamedQuery(name = "Fatura.findByAbone", query = "SELECT f FROM Fatura f WHERE f.abone = :abone")})
public class Fatura implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FATURANO")
    private Integer faturano;
    @Basic(optional = false)
    @Column(name = "FATURATURU")
    private String faturaturu;
    @Basic(optional = false)
    @Column(name = "ILKODEMETARIHI")
    private int ilkodemetarihi;
    @Basic(optional = false)
    @Column(name = "SONODEMETARIHI")
    private int sonodemetarihi;
    @Basic(optional = false)
    @Column(name = "FATURATUTARI")
    private int faturatutari;
    @Basic(optional = false)
    @Column(name = "ADRES")
    private String adres;
    @Basic(optional = false)
    @Column(name = "ABONE")
    private String abone;

    public Fatura() {
    }

    public Fatura(Integer faturano) {
        this.faturano = faturano;
    }

    public Fatura(Integer faturano, String faturaturu, int ilkodemetarihi, int sonodemetarihi, int faturatutari, String adres, String abone) {
        this.faturano = faturano;
        this.faturaturu = faturaturu;
        this.ilkodemetarihi = ilkodemetarihi;
        this.sonodemetarihi = sonodemetarihi;
        this.faturatutari = faturatutari;
        this.adres = adres;
        this.abone = abone;
    }

    public Integer getFaturano() {
        return faturano;
    }

    public void setFaturano(Integer faturano) {
        Integer oldFaturano = this.faturano;
        this.faturano = faturano;
        changeSupport.firePropertyChange("faturano", oldFaturano, faturano);
    }

    public String getFaturaturu() {
        return faturaturu;
    }

    public void setFaturaturu(String faturaturu) {
        String oldFaturaturu = this.faturaturu;
        this.faturaturu = faturaturu;
        changeSupport.firePropertyChange("faturaturu", oldFaturaturu, faturaturu);
    }

    public int getIlkodemetarihi() {
        return ilkodemetarihi;
    }

    public void setIlkodemetarihi(int ilkodemetarihi) {
        int oldIlkodemetarihi = this.ilkodemetarihi;
        this.ilkodemetarihi = ilkodemetarihi;
        changeSupport.firePropertyChange("ilkodemetarihi", oldIlkodemetarihi, ilkodemetarihi);
    }

    public int getSonodemetarihi() {
        return sonodemetarihi;
    }

    public void setSonodemetarihi(int sonodemetarihi) {
        int oldSonodemetarihi = this.sonodemetarihi;
        this.sonodemetarihi = sonodemetarihi;
        changeSupport.firePropertyChange("sonodemetarihi", oldSonodemetarihi, sonodemetarihi);
    }

    public int getFaturatutari() {
        return faturatutari;
    }

    public void setFaturatutari(int faturatutari) {
        int oldFaturatutari = this.faturatutari;
        this.faturatutari = faturatutari;
        changeSupport.firePropertyChange("faturatutari", oldFaturatutari, faturatutari);
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        String oldAdres = this.adres;
        this.adres = adres;
        changeSupport.firePropertyChange("adres", oldAdres, adres);
    }

    public String getAbone() {
        return abone;
    }

    public void setAbone(String abone) {
        String oldAbone = this.abone;
        this.abone = abone;
        changeSupport.firePropertyChange("abone", oldAbone, abone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (faturano != null ? faturano.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fatura)) {
            return false;
        }
        Fatura other = (Fatura) object;
        if ((this.faturano == null && other.faturano != null) || (this.faturano != null && !this.faturano.equals(other.faturano))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "faturatakip.Fatura[ faturano=" + faturano + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
