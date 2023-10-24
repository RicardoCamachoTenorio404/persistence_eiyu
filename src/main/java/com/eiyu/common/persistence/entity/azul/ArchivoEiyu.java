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
import jakarta.persistence.Lob;
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
@Table(name = "archivo_eiyu", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "ArchivoEiyu.findAll", query = "SELECT a FROM ArchivoEiyu a"),
    @NamedQuery(name = "ArchivoEiyu.findByIdArchivo", query = "SELECT a FROM ArchivoEiyu a WHERE a.idArchivo = :idArchivo"),
    @NamedQuery(name = "ArchivoEiyu.findByPblu", query = "SELECT a FROM ArchivoEiyu a WHERE a.pblu = :pblu"),
    @NamedQuery(name = "ArchivoEiyu.findByFechaCreacion", query = "SELECT a FROM ArchivoEiyu a WHERE a.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "ArchivoEiyu.findByFilename", query = "SELECT a FROM ArchivoEiyu a WHERE a.filename = :filename"),
    @NamedQuery(name = "ArchivoEiyu.findByFiletype", query = "SELECT a FROM ArchivoEiyu a WHERE a.filetype = :filetype")})
public class ArchivoEiyu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_archivo", nullable = false)
    private Integer idArchivo;
    @Column(name = "pblu")
    private Integer pblu;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "filename", length = 255)
    private String filename;
    @Column(name = "filetype", length = 255)
    private String filetype;
    @Lob
    @Column(name = "value")
    private byte[] value;

    public ArchivoEiyu() {
    }

    public ArchivoEiyu(Integer idArchivo) {
        this.idArchivo = idArchivo;
    }

    public Integer getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(Integer idArchivo) {
        this.idArchivo = idArchivo;
    }

    public Integer getPblu() {
        return pblu;
    }

    public void setPblu(Integer pblu) {
        this.pblu = pblu;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public byte[] getValue() {
        return value;
    }

    public void setValue(byte[] value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArchivo != null ? idArchivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArchivoEiyu)) {
            return false;
        }
        ArchivoEiyu other = (ArchivoEiyu) object;
        if ((this.idArchivo == null && other.idArchivo != null) || (this.idArchivo != null && !this.idArchivo.equals(other.idArchivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.ArchivoEiyu[ idArchivo=" + idArchivo + " ]";
    }

}
