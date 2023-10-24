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
@Table(name = "factura_encabezado", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "FacturaEncabezado.findAll", query = "SELECT f FROM FacturaEncabezado f"),
    @NamedQuery(name = "FacturaEncabezado.findByCveFactura", query = "SELECT f FROM FacturaEncabezado f WHERE f.cveFactura = :cveFactura"),
    @NamedQuery(name = "FacturaEncabezado.findByIpPblu", query = "SELECT f FROM FacturaEncabezado f WHERE f.ipPblu = :ipPblu"),
    @NamedQuery(name = "FacturaEncabezado.findByIpPbluEnvio", query = "SELECT f FROM FacturaEncabezado f WHERE f.ipPbluEnvio = :ipPbluEnvio"),
    @NamedQuery(name = "FacturaEncabezado.findBySubtotal", query = "SELECT f FROM FacturaEncabezado f WHERE f.subtotal = :subtotal"),
    @NamedQuery(name = "FacturaEncabezado.findByImpuesto", query = "SELECT f FROM FacturaEncabezado f WHERE f.impuesto = :impuesto"),
    @NamedQuery(name = "FacturaEncabezado.findByTotal", query = "SELECT f FROM FacturaEncabezado f WHERE f.total = :total"),
    @NamedQuery(name = "FacturaEncabezado.findByActivo", query = "SELECT f FROM FacturaEncabezado f WHERE f.activo = :activo"),
    @NamedQuery(name = "FacturaEncabezado.findByFechaCreacion", query = "SELECT f FROM FacturaEncabezado f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "FacturaEncabezado.findByUsuarioCreacion", query = "SELECT f FROM FacturaEncabezado f WHERE f.usuarioCreacion = :usuarioCreacion")})
public class FacturaEncabezado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cve_factura", nullable = false, length = 12)
    private String cveFactura;
    @Column(name = "ip_pblu")
    private Integer ipPblu;
    @Column(name = "ip_pblu_envio")
    private Integer ipPbluEnvio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "subtotal", precision = 12, scale = 2)
    private BigDecimal subtotal;
    @Column(name = "impuesto", precision = 12, scale = 2)
    private BigDecimal impuesto;
    @Column(name = "total", precision = 12, scale = 2)
    private BigDecimal total;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public FacturaEncabezado() {
    }

    public FacturaEncabezado(String cveFactura) {
        this.cveFactura = cveFactura;
    }

    public String getCveFactura() {
        return cveFactura;
    }

    public void setCveFactura(String cveFactura) {
        this.cveFactura = cveFactura;
    }

    public Integer getIpPblu() {
        return ipPblu;
    }

    public void setIpPblu(Integer ipPblu) {
        this.ipPblu = ipPblu;
    }

    public Integer getIpPbluEnvio() {
        return ipPbluEnvio;
    }

    public void setIpPbluEnvio(Integer ipPbluEnvio) {
        this.ipPbluEnvio = ipPbluEnvio;
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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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
        hash += (cveFactura != null ? cveFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaEncabezado)) {
            return false;
        }
        FacturaEncabezado other = (FacturaEncabezado) object;
        if ((this.cveFactura == null && other.cveFactura != null) || (this.cveFactura != null && !this.cveFactura.equals(other.cveFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.FacturaEncabezado[ cveFactura=" + cveFactura + " ]";
    }
    
}
