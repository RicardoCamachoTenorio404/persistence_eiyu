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
@Table(name = "tipo_cuenta_destino", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "TipoCuentaDestino.findAll", query = "SELECT t FROM TipoCuentaDestino t"),
    @NamedQuery(name = "TipoCuentaDestino.findByIdTipoCuentaDestino", query = "SELECT t FROM TipoCuentaDestino t WHERE t.idTipoCuentaDestino = :idTipoCuentaDestino"),
    @NamedQuery(name = "TipoCuentaDestino.findByDescripcion", query = "SELECT t FROM TipoCuentaDestino t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TipoCuentaDestino.findByActivo", query = "SELECT t FROM TipoCuentaDestino t WHERE t.activo = :activo"),
    @NamedQuery(name = "TipoCuentaDestino.findByFechaCreacion", query = "SELECT t FROM TipoCuentaDestino t WHERE t.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "TipoCuentaDestino.findByUsuarioCreacion", query = "SELECT t FROM TipoCuentaDestino t WHERE t.usuarioCreacion = :usuarioCreacion")})
public class TipoCuentaDestino implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_cuenta_destino", nullable = false)
    private Integer idTipoCuentaDestino;
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

    public TipoCuentaDestino() {
    }

    public TipoCuentaDestino(Integer idTipoCuentaDestino) {
        this.idTipoCuentaDestino = idTipoCuentaDestino;
    }

    public TipoCuentaDestino(Integer idTipoCuentaDestino, String descripcion, boolean activo) {
        this.idTipoCuentaDestino = idTipoCuentaDestino;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdTipoCuentaDestino() {
        return idTipoCuentaDestino;
    }

    public void setIdTipoCuentaDestino(Integer idTipoCuentaDestino) {
        this.idTipoCuentaDestino = idTipoCuentaDestino;
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
        hash += (idTipoCuentaDestino != null ? idTipoCuentaDestino.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCuentaDestino)) {
            return false;
        }
        TipoCuentaDestino other = (TipoCuentaDestino) object;
        if ((this.idTipoCuentaDestino == null && other.idTipoCuentaDestino != null) || (this.idTipoCuentaDestino != null && !this.idTipoCuentaDestino.equals(other.idTipoCuentaDestino))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.TipoCuentaDestino[ idTipoCuentaDestino=" + idTipoCuentaDestino + " ]";
    }
    
}
