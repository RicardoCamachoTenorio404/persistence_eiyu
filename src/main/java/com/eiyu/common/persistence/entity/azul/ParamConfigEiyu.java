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
@Table(name = "param_config_eiyu", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "ParamConfigEiyu.findAll", query = "SELECT p FROM ParamConfigEiyu p"),
    @NamedQuery(name = "ParamConfigEiyu.findByIdParamConfigEiYu", query = "SELECT p FROM ParamConfigEiyu p WHERE p.idParamConfigEiYu = :idParamConfigEiYu"),
    @NamedQuery(name = "ParamConfigEiyu.findByFechaCreacion", query = "SELECT p FROM ParamConfigEiyu p WHERE p.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "ParamConfigEiyu.findByFechaModificacion", query = "SELECT p FROM ParamConfigEiyu p WHERE p.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "ParamConfigEiyu.findByUsuarioCreacion", query = "SELECT p FROM ParamConfigEiyu p WHERE p.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "ParamConfigEiyu.findByUsuarioModificacion", query = "SELECT p FROM ParamConfigEiyu p WHERE p.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "ParamConfigEiyu.findByPblu", query = "SELECT p FROM ParamConfigEiyu p WHERE p.pblu = :pblu"),
    @NamedQuery(name = "ParamConfigEiyu.findByValor", query = "SELECT p FROM ParamConfigEiyu p WHERE p.valor = :valor"),
    @NamedQuery(name = "ParamConfigEiyu.findByDescripcion", query = "SELECT p FROM ParamConfigEiyu p WHERE p.descripcion = :descripcion")})
public class ParamConfigEiyu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_param_config_ei_yu", nullable = false)
    private Integer idParamConfigEiYu;
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
    @Column(name = "pblu")
    private Integer pblu;
    @Column(name = "valor")
    private Integer valor;
    @Column(name = "descripcion", length = 2147483647)
    private String descripcion;

    public ParamConfigEiyu() {
    }

    public ParamConfigEiyu(Integer idParamConfigEiYu) {
        this.idParamConfigEiYu = idParamConfigEiYu;
    }

    public Integer getIdParamConfigEiYu() {
        return idParamConfigEiYu;
    }

    public void setIdParamConfigEiYu(Integer idParamConfigEiYu) {
        this.idParamConfigEiYu = idParamConfigEiYu;
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

    public Integer getPblu() {
        return pblu;
    }

    public void setPblu(Integer pblu) {
        this.pblu = pblu;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParamConfigEiYu != null ? idParamConfigEiYu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParamConfigEiyu)) {
            return false;
        }
        ParamConfigEiyu other = (ParamConfigEiyu) object;
        if ((this.idParamConfigEiYu == null && other.idParamConfigEiYu != null) || (this.idParamConfigEiYu != null && !this.idParamConfigEiYu.equals(other.idParamConfigEiYu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.ParamConfigEiyu[ idParamConfigEiYu=" + idParamConfigEiYu + " ]";
    }
    
}
