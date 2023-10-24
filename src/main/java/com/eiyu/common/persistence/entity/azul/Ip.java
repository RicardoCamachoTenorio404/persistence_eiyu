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
@Table(name = "ip", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Ip.findAll", query = "SELECT i FROM Ip i"),
    @NamedQuery(name = "Ip.findByIdIp", query = "SELECT i FROM Ip i WHERE i.idIp = :idIp"),
    @NamedQuery(name = "Ip.findByIdPblu", query = "SELECT i FROM Ip i WHERE i.idPblu = :idPblu"),
    @NamedQuery(name = "Ip.findByIp", query = "SELECT i FROM Ip i WHERE i.ip = :ip"),
    @NamedQuery(name = "Ip.findByPuerto", query = "SELECT i FROM Ip i WHERE i.puerto = :puerto"),
    @NamedQuery(name = "Ip.findByActivo", query = "SELECT i FROM Ip i WHERE i.activo = :activo"),
    @NamedQuery(name = "Ip.findByFechaCreacion", query = "SELECT i FROM Ip i WHERE i.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Ip.findByUsuarioCreacion", query = "SELECT i FROM Ip i WHERE i.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "Ip.findByUrlFecAbono", query = "SELECT i FROM Ip i WHERE i.urlFecAbono = :urlFecAbono"),
    @NamedQuery(name = "Ip.findByUrlFecNotificaEstado", query = "SELECT i FROM Ip i WHERE i.urlFecNotificaEstado = :urlFecNotificaEstado"),
    @NamedQuery(name = "Ip.findByUrlPbluAbono", query = "SELECT i FROM Ip i WHERE i.urlPbluAbono = :urlPbluAbono"),
    @NamedQuery(name = "Ip.findByUrlPbluNotificaEstado", query = "SELECT i FROM Ip i WHERE i.urlPbluNotificaEstado = :urlPbluNotificaEstado")})
public class Ip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ip", nullable = false)
    private Integer idIp;
    @Basic(optional = false)
    @Column(name = "id_pblu", nullable = false)
    private int idPblu;
    @Basic(optional = false)
    @Column(name = "ip", nullable = false, length = 70)
    private String ip;
    @Basic(optional = false)
    @Column(name = "puerto", nullable = false, length = 50)
    private String puerto;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;
    @Column(name = "url_fec_abono", length = 400)
    private String urlFecAbono;
    @Column(name = "url_fec_notifica_estado", length = 400)
    private String urlFecNotificaEstado;
    @Column(name = "url_pblu_abono", length = 400)
    private String urlPbluAbono;
    @Column(name = "url_pblu_notifica_estado", length = 400)
    private String urlPbluNotificaEstado;

    public Ip() {
    }

    public Ip(Integer idIp) {
        this.idIp = idIp;
    }

    public Ip(Integer idIp, int idPblu, String ip, String puerto, boolean activo) {
        this.idIp = idIp;
        this.idPblu = idPblu;
        this.ip = ip;
        this.puerto = puerto;
        this.activo = activo;
    }

    public Integer getIdIp() {
        return idIp;
    }

    public void setIdIp(Integer idIp) {
        this.idIp = idIp;
    }

    public int getIdPblu() {
        return idPblu;
    }

    public void setIdPblu(int idPblu) {
        this.idPblu = idPblu;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
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

    public String getUrlFecAbono() {
        return urlFecAbono;
    }

    public void setUrlFecAbono(String urlFecAbono) {
        this.urlFecAbono = urlFecAbono;
    }

    public String getUrlFecNotificaEstado() {
        return urlFecNotificaEstado;
    }

    public void setUrlFecNotificaEstado(String urlFecNotificaEstado) {
        this.urlFecNotificaEstado = urlFecNotificaEstado;
    }

    public String getUrlPbluAbono() {
        return urlPbluAbono;
    }

    public void setUrlPbluAbono(String urlPbluAbono) {
        this.urlPbluAbono = urlPbluAbono;
    }

    public String getUrlPbluNotificaEstado() {
        return urlPbluNotificaEstado;
    }

    public void setUrlPbluNotificaEstado(String urlPbluNotificaEstado) {
        this.urlPbluNotificaEstado = urlPbluNotificaEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIp != null ? idIp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ip)) {
            return false;
        }
        Ip other = (Ip) object;
        if ((this.idIp == null && other.idIp != null) || (this.idIp != null && !this.idIp.equals(other.idIp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Ip[ idIp=" + idIp + " ]";
    }
    
}
