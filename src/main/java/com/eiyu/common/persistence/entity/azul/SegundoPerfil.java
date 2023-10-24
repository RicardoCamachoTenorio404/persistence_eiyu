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
@Table(name = "segundo_perfil", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "SegundoPerfil.findAll", query = "SELECT s FROM SegundoPerfil s"),
    @NamedQuery(name = "SegundoPerfil.findById", query = "SELECT s FROM SegundoPerfil s WHERE s.id = :id"),
    @NamedQuery(name = "SegundoPerfil.findByCuenta", query = "SELECT s FROM SegundoPerfil s WHERE s.cuenta = :cuenta"),
    @NamedQuery(name = "SegundoPerfil.findByEstatus", query = "SELECT s FROM SegundoPerfil s WHERE s.estatus = :estatus"),
    @NamedQuery(name = "SegundoPerfil.findByIdPerfil", query = "SELECT s FROM SegundoPerfil s WHERE s.idPerfil = :idPerfil"),
    @NamedQuery(name = "SegundoPerfil.findByIdUsuario", query = "SELECT s FROM SegundoPerfil s WHERE s.idUsuario = :idUsuario"),
    @NamedQuery(name = "SegundoPerfil.findByFechaCreacion", query = "SELECT s FROM SegundoPerfil s WHERE s.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "SegundoPerfil.findByFechaModificacion", query = "SELECT s FROM SegundoPerfil s WHERE s.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "SegundoPerfil.findByUsuarioCreacion", query = "SELECT s FROM SegundoPerfil s WHERE s.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "SegundoPerfil.findByUsuarioModificacion", query = "SELECT s FROM SegundoPerfil s WHERE s.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "SegundoPerfil.findByDescCuenta", query = "SELECT s FROM SegundoPerfil s WHERE s.descCuenta = :descCuenta")})
public class SegundoPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "cuenta", length = 255)
    private String cuenta;
    @Basic(optional = false)
    @Column(name = "estatus", nullable = false)
    private boolean estatus;
    @Column(name = "id_perfil")
    private Integer idPerfil;
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    @Column(name = "usuario_creacion", length = 2147483647)
    private String usuarioCreacion;
    @Column(name = "usuario_modificacion", length = 2147483647)
    private String usuarioModificacion;
    @Column(name = "desc_cuenta", length = 2147483647)
    private String descCuenta;

    public SegundoPerfil() {
    }

    public SegundoPerfil(Integer id) {
        this.id = id;
    }

    public SegundoPerfil(Integer id, boolean estatus) {
        this.id = id;
        this.estatus = estatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public String getDescCuenta() {
        return descCuenta;
    }

    public void setDescCuenta(String descCuenta) {
        this.descCuenta = descCuenta;
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
        if (!(object instanceof SegundoPerfil)) {
            return false;
        }
        SegundoPerfil other = (SegundoPerfil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.SegundoPerfil[ id=" + id + " ]";
    }
    
}
