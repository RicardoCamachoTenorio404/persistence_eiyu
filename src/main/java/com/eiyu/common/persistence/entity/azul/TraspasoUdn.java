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
@Table(name = "traspaso_udn", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "TraspasoUdn.findAll", query = "SELECT t FROM TraspasoUdn t"),
    @NamedQuery(name = "TraspasoUdn.findByIdTraspaso", query = "SELECT t FROM TraspasoUdn t WHERE t.idTraspaso = :idTraspaso"),
    @NamedQuery(name = "TraspasoUdn.findByIdUdnOrigen", query = "SELECT t FROM TraspasoUdn t WHERE t.idUdnOrigen = :idUdnOrigen"),
    @NamedQuery(name = "TraspasoUdn.findByIdUdnDestino", query = "SELECT t FROM TraspasoUdn t WHERE t.idUdnDestino = :idUdnDestino"),
    @NamedQuery(name = "TraspasoUdn.findByMonto", query = "SELECT t FROM TraspasoUdn t WHERE t.monto = :monto"),
    @NamedQuery(name = "TraspasoUdn.findByFechaCreacion", query = "SELECT t FROM TraspasoUdn t WHERE t.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "TraspasoUdn.findByConceptoTraspaso", query = "SELECT t FROM TraspasoUdn t WHERE t.conceptoTraspaso = :conceptoTraspaso"),
    @NamedQuery(name = "TraspasoUdn.findByCveRastreo", query = "SELECT t FROM TraspasoUdn t WHERE t.cveRastreo = :cveRastreo"),
    @NamedQuery(name = "TraspasoUdn.findByActivo", query = "SELECT t FROM TraspasoUdn t WHERE t.activo = :activo"),
    @NamedQuery(name = "TraspasoUdn.findByUsuarioCreacion", query = "SELECT t FROM TraspasoUdn t WHERE t.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "TraspasoUdn.findByFechaOperacion", query = "SELECT t FROM TraspasoUdn t WHERE t.fechaOperacion = :fechaOperacion"),
    @NamedQuery(name = "TraspasoUdn.findByUuid", query = "SELECT t FROM TraspasoUdn t WHERE t.uuid = :uuid")})
public class TraspasoUdn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_traspaso", nullable = false)
    private Integer idTraspaso;
    @Basic(optional = false)
    @Column(name = "id_udn_origen", nullable = false)
    private int idUdnOrigen;
    @Basic(optional = false)
    @Column(name = "id_udn_destino", nullable = false)
    private int idUdnDestino;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto", precision = 12, scale = 2)
    private BigDecimal monto;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @Column(name = "concepto_traspaso", nullable = false, length = 100)
    private String conceptoTraspaso;
    @Column(name = "cve_rastreo", length = 255)
    private String cveRastreo;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;
    @Basic(optional = false)
    @Column(name = "fecha_operacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaOperacion;
    @Column(name = "uuid", length = 40)
    private String uuid;

    public TraspasoUdn() {
    }

    public TraspasoUdn(Integer idTraspaso) {
        this.idTraspaso = idTraspaso;
    }

    public TraspasoUdn(Integer idTraspaso, int idUdnOrigen, int idUdnDestino, String conceptoTraspaso, boolean activo, Date fechaOperacion) {
        this.idTraspaso = idTraspaso;
        this.idUdnOrigen = idUdnOrigen;
        this.idUdnDestino = idUdnDestino;
        this.conceptoTraspaso = conceptoTraspaso;
        this.activo = activo;
        this.fechaOperacion = fechaOperacion;
    }

    public Integer getIdTraspaso() {
        return idTraspaso;
    }

    public void setIdTraspaso(Integer idTraspaso) {
        this.idTraspaso = idTraspaso;
    }

    public int getIdUdnOrigen() {
        return idUdnOrigen;
    }

    public void setIdUdnOrigen(int idUdnOrigen) {
        this.idUdnOrigen = idUdnOrigen;
    }

    public int getIdUdnDestino() {
        return idUdnDestino;
    }

    public void setIdUdnDestino(int idUdnDestino) {
        this.idUdnDestino = idUdnDestino;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getConceptoTraspaso() {
        return conceptoTraspaso;
    }

    public void setConceptoTraspaso(String conceptoTraspaso) {
        this.conceptoTraspaso = conceptoTraspaso;
    }

    public String getCveRastreo() {
        return cveRastreo;
    }

    public void setCveRastreo(String cveRastreo) {
        this.cveRastreo = cveRastreo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTraspaso != null ? idTraspaso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraspasoUdn)) {
            return false;
        }
        TraspasoUdn other = (TraspasoUdn) object;
        if ((this.idTraspaso == null && other.idTraspaso != null) || (this.idTraspaso != null && !this.idTraspaso.equals(other.idTraspaso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.TraspasoUdn[ idTraspaso=" + idTraspaso + " ]";
    }
    
}
