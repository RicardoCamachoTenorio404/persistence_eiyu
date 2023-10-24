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
@Table(name = "concepto", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Concepto.findAll", query = "SELECT c FROM Concepto c"),
    @NamedQuery(name = "Concepto.findByCveConcepto", query = "SELECT c FROM Concepto c WHERE c.cveConcepto = :cveConcepto"),
    @NamedQuery(name = "Concepto.findByDescripcion", query = "SELECT c FROM Concepto c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Concepto.findByIdProducto", query = "SELECT c FROM Concepto c WHERE c.idProducto = :idProducto"),
    @NamedQuery(name = "Concepto.findByIdMovimiento", query = "SELECT c FROM Concepto c WHERE c.idMovimiento = :idMovimiento"),
    @NamedQuery(name = "Concepto.findByIdTipoPago", query = "SELECT c FROM Concepto c WHERE c.idTipoPago = :idTipoPago"),
    @NamedQuery(name = "Concepto.findByIdEstadoPago", query = "SELECT c FROM Concepto c WHERE c.idEstadoPago = :idEstadoPago"),
    @NamedQuery(name = "Concepto.findByMonto", query = "SELECT c FROM Concepto c WHERE c.monto = :monto"),
    @NamedQuery(name = "Concepto.findByIdImpuesto", query = "SELECT c FROM Concepto c WHERE c.idImpuesto = :idImpuesto"),
    @NamedQuery(name = "Concepto.findByEstado", query = "SELECT c FROM Concepto c WHERE c.estado = :estado"),
    @NamedQuery(name = "Concepto.findByActivo", query = "SELECT c FROM Concepto c WHERE c.activo = :activo"),
    @NamedQuery(name = "Concepto.findByFechaCreacion", query = "SELECT c FROM Concepto c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Concepto.findByUsuarioCreacion", query = "SELECT c FROM Concepto c WHERE c.usuarioCreacion = :usuarioCreacion")})
public class Concepto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cve_concepto", nullable = false, length = 12)
    private String cveConcepto;
    @Column(name = "descripcion", length = 100)
    private String descripcion;
    @Column(name = "id_producto")
    private Integer idProducto;
    @Column(name = "id_movimiento")
    private Integer idMovimiento;
    @Column(name = "id_tipo_pago")
    private Integer idTipoPago;
    @Column(name = "id_estado_pago")
    private Integer idEstadoPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto", precision = 12, scale = 2)
    private BigDecimal monto;
    @Column(name = "id_impuesto")
    private Integer idImpuesto;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public Concepto() {
    }

    public Concepto(String cveConcepto) {
        this.cveConcepto = cveConcepto;
    }

    public String getCveConcepto() {
        return cveConcepto;
    }

    public void setCveConcepto(String cveConcepto) {
        this.cveConcepto = cveConcepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Integer getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(Integer idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public Integer getIdEstadoPago() {
        return idEstadoPago;
    }

    public void setIdEstadoPago(Integer idEstadoPago) {
        this.idEstadoPago = idEstadoPago;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Integer getIdImpuesto() {
        return idImpuesto;
    }

    public void setIdImpuesto(Integer idImpuesto) {
        this.idImpuesto = idImpuesto;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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
        hash += (cveConcepto != null ? cveConcepto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Concepto)) {
            return false;
        }
        Concepto other = (Concepto) object;
        if ((this.cveConcepto == null && other.cveConcepto != null) || (this.cveConcepto != null && !this.cveConcepto.equals(other.cveConcepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Concepto[ cveConcepto=" + cveConcepto + " ]";
    }
    
}
