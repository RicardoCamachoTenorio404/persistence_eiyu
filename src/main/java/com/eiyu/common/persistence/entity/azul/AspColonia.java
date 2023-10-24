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
@Table(name = "asp_colonia", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspColonia.findAll", query = "SELECT a FROM AspColonia a"),
    @NamedQuery(name = "AspColonia.findByDescLocalidad", query = "SELECT a FROM AspColonia a WHERE a.descLocalidad = :descLocalidad"),
    @NamedQuery(name = "AspColonia.findByEstId", query = "SELECT a FROM AspColonia a WHERE a.estId = :estId"),
    @NamedQuery(name = "AspColonia.findByDescEstado", query = "SELECT a FROM AspColonia a WHERE a.descEstado = :descEstado"),
    @NamedQuery(name = "AspColonia.findByDescColonia", query = "SELECT a FROM AspColonia a WHERE a.descColonia = :descColonia"),
    @NamedQuery(name = "AspColonia.findByColClaveCnbv", query = "SELECT a FROM AspColonia a WHERE a.colClaveCnbv = :colClaveCnbv"),
    @NamedQuery(name = "AspColonia.findByColId", query = "SELECT a FROM AspColonia a WHERE a.colId = :colId"),
    @NamedQuery(name = "AspColonia.findByDescEstadoNafin", query = "SELECT a FROM AspColonia a WHERE a.descEstadoNafin = :descEstadoNafin"),
    @NamedQuery(name = "AspColonia.findByNafinId", query = "SELECT a FROM AspColonia a WHERE a.nafinId = :nafinId"),
    @NamedQuery(name = "AspColonia.findByLocId", query = "SELECT a FROM AspColonia a WHERE a.locId = :locId"),
    @NamedQuery(name = "AspColonia.findByDesMunicipio", query = "SELECT a FROM AspColonia a WHERE a.desMunicipio = :desMunicipio"),
    @NamedQuery(name = "AspColonia.findByEstClaveCnvb", query = "SELECT a FROM AspColonia a WHERE a.estClaveCnvb = :estClaveCnvb"),
    @NamedQuery(name = "AspColonia.findByLocClaveCnbv", query = "SELECT a FROM AspColonia a WHERE a.locClaveCnbv = :locClaveCnbv"),
    @NamedQuery(name = "AspColonia.findByMpioId", query = "SELECT a FROM AspColonia a WHERE a.mpioId = :mpioId")})
public class AspColonia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "desc_localidad", length = 2147483647)
    private String descLocalidad;
    @Column(name = "est_id")
    private Integer estId;
    @Column(name = "desc_estado", length = 2147483647)
    private String descEstado;
    @Column(name = "desc_colonia", length = 2147483647)
    private String descColonia;
    @Column(name = "col_clave_cnbv", length = 2147483647)
    private String colClaveCnbv;
    @Id
    @Basic(optional = false)
    @Column(name = "col_id", nullable = false)
    private Integer colId;
    @Column(name = "desc_estado_nafin", length = 2147483647)
    private String descEstadoNafin;
    @Column(name = "nafin_id")
    private Integer nafinId;
    @Column(name = "loc_id")
    private Integer locId;
    @Column(name = "des_municipio", length = 2147483647)
    private String desMunicipio;
    @Column(name = "est_clave_cnvb")
    private Integer estClaveCnvb;
    @Column(name = "loc_clave_cnbv", length = 2147483647)
    private String locClaveCnbv;
    @Column(name = "mpio_id")
    private Integer mpioId;

    public AspColonia() {
    }

    public AspColonia(Integer colId) {
        this.colId = colId;
    }

    public String getDescLocalidad() {
        return descLocalidad;
    }

    public void setDescLocalidad(String descLocalidad) {
        this.descLocalidad = descLocalidad;
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

    public String getDescColonia() {
        return descColonia;
    }

    public void setDescColonia(String descColonia) {
        this.descColonia = descColonia;
    }

    public String getColClaveCnbv() {
        return colClaveCnbv;
    }

    public void setColClaveCnbv(String colClaveCnbv) {
        this.colClaveCnbv = colClaveCnbv;
    }

    public Integer getColId() {
        return colId;
    }

    public void setColId(Integer colId) {
        this.colId = colId;
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

    public Integer getLocId() {
        return locId;
    }

    public void setLocId(Integer locId) {
        this.locId = locId;
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

    public String getLocClaveCnbv() {
        return locClaveCnbv;
    }

    public void setLocClaveCnbv(String locClaveCnbv) {
        this.locClaveCnbv = locClaveCnbv;
    }

    public Integer getMpioId() {
        return mpioId;
    }

    public void setMpioId(Integer mpioId) {
        this.mpioId = mpioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (colId != null ? colId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspColonia)) {
            return false;
        }
        AspColonia other = (AspColonia) object;
        if ((this.colId == null && other.colId != null) || (this.colId != null && !this.colId.equals(other.colId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspColonia[ colId=" + colId + " ]";
    }
    
}
