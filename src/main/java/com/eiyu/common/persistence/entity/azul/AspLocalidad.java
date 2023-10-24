/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "asp_localidad", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspLocalidad.findAll", query = "SELECT a FROM AspLocalidad a"),
    @NamedQuery(name = "AspLocalidad.findByDescLocalidad", query = "SELECT a FROM AspLocalidad a WHERE a.descLocalidad = :descLocalidad"),
    @NamedQuery(name = "AspLocalidad.findByLocId", query = "SELECT a FROM AspLocalidad a WHERE a.locId = :locId"),
    @NamedQuery(name = "AspLocalidad.findByEstId", query = "SELECT a FROM AspLocalidad a WHERE a.estId = :estId"),
    @NamedQuery(name = "AspLocalidad.findByDescEstado", query = "SELECT a FROM AspLocalidad a WHERE a.descEstado = :descEstado"),
    @NamedQuery(name = "AspLocalidad.findByDesMunicipio", query = "SELECT a FROM AspLocalidad a WHERE a.desMunicipio = :desMunicipio"),
    @NamedQuery(name = "AspLocalidad.findByEstClaveCnvb", query = "SELECT a FROM AspLocalidad a WHERE a.estClaveCnvb = :estClaveCnvb"),
    @NamedQuery(name = "AspLocalidad.findByMpioId", query = "SELECT a FROM AspLocalidad a WHERE a.mpioId = :mpioId"),
    @NamedQuery(name = "AspLocalidad.findByLocClaveCnbv", query = "SELECT a FROM AspLocalidad a WHERE a.locClaveCnbv = :locClaveCnbv"),
    @NamedQuery(name = "AspLocalidad.findByDescEstadoNafin", query = "SELECT a FROM AspLocalidad a WHERE a.descEstadoNafin = :descEstadoNafin"),
    @NamedQuery(name = "AspLocalidad.findByNafinId", query = "SELECT a FROM AspLocalidad a WHERE a.nafinId = :nafinId")})
public class AspLocalidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "desc_localidad", length = 2147483647)
    private String descLocalidad;
    @Id
    @Basic(optional = false)
    @Column(name = "loc_id", nullable = false)
    private Integer locId;
    @Column(name = "est_id")
    private Integer estId;
    @Column(name = "desc_estado", length = 2147483647)
    private String descEstado;
    @Column(name = "des_municipio", length = 2147483647)
    private String desMunicipio;
    @Column(name = "est_clave_cnvb")
    private Integer estClaveCnvb;
    @Column(name = "mpio_id")
    private Integer mpioId;
    @Column(name = "loc_clave_cnbv", length = 2147483647)
    private String locClaveCnbv;
    @Column(name = "desc_estado_nafin", length = 2147483647)
    private String descEstadoNafin;
    @Column(name = "nafin_id")
    private Integer nafinId;

    public AspLocalidad() {
    }

    public AspLocalidad(Integer locId) {
        this.locId = locId;
    }

    public String getDescLocalidad() {
        return descLocalidad;
    }

    public void setDescLocalidad(String descLocalidad) {
        this.descLocalidad = descLocalidad;
    }

    public Integer getLocId() {
        return locId;
    }

    public void setLocId(Integer locId) {
        this.locId = locId;
    }

    public Integer getEstId() {
        return estId;
    }

    public void setEstId(Integer estId) {
        this.estId = estId;
    }

    public String getDescEstado() {
        return descEstado;
    }

    public void setDescEstado(String descEstado) {
        this.descEstado = descEstado;
    }

    public String getDesMunicipio() {
        return desMunicipio;
    }

    public void setDesMunicipio(String desMunicipio) {
        this.desMunicipio = desMunicipio;
    }

    public Integer getEstClaveCnvb() {
        return estClaveCnvb;
    }

    public void setEstClaveCnvb(Integer estClaveCnvb) {
        this.estClaveCnvb = estClaveCnvb;
    }

    public Integer getMpioId() {
        return mpioId;
    }

    public void setMpioId(Integer mpioId) {
        this.mpioId = mpioId;
    }

    public String getLocClaveCnbv() {
        return locClaveCnbv;
    }

    public void setLocClaveCnbv(String locClaveCnbv) {
        this.locClaveCnbv = locClaveCnbv;
    }

    public String getDescEstadoNafin() {
        return descEstadoNafin;
    }

    public void setDescEstadoNafin(String descEstadoNafin) {
        this.descEstadoNafin = descEstadoNafin;
    }

    public Integer getNafinId() {
        return nafinId;
    }

    public void setNafinId(Integer nafinId) {
        this.nafinId = nafinId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locId != null ? locId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspLocalidad)) {
            return false;
        }
        AspLocalidad other = (AspLocalidad) object;
        if ((this.locId == null && other.locId != null) || (this.locId != null && !this.locId.equals(other.locId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspLocalidad[ locId=" + locId + " ]";
    }
    
}
