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
@Table(name = "componentes", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Componentes.findAll", query = "SELECT c FROM Componentes c"),
    @NamedQuery(name = "Componentes.findByIdComponente", query = "SELECT c FROM Componentes c WHERE c.idComponente = :idComponente"),
    @NamedQuery(name = "Componentes.findByNombre", query = "SELECT c FROM Componentes c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Componentes.findByIpLocal", query = "SELECT c FROM Componentes c WHERE c.ipLocal = :ipLocal"),
    @NamedQuery(name = "Componentes.findByPuertoLocal", query = "SELECT c FROM Componentes c WHERE c.puertoLocal = :puertoLocal"),
    @NamedQuery(name = "Componentes.findByIpDesarrollo", query = "SELECT c FROM Componentes c WHERE c.ipDesarrollo = :ipDesarrollo"),
    @NamedQuery(name = "Componentes.findByPuertoDesarrollo", query = "SELECT c FROM Componentes c WHERE c.puertoDesarrollo = :puertoDesarrollo"),
    @NamedQuery(name = "Componentes.findByIpProduccion", query = "SELECT c FROM Componentes c WHERE c.ipProduccion = :ipProduccion"),
    @NamedQuery(name = "Componentes.findByPuertoProduccion", query = "SELECT c FROM Componentes c WHERE c.puertoProduccion = :puertoProduccion"),
    @NamedQuery(name = "Componentes.findByActivo", query = "SELECT c FROM Componentes c WHERE c.activo = :activo"),
    @NamedQuery(name = "Componentes.findByFechaCreacion", query = "SELECT c FROM Componentes c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Componentes.findByUsuarioCreacion", query = "SELECT c FROM Componentes c WHERE c.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "Componentes.findByMonitoreo", query = "SELECT c FROM Componentes c WHERE c.monitoreo = :monitoreo")})
public class Componentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_componente", nullable = false)
    private Integer idComponente;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "ip_local", nullable = false, length = 100)
    private String ipLocal;
    @Basic(optional = false)
    @Column(name = "puerto_local", nullable = false, length = 4)
    private String puertoLocal;
    @Basic(optional = false)
    @Column(name = "ip_desarrollo", nullable = false, length = 100)
    private String ipDesarrollo;
    @Basic(optional = false)
    @Column(name = "puerto_desarrollo", nullable = false, length = 4)
    private String puertoDesarrollo;
    @Basic(optional = false)
    @Column(name = "ip_produccion", nullable = false, length = 100)
    private String ipProduccion;
    @Basic(optional = false)
    @Column(name = "puerto_produccion", nullable = false, length = 4)
    private String puertoProduccion;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 30)
    private String usuarioCreacion;
    @Basic(optional = false)
    @Column(name = "monitoreo", nullable = false)
    private boolean monitoreo;

    public Componentes() {
    }

    public Componentes(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public Componentes(Integer idComponente, String nombre, String ipLocal, String puertoLocal, String ipDesarrollo, String puertoDesarrollo, String ipProduccion, String puertoProduccion, boolean activo, boolean monitoreo) {
        this.idComponente = idComponente;
        this.nombre = nombre;
        this.ipLocal = ipLocal;
        this.puertoLocal = puertoLocal;
        this.ipDesarrollo = ipDesarrollo;
        this.puertoDesarrollo = puertoDesarrollo;
        this.ipProduccion = ipProduccion;
        this.puertoProduccion = puertoProduccion;
        this.activo = activo;
        this.monitoreo = monitoreo;
    }

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIpLocal() {
        return ipLocal;
    }

    public void setIpLocal(String ipLocal) {
        this.ipLocal = ipLocal;
    }

    public String getPuertoLocal() {
        return puertoLocal;
    }

    public void setPuertoLocal(String puertoLocal) {
        this.puertoLocal = puertoLocal;
    }

    public String getIpDesarrollo() {
        return ipDesarrollo;
    }

    public void setIpDesarrollo(String ipDesarrollo) {
        this.ipDesarrollo = ipDesarrollo;
    }

    public String getPuertoDesarrollo() {
        return puertoDesarrollo;
    }

    public void setPuertoDesarrollo(String puertoDesarrollo) {
        this.puertoDesarrollo = puertoDesarrollo;
    }

    public String getIpProduccion() {
        return ipProduccion;
    }

    public void setIpProduccion(String ipProduccion) {
        this.ipProduccion = ipProduccion;
    }

    public String getPuertoProduccion() {
        return puertoProduccion;
    }

    public void setPuertoProduccion(String puertoProduccion) {
        this.puertoProduccion = puertoProduccion;
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

    public boolean getMonitoreo() {
        return monitoreo;
    }

    public void setMonitoreo(boolean monitoreo) {
        this.monitoreo = monitoreo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComponente != null ? idComponente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Componentes)) {
            return false;
        }
        Componentes other = (Componentes) object;
        if ((this.idComponente == null && other.idComponente != null) || (this.idComponente != null && !this.idComponente.equals(other.idComponente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Componentes[ idComponente=" + idComponente + " ]";
    }
    
}
