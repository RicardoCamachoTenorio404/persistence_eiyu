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
@Table(name = "impuesto", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Impuesto.findAll", query = "SELECT i FROM Impuesto i"),
    @NamedQuery(name = "Impuesto.findByIdImpuesto", query = "SELECT i FROM Impuesto i WHERE i.idImpuesto = :idImpuesto"),
    @NamedQuery(name = "Impuesto.findByDescripcionImpuesto", query = "SELECT i FROM Impuesto i WHERE i.descripcionImpuesto = :descripcionImpuesto"),
    @NamedQuery(name = "Impuesto.findByValorPorcentaje", query = "SELECT i FROM Impuesto i WHERE i.valorPorcentaje = :valorPorcentaje"),
    @NamedQuery(name = "Impuesto.findByActivo", query = "SELECT i FROM Impuesto i WHERE i.activo = :activo"),
    @NamedQuery(name = "Impuesto.findByFechaCreacion", query = "SELECT i FROM Impuesto i WHERE i.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Impuesto.findByUsuarioCreacion", query = "SELECT i FROM Impuesto i WHERE i.usuarioCreacion = :usuarioCreacion")})
public class Impuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_impuesto", nullable = false)
    private Integer idImpuesto;
    @Column(name = "descripcion_impuesto", length = 100)
    private String descripcionImpuesto;
    @Column(name = "valor_porcentaje")
    private Integer valorPorcentaje;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public Impuesto() {
    }

    public Impuesto(Integer idImpuesto) {
        this.idImpuesto = idImpuesto;
    }

    public Integer getIdImpuesto() {
        return idImpuesto;
    }

    public void setIdImpuesto(Integer idImpuesto) {
        this.idImpuesto = idImpuesto;
    }

    public String getDescripcionImpuesto() {
        return descripcionImpuesto;
    }

    public void setDescripcionImpuesto(String descripcionImpuesto) {
        this.descripcionImpuesto = descripcionImpuesto;
    }

    public Integer getValorPorcentaje() {
        return valorPorcentaje;
    }

    public void setValorPorcentaje(Integer valorPorcentaje) {
        this.valorPorcentaje = valorPorcentaje;
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
        hash += (idImpuesto != null ? idImpuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Impuesto)) {
            return false;
        }
        Impuesto other = (Impuesto) object;
        if ((this.idImpuesto == null && other.idImpuesto != null) || (this.idImpuesto != null && !this.idImpuesto.equals(other.idImpuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Impuesto[ idImpuesto=" + idImpuesto + " ]";
    }
    
}
