/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "historial_saldo_pblu_blu", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "HistorialSaldoPbluBlu.findAll", query = "SELECT h FROM HistorialSaldoPbluBlu h"),
    @NamedQuery(name = "HistorialSaldoPbluBlu.findByIdUdn", query = "SELECT h FROM HistorialSaldoPbluBlu h WHERE h.historialSaldoPbluBluPK.idUdn = :idUdn"),
    @NamedQuery(name = "HistorialSaldoPbluBlu.findByFechaCreacion", query = "SELECT h FROM HistorialSaldoPbluBlu h WHERE h.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "HistorialSaldoPbluBlu.findByFechaOperativa", query = "SELECT h FROM HistorialSaldoPbluBlu h WHERE h.historialSaldoPbluBluPK.fechaOperativa = :fechaOperativa"),
    @NamedQuery(name = "HistorialSaldoPbluBlu.findBySaldoInicial", query = "SELECT h FROM HistorialSaldoPbluBlu h WHERE h.saldoInicial = :saldoInicial"),
    @NamedQuery(name = "HistorialSaldoPbluBlu.findBySaldoFinal", query = "SELECT h FROM HistorialSaldoPbluBlu h WHERE h.saldoFinal = :saldoFinal"),
    @NamedQuery(name = "HistorialSaldoPbluBlu.findByUsuarioCreacion", query = "SELECT h FROM HistorialSaldoPbluBlu h WHERE h.usuarioCreacion = :usuarioCreacion")})
public class HistorialSaldoPbluBlu implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistorialSaldoPbluBluPK historialSaldoPbluBluPK;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo_inicial", precision = 12, scale = 2)
    private BigDecimal saldoInicial;
    @Column(name = "saldo_final", precision = 12, scale = 2)
    private BigDecimal saldoFinal;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public HistorialSaldoPbluBlu() {
    }

    public HistorialSaldoPbluBlu(HistorialSaldoPbluBluPK historialSaldoPbluBluPK) {
        this.historialSaldoPbluBluPK = historialSaldoPbluBluPK;
    }

    public HistorialSaldoPbluBlu(int idUdn, Date fechaOperativa) {
        this.historialSaldoPbluBluPK = new HistorialSaldoPbluBluPK(idUdn, fechaOperativa);
    }

    public HistorialSaldoPbluBluPK getHistorialSaldoPbluBluPK() {
        return historialSaldoPbluBluPK;
    }

    public void setHistorialSaldoPbluBluPK(HistorialSaldoPbluBluPK historialSaldoPbluBluPK) {
        this.historialSaldoPbluBluPK = historialSaldoPbluBluPK;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public BigDecimal getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(BigDecimal saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historialSaldoPbluBluPK != null ? historialSaldoPbluBluPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialSaldoPbluBlu)) {
            return false;
        }
        HistorialSaldoPbluBlu other = (HistorialSaldoPbluBlu) object;
        if ((this.historialSaldoPbluBluPK == null && other.historialSaldoPbluBluPK != null) || (this.historialSaldoPbluBluPK != null && !this.historialSaldoPbluBluPK.equals(other.historialSaldoPbluBluPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.HistorialSaldoPbluBlu[ historialSaldoPbluBluPK=" + historialSaldoPbluBluPK + " ]";
    }
    
}
