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
@Table(name = "estado_pago", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "EstadoPago.findAll", query = "SELECT e FROM EstadoPago e"),
    @NamedQuery(name = "EstadoPago.findByIdEstadoPago", query = "SELECT e FROM EstadoPago e WHERE e.idEstadoPago = :idEstadoPago"),
    @NamedQuery(name = "EstadoPago.findByDescripcion", query = "SELECT e FROM EstadoPago e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "EstadoPago.findByActivo", query = "SELECT e FROM EstadoPago e WHERE e.activo = :activo"),
    @NamedQuery(name = "EstadoPago.findByFechaCreacion", query = "SELECT e FROM EstadoPago e WHERE e.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "EstadoPago.findByUsuarioCreacion", query = "SELECT e FROM EstadoPago e WHERE e.usuarioCreacion = :usuarioCreacion")})
public class EstadoPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_estado_pago", nullable = false)
    private Integer idEstadoPago;
    @Basic(optional = false)
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public EstadoPago() {
    }

    public EstadoPago(Integer idEstadoPago) {
        this.idEstadoPago = idEstadoPago;
    }

    public EstadoPago(Integer idEstadoPago, String descripcion, boolean activo) {
        this.idEstadoPago = idEstadoPago;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdEstadoPago() {
        return idEstadoPago;
    }

    public void setIdEstadoPago(Integer idEstadoPago) {
        this.idEstadoPago = idEstadoPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
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
        hash += (idEstadoPago != null ? idEstadoPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoPago)) {
            return false;
        }
        EstadoPago other = (EstadoPago) object;
        if ((this.idEstadoPago == null && other.idEstadoPago != null) || (this.idEstadoPago != null && !this.idEstadoPago.equals(other.idEstadoPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.EstadoPago[ idEstadoPago=" + idEstadoPago + " ]";
    }
    
}
