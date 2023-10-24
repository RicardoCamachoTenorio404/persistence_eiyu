/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "saldo_pblu", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "SaldoPblu.findAll", query = "SELECT s FROM SaldoPblu s"),
    @NamedQuery(name = "SaldoPblu.findByIdPblu", query = "SELECT s FROM SaldoPblu s WHERE s.idPblu = :idPblu"),
    @NamedQuery(name = "SaldoPblu.findBySaldo", query = "SELECT s FROM SaldoPblu s WHERE s.saldo = :saldo"),
    @NamedQuery(name = "SaldoPblu.findByFechaCreacion", query = "SELECT s FROM SaldoPblu s WHERE s.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "SaldoPblu.findByUsuarioCreacion", query = "SELECT s FROM SaldoPblu s WHERE s.usuarioCreacion = :usuarioCreacion")})
public class SaldoPblu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pblu", nullable = false)
    private Integer idPblu;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "saldo", nullable = false, precision = 12, scale = 2)
    private BigDecimal saldo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public SaldoPblu() {
    }

    public SaldoPblu(Integer idPblu) {
        this.idPblu = idPblu;
    }

    public SaldoPblu(Integer idPblu, BigDecimal saldo) {
        this.idPblu = idPblu;
        this.saldo = saldo;
    }

    public Integer getIdPblu() {
        return idPblu;
    }

    public void setIdPblu(Integer idPblu) {
        this.idPblu = idPblu;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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
        hash += (idPblu != null ? idPblu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaldoPblu)) {
            return false;
        }
        SaldoPblu other = (SaldoPblu) object;
        if ((this.idPblu == null && other.idPblu != null) || (this.idPblu != null && !this.idPblu.equals(other.idPblu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.SaldoPblu[ idPblu=" + idPblu + " ]";
    }
    
}
