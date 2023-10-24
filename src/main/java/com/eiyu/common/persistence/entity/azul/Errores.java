/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "errores", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Errores.findAll", query = "SELECT e FROM Errores e"),
    @NamedQuery(name = "Errores.findByIdError", query = "SELECT e FROM Errores e WHERE e.idError = :idError"),
    @NamedQuery(name = "Errores.findByExcepcionclass", query = "SELECT e FROM Errores e WHERE e.excepcionclass = :excepcionclass"),
    @NamedQuery(name = "Errores.findByMensaje", query = "SELECT e FROM Errores e WHERE e.mensaje = :mensaje")})
public class Errores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_error", nullable = false)
    private Integer idError;
    @Basic(optional = false)
    @Column(name = "excepcionclass", nullable = false, length = 50)
    private String excepcionclass;
    @Basic(optional = false)
    @Column(name = "mensaje", nullable = false, length = 100)
    private String mensaje;

    public Errores() {
    }

    public Errores(Integer idError) {
        this.idError = idError;
    }

    public Errores(Integer idError, String excepcionclass, String mensaje) {
        this.idError = idError;
        this.excepcionclass = excepcionclass;
        this.mensaje = mensaje;
    }

    public Integer getIdError() {
        return idError;
    }

    public void setIdError(Integer idError) {
        this.idError = idError;
    }

    public String getExcepcionclass() {
        return excepcionclass;
    }

    public void setExcepcionclass(String excepcionclass) {
        this.excepcionclass = excepcionclass;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idError != null ? idError.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Errores)) {
            return false;
        }
        Errores other = (Errores) object;
        if ((this.idError == null && other.idError != null) || (this.idError != null && !this.idError.equals(other.idError))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Errores[ idError=" + idError + " ]";
    }
    
}
