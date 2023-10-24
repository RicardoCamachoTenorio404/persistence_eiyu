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
@Table(name = "factura_detalle", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "FacturaDetalle.findAll", query = "SELECT f FROM FacturaDetalle f"),
    @NamedQuery(name = "FacturaDetalle.findByCveFactura", query = "SELECT f FROM FacturaDetalle f WHERE f.facturaDetallePK.cveFactura = :cveFactura"),
    @NamedQuery(name = "FacturaDetalle.findByDescripcion", query = "SELECT f FROM FacturaDetalle f WHERE f.descripcion = :descripcion"),
    @NamedQuery(name = "FacturaDetalle.findBySku", query = "SELECT f FROM FacturaDetalle f WHERE f.facturaDetallePK.sku = :sku"),
    @NamedQuery(name = "FacturaDetalle.findByPrecioUnitario", query = "SELECT f FROM FacturaDetalle f WHERE f.precioUnitario = :precioUnitario"),
    @NamedQuery(name = "FacturaDetalle.findByVolumen", query = "SELECT f FROM FacturaDetalle f WHERE f.volumen = :volumen"),
    @NamedQuery(name = "FacturaDetalle.findBySubtotal", query = "SELECT f FROM FacturaDetalle f WHERE f.subtotal = :subtotal"),
    @NamedQuery(name = "FacturaDetalle.findByImpuesto", query = "SELECT f FROM FacturaDetalle f WHERE f.impuesto = :impuesto"),
    @NamedQuery(name = "FacturaDetalle.findByIdEstado", query = "SELECT f FROM FacturaDetalle f WHERE f.idEstado = :idEstado"),
    @NamedQuery(name = "FacturaDetalle.findByFechaCreacion", query = "SELECT f FROM FacturaDetalle f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "FacturaDetalle.findByUsuarioCreacion", query = "SELECT f FROM FacturaDetalle f WHERE f.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "FacturaDetalle.findByTotal", query = "SELECT f FROM FacturaDetalle f WHERE f.total = :total"),
    @NamedQuery(name = "FacturaDetalle.findByCveConcepto", query = "SELECT f FROM FacturaDetalle f WHERE f.facturaDetallePK.cveConcepto = :cveConcepto")})
public class FacturaDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacturaDetallePK facturaDetallePK;
    @Column(name = "descripcion", length = 100)
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_unitario", precision = 12, scale = 2)
    private BigDecimal precioUnitario;
    @Column(name = "volumen")
    private Integer volumen;
    @Column(name = "subtotal", precision = 12, scale = 2)
    private BigDecimal subtotal;
    @Column(name = "impuesto", precision = 12, scale = 2)
    private BigDecimal impuesto;
    @Column(name = "id_estado")
    private Integer idEstado;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;
    @Column(name = "total", precision = 12, scale = 2)
    private BigDecimal total;

    public FacturaDetalle() {
    }

    public FacturaDetalle(FacturaDetallePK facturaDetallePK) {
        this.facturaDetallePK = facturaDetallePK;
    }

    public FacturaDetalle(String cveFactura, String sku, String cveConcepto) {
        this.facturaDetallePK = new FacturaDetallePK(cveFactura, sku, cveConcepto);
    }

    public FacturaDetallePK getFacturaDetallePK() {
        return facturaDetallePK;
    }

    public void setFacturaDetallePK(FacturaDetallePK facturaDetallePK) {
        this.facturaDetallePK = facturaDetallePK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(BigDecimal impuesto) {
        this.impuesto = impuesto;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturaDetallePK != null ? facturaDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaDetalle)) {
            return false;
        }
        FacturaDetalle other = (FacturaDetalle) object;
        if ((this.facturaDetallePK == null && other.facturaDetallePK != null) || (this.facturaDetallePK != null && !this.facturaDetallePK.equals(other.facturaDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.FacturaDetalle[ facturaDetallePK=" + facturaDetallePK + " ]";
    }
    
}
