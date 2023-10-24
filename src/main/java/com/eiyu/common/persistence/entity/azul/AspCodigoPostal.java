/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "asp_codigo_postal", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspCodigoPostal.findAll", query = "SELECT a FROM AspCodigoPostal a"),
    @NamedQuery(name = "AspCodigoPostal.findByDescLocalidad", query = "SELECT a FROM AspCodigoPostal a WHERE a.descLocalidad = :descLocalidad"),
    @NamedQuery(name = "AspCodigoPostal.findByEstId", query = "SELECT a FROM AspCodigoPostal a WHERE a.estId = :estId"),
    @NamedQuery(name = "AspCodigoPostal.findByDescEstado", query = "SELECT a FROM AspCodigoPostal a WHERE a.descEstado = :descEstado"),
    @NamedQuery(name = "AspCodigoPostal.findByCodigoPostal", query = "SELECT a FROM AspCodigoPostal a WHERE a.aspCodigoPostalPK.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "AspCodigoPostal.findByDescColonia", query = "SELECT a FROM AspCodigoPostal a WHERE a.descColonia = :descColonia"),
    @NamedQuery(name = "AspCodigoPostal.findByColClaveCnbv", query = "SELECT a FROM AspCodigoPostal a WHERE a.colClaveCnbv = :colClaveCnbv"),
    @NamedQuery(name = "AspCodigoPostal.findByColId", query = "SELECT a FROM AspCodigoPostal a WHERE a.aspCodigoPostalPK.colId = :colId"),
    @NamedQuery(name = "AspCodigoPostal.findByDescEstadoNafin", query = "SELECT a FROM AspCodigoPostal a WHERE a.descEstadoNafin = :descEstadoNafin"),
    @NamedQuery(name = "AspCodigoPostal.findByNafinId", query = "SELECT a FROM AspCodigoPostal a WHERE a.nafinId = :nafinId"),
    @NamedQuery(name = "AspCodigoPostal.findByLocId", query = "SELECT a FROM AspCodigoPostal a WHERE a.aspCodigoPostalPK.locId = :locId"),
    @NamedQuery(name = "AspCodigoPostal.findByDesMunicipio", query = "SELECT a FROM AspCodigoPostal a WHERE a.desMunicipio = :desMunicipio"),
    @NamedQuery(name = "AspCodigoPostal.findByEstClaveCnvb", query = "SELECT a FROM AspCodigoPostal a WHERE a.estClaveCnvb = :estClaveCnvb"),
    @NamedQuery(name = "AspCodigoPostal.findByLocClaveCnbv", query = "SELECT a FROM AspCodigoPostal a WHERE a.locClaveCnbv = :locClaveCnbv"),
    @NamedQuery(name = "AspCodigoPostal.findByMpioId", query = "SELECT a FROM AspCodigoPostal a WHERE a.mpioId = :mpioId")})
public class AspCodigoPostal implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AspCodigoPostalPK aspCodigoPostalPK;
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
    @Column(name = "desc_estado_nafin", length = 2147483647)
    private String descEstadoNafin;
    @Column(name = "nafin_id")
    private Integer nafinId;
    @Column(name = "des_municipio", length = 2147483647)
    private String desMunicipio;
    @Column(name = "est_clave_cnvb")
    private Integer estClaveCnvb;
    @Column(name = "loc_clave_cnbv", length = 2147483647)
    private String locClaveCnbv;
    @Column(name = "mpio_id")
    private Integer mpioId;

    public AspCodigoPostal() {
    }

    public AspCodigoPostal(AspCodigoPostalPK aspCodigoPostalPK) {
        this.aspCodigoPostalPK = aspCodigoPostalPK;
    }

    public AspCodigoPostal(String codigoPostal, int colId, int locId) {
        this.aspCodigoPostalPK = new AspCodigoPostalPK(codigoPostal, colId, locId);
    }

    public AspCodigoPostalPK getAspCodigoPostalPK() {
        return aspCodigoPostalPK;
    }

    public void setAspCodigoPostalPK(AspCodigoPostalPK aspCodigoPostalPK) {
        this.aspCodigoPostalPK = aspCodigoPostalPK;
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
        hash += (aspCodigoPostalPK != null ? aspCodigoPostalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspCodigoPostal)) {
            return false;
        }
        AspCodigoPostal other = (AspCodigoPostal) object;
        if ((this.aspCodigoPostalPK == null && other.aspCodigoPostalPK != null) || (this.aspCodigoPostalPK != null && !this.aspCodigoPostalPK.equals(other.aspCodigoPostalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspCodigoPostal[ aspCodigoPostalPK=" + aspCodigoPostalPK + " ]";
    }
    
}
