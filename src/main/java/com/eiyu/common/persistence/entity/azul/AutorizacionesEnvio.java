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
@Table(name = "autorizaciones_envio", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AutorizacionesEnvio.findAll", query = "SELECT a FROM AutorizacionesEnvio a"),
    @NamedQuery(name = "AutorizacionesEnvio.findById", query = "SELECT a FROM AutorizacionesEnvio a WHERE a.id = :id"),
    @NamedQuery(name = "AutorizacionesEnvio.findByIdUsuarioAutoriza", query = "SELECT a FROM AutorizacionesEnvio a WHERE a.idUsuarioAutoriza = :idUsuarioAutoriza"),
    @NamedQuery(name = "AutorizacionesEnvio.findByIdUsuarioAutorizaCandado", query = "SELECT a FROM AutorizacionesEnvio a WHERE a.idUsuarioAutorizaCandado = :idUsuarioAutorizaCandado")})
public class AutorizacionesEnvio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "id_usuario_autoriza", length = 255)
    private String idUsuarioAutoriza;
    @Column(name = "id_usuario_autoriza_candado", length = 255)
    private String idUsuarioAutorizaCandado;

    public AutorizacionesEnvio() {
    }

    public AutorizacionesEnvio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdUsuarioAutoriza() {
        return idUsuarioAutoriza;
    }

    public void setIdUsuarioAutoriza(String idUsuarioAutoriza) {
        this.idUsuarioAutoriza = idUsuarioAutoriza;
    }

    public String getIdUsuarioAutorizaCandado() {
        return idUsuarioAutorizaCandado;
    }

    public void setIdUsuarioAutorizaCandado(String idUsuarioAutorizaCandado) {
        this.idUsuarioAutorizaCandado = idUsuarioAutorizaCandado;
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
        if (!(object instanceof AutorizacionesEnvio)) {
            return false;
        }
        AutorizacionesEnvio other = (AutorizacionesEnvio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AutorizacionesEnvio[ id=" + id + " ]";
    }
    
}
