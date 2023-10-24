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
import jakarta.persistence.UniqueConstraint;

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "contribuyente", catalog = "asp_azul", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"representante", "p_moral"})})
@NamedQueries({
    @NamedQuery(name = "Contribuyente.findAll", query = "SELECT c FROM Contribuyente c"),
    @NamedQuery(name = "Contribuyente.findByIdContribuyente", query = "SELECT c FROM Contribuyente c WHERE c.idContribuyente = :idContribuyente"),
    @NamedQuery(name = "Contribuyente.findByRepresentante", query = "SELECT c FROM Contribuyente c WHERE c.representante = :representante"),
    @NamedQuery(name = "Contribuyente.findByPMoral", query = "SELECT c FROM Contribuyente c WHERE c.pMoral = :pMoral"),
    @NamedQuery(name = "Contribuyente.findByActivo", query = "SELECT c FROM Contribuyente c WHERE c.activo = :activo"),
    @NamedQuery(name = "Contribuyente.findByFechaCreacion", query = "SELECT c FROM Contribuyente c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Contribuyente.findByFechaActualizacion", query = "SELECT c FROM Contribuyente c WHERE c.fechaActualizacion = :fechaActualizacion"),
    @NamedQuery(name = "Contribuyente.findByUsuarioCreacion", query = "SELECT c FROM Contribuyente c WHERE c.usuarioCreacion = :usuarioCreacion")})
public class Contribuyente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_contribuyente", nullable = false)
    private Integer idContribuyente;
    @Basic(optional = false)
    @Column(name = "representante", nullable = false)
    private int representante;
    @Basic(optional = false)
    @Column(name = "p_moral", nullable = false)
    private int pMoral;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public Contribuyente() {
    }

    public Contribuyente(Integer idContribuyente) {
        this.idContribuyente = idContribuyente;
    }

    public Contribuyente(Integer idContribuyente, int representante, int pMoral, boolean activo) {
        this.idContribuyente = idContribuyente;
        this.representante = representante;
        this.pMoral = pMoral;
        this.activo = activo;
    }

    public Integer getIdContribuyente() {
        return idContribuyente;
    }

    public void setIdContribuyente(Integer idContribuyente) {
        this.idContribuyente = idContribuyente;
    }

    public int getRepresentante() {
        return representante;
    }

    public void setRepresentante(int representante) {
        this.representante = representante;
    }

    public int getPMoral() {
        return pMoral;
    }

    public void setPMoral(int pMoral) {
        this.pMoral = pMoral;
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

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
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
        hash += (idContribuyente != null ? idContribuyente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contribuyente)) {
            return false;
        }
        Contribuyente other = (Contribuyente) object;
        if ((this.idContribuyente == null && other.idContribuyente != null) || (this.idContribuyente != null && !this.idContribuyente.equals(other.idContribuyente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Contribuyente[ idContribuyente=" + idContribuyente + " ]";
    }
    
}
