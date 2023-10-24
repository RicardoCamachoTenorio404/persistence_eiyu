/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
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
@Table(name = "asp_producto_ahorro", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspProductoAhorro.findAll", query = "SELECT a FROM AspProductoAhorro a"),
    @NamedQuery(name = "AspProductoAhorro.findByClave", query = "SELECT a FROM AspProductoAhorro a WHERE a.clave = :clave"),
    @NamedQuery(name = "AspProductoAhorro.findByMoneda", query = "SELECT a FROM AspProductoAhorro a WHERE a.moneda = :moneda"),
    @NamedQuery(name = "AspProductoAhorro.findByMonedaId", query = "SELECT a FROM AspProductoAhorro a WHERE a.monedaId = :monedaId"),
    @NamedQuery(name = "AspProductoAhorro.findByFechaActivacion", query = "SELECT a FROM AspProductoAhorro a WHERE a.fechaActivacion = :fechaActivacion"),
    @NamedQuery(name = "AspProductoAhorro.findByEstatus", query = "SELECT a FROM AspProductoAhorro a WHERE a.estatus = :estatus"),
    @NamedQuery(name = "AspProductoAhorro.findById", query = "SELECT a FROM AspProductoAhorro a WHERE a.id = :id"),
    @NamedQuery(name = "AspProductoAhorro.findByDescripcion", query = "SELECT a FROM AspProductoAhorro a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "AspProductoAhorro.findByEstatusId", query = "SELECT a FROM AspProductoAhorro a WHERE a.estatusId = :estatusId")})
public class AspProductoAhorro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "clave", length = 2147483647)
    private String clave;
    @Column(name = "moneda", length = 2147483647)
    private String moneda;
    @Column(name = "moneda_id")
    private Integer monedaId;
    @Column(name = "fecha_activacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActivacion;
    @Column(name = "estatus", length = 2147483647)
    private String estatus;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "descripcion", length = 2147483647)
    private String descripcion;
    @Column(name = "estatus_id")
    private Integer estatusId;

    public AspProductoAhorro() {
    }

    public AspProductoAhorro(Integer id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Integer getMonedaId() {
        return monedaId;
    }

    public void setMonedaId(Integer monedaId) {
        this.monedaId = monedaId;
    }

    public Date getFechaActivacion() {
        return fechaActivacion;
    }

    public void setFechaActivacion(Date fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstatusId() {
        return estatusId;
    }

    public void setEstatusId(Integer estatusId) {
        this.estatusId = estatusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspProductoAhorro)) {
            return false;
        }
        AspProductoAhorro other = (AspProductoAhorro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspProductoAhorro[ id=" + id + " ]";
    }
    
}
