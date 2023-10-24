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
@Table(name = "documento_cuenta", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "DocumentoCuenta.findAll", query = "SELECT d FROM DocumentoCuenta d"),
    @NamedQuery(name = "DocumentoCuenta.findByClabe", query = "SELECT d FROM DocumentoCuenta d WHERE d.documentoCuentaPK.clabe = :clabe"),
    @NamedQuery(name = "DocumentoCuenta.findByCveDocumento", query = "SELECT d FROM DocumentoCuenta d WHERE d.documentoCuentaPK.cveDocumento = :cveDocumento"),
    @NamedQuery(name = "DocumentoCuenta.findByNombreDocumento", query = "SELECT d FROM DocumentoCuenta d WHERE d.nombreDocumento = :nombreDocumento"),
    @NamedQuery(name = "DocumentoCuenta.findByObservacion", query = "SELECT d FROM DocumentoCuenta d WHERE d.observacion = :observacion"),
    @NamedQuery(name = "DocumentoCuenta.findByFechaCreacion", query = "SELECT d FROM DocumentoCuenta d WHERE d.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "DocumentoCuenta.findByEstado", query = "SELECT d FROM DocumentoCuenta d WHERE d.estado = :estado")})
public class DocumentoCuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DocumentoCuentaPK documentoCuentaPK;
    @Lob
    @Column(name = "imagen")
    private byte[] imagen;
    @Column(name = "nombre_documento", length = 100)
    private String nombreDocumento;
    @Column(name = "observacion", length = 100)
    private String observacion;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "estado", length = 20)
    private String estado;

    public DocumentoCuenta() {
    }

    public DocumentoCuenta(DocumentoCuentaPK documentoCuentaPK) {
        this.documentoCuentaPK = documentoCuentaPK;
    }

    public DocumentoCuenta(String clabe, String cveDocumento) {
        this.documentoCuentaPK = new DocumentoCuentaPK(clabe, cveDocumento);
    }

    public DocumentoCuentaPK getDocumentoCuentaPK() {
        return documentoCuentaPK;
    }

    public void setDocumentoCuentaPK(DocumentoCuentaPK documentoCuentaPK) {
        this.documentoCuentaPK = documentoCuentaPK;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentoCuentaPK != null ? documentoCuentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoCuenta)) {
            return false;
        }
        DocumentoCuenta other = (DocumentoCuenta) object;
        if ((this.documentoCuentaPK == null && other.documentoCuentaPK != null) || (this.documentoCuentaPK != null && !this.documentoCuentaPK.equals(other.documentoCuentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.DocumentoCuenta[ documentoCuentaPK=" + documentoCuentaPK + " ]";
    }
    
}
