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
@Table(name = "\u015eUBELER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "\u015eubeler.findAll", query = "SELECT \u015f FROM \u015eubeler \u015f")
    , @NamedQuery(name = "\u015eubeler.findBy\u015eubeno", query = "SELECT \u015f FROM \u015eubeler \u015f WHERE \u015f.\u015fubeno = :\u015fubeno")
    , @NamedQuery(name = "\u015eubeler.findBy\u015eubeadi", query = "SELECT \u015f FROM \u015eubeler \u015f WHERE \u015f.\u015fubeadi = :\u015fubeadi")
    , @NamedQuery(name = "\u015eubeler.findBySubeilce", query = "SELECT \u015f FROM \u015eubeler \u015f WHERE \u015f.subeilce = :subeilce")
    , @NamedQuery(name = "\u015eubeler.findBySubeil", query = "SELECT \u015f FROM \u015eubeler \u015f WHERE \u015f.subeil = :subeil")})
public class Şubeler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "\u015eUBENO")
    private Integer şubeno;
    @Basic(optional = false)
    @Column(name = "\u015eUBEADI")
    private String şubeadi;
    @Basic(optional = false)
    @Column(name = "SUBEILCE")
    private String subeilce;
    @Basic(optional = false)
    @Column(name = "SUBEIL")
    private String subeil;

    public Şubeler() {
    }

    public Şubeler(Integer şubeno) {
        this.şubeno = şubeno;
    }

    public Şubeler(Integer şubeno, String şubeadi, String subeilce, String subeil) {
        this.şubeno = şubeno;
        this.şubeadi = şubeadi;
        this.subeilce = subeilce;
        this.subeil = subeil;
    }

    public Integer getŞubeno() {
        return şubeno;
    }

    public void setŞubeno(Integer şubeno) {
        this.şubeno = şubeno;
    }

    public String getŞubeadi() {
        return şubeadi;
    }

    public void setŞubeadi(String şubeadi) {
        this.şubeadi = şubeadi;
    }

    public String getSubeilce() {
        return subeilce;
    }

    public void setSubeilce(String subeilce) {
        this.subeilce = subeilce;
    }

    public String getSubeil() {
        return subeil;
    }

    public void setSubeil(String subeil) {
        this.subeil = subeil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (şubeno != null ? şubeno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Şubeler)) {
            return false;
        }
        Şubeler other = (Şubeler) object;
        if ((this.şubeno == null && other.şubeno != null) || (this.şubeno != null && !this.şubeno.equals(other.şubeno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "faturatakip.\u015eubeler[ \u015fubeno=" + şubeno + " ]";
    }
    
}
