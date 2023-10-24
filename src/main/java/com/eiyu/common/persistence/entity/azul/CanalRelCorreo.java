/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
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
@Table(name = "canal_rel_correo", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "CanalRelCorreo.findAll", query = "SELECT c FROM CanalRelCorreo c"),
    @NamedQuery(name = "CanalRelCorreo.findByIdCanal", query = "SELECT c FROM CanalRelCorreo c WHERE c.canalRelCorreoPK.idCanal = :idCanal"),
    @NamedQuery(name = "CanalRelCorreo.findByIdCorreo", query = "SELECT c FROM CanalRelCorreo c WHERE c.canalRelCorreoPK.idCorreo = :idCorreo"),
    @NamedQuery(name = "CanalRelCorreo.findByFechaCreacion", query = "SELECT c FROM CanalRelCorreo c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "CanalRelCorreo.findByUsuarioCreacion", query = "SELECT c FROM CanalRelCorreo c WHERE c.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "CanalRelCorreo.findByActivo", query = "SELECT c FROM CanalRelCorreo c WHERE c.activo = :activo")})
public class CanalRelCorreo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CanalRelCorreoPK canalRelCorreoPK;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 50)
    private String usuarioCreacion;
    @Column(name = "activo")
    private Boolean activo;

    public CanalRelCorreo() {
    }

    public CanalRelCorreo(CanalRelCorreoPK canalRelCorreoPK) {
        this.canalRelCorreoPK = canalRelCorreoPK;
    }

    public CanalRelCorreo(int idCanal, int idCorreo) {
        this.canalRelCorreoPK = new CanalRelCorreoPK(idCanal, idCorreo);
    }

    public CanalRelCorreoPK getCanalRelCorreoPK() {
        return canalRelCorreoPK;
    }

    public void setCanalRelCorreoPK(CanalRelCorreoPK canalRelCorreoPK) {
        this.canalRelCorreoPK = canalRelCorreoPK;
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (canalRelCorreoPK != null ? canalRelCorreoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CanalRelCorreo)) {
            return false;
        }
        CanalRelCorreo other = (CanalRelCorreo) object;
        if ((this.canalRelCorreoPK == null && other.canalRelCorreoPK != null) || (this.canalRelCorreoPK != null && !this.canalRelCorreoPK.equals(other.canalRelCorreoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.CanalRelCorreo[ canalRelCorreoPK=" + canalRelCorreoPK + " ]";
    }
    
}
