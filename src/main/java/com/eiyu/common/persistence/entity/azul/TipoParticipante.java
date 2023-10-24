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
@Table(name = "tipo_participante", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "TipoParticipante.findAll", query = "SELECT t FROM TipoParticipante t"),
    @NamedQuery(name = "TipoParticipante.findByIdTipoPart", query = "SELECT t FROM TipoParticipante t WHERE t.idTipoPart = :idTipoPart"),
    @NamedQuery(name = "TipoParticipante.findByDescripcion", query = "SELECT t FROM TipoParticipante t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TipoParticipante.findByActivo", query = "SELECT t FROM TipoParticipante t WHERE t.activo = :activo"),
    @NamedQuery(name = "TipoParticipante.findByFechaCreacion", query = "SELECT t FROM TipoParticipante t WHERE t.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "TipoParticipante.findByUsuarioCreacion", query = "SELECT t FROM TipoParticipante t WHERE t.usuarioCreacion = :usuarioCreacion")})
public class TipoParticipante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_part", nullable = false)
    private Integer idTipoPart;
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

    public TipoParticipante() {
    }

    public TipoParticipante(Integer idTipoPart) {
        this.idTipoPart = idTipoPart;
    }

    public TipoParticipante(Integer idTipoPart, String descripcion, boolean activo) {
        this.idTipoPart = idTipoPart;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdTipoPart() {
        return idTipoPart;
    }

    public void setIdTipoPart(Integer idTipoPart) {
        this.idTipoPart = idTipoPart;
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
        hash += (idTipoPart != null ? idTipoPart.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoParticipante)) {
            return false;
        }
        TipoParticipante other = (TipoParticipante) object;
        if ((this.idTipoPart == null && other.idTipoPart != null) || (this.idTipoPart != null && !this.idTipoPart.equals(other.idTipoPart))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.TipoParticipante[ idTipoPart=" + idTipoPart + " ]";
    }
    
}
