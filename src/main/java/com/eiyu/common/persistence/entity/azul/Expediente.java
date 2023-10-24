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
@Table(name = "expediente", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Expediente.findAll", query = "SELECT e FROM Expediente e"),
    @NamedQuery(name = "Expediente.findById", query = "SELECT e FROM Expediente e WHERE e.id = :id"),
    @NamedQuery(name = "Expediente.findByTipo", query = "SELECT e FROM Expediente e WHERE e.tipo = :tipo"),
    @NamedQuery(name = "Expediente.findByArchivo", query = "SELECT e FROM Expediente e WHERE e.archivo = :archivo"),
    @NamedQuery(name = "Expediente.findByNumIdeentificacion", query = "SELECT e FROM Expediente e WHERE e.numIdeentificacion = :numIdeentificacion"),
    @NamedQuery(name = "Expediente.findByExtension", query = "SELECT e FROM Expediente e WHERE e.extension = :extension"),
    @NamedQuery(name = "Expediente.findByIdPersona", query = "SELECT e FROM Expediente e WHERE e.idPersona = :idPersona"),
    @NamedQuery(name = "Expediente.findByEstado", query = "SELECT e FROM Expediente e WHERE e.estado = :estado"),
    @NamedQuery(name = "Expediente.findByClabe", query = "SELECT e FROM Expediente e WHERE e.clabe = :clabe"),
    @NamedQuery(name = "Expediente.findByFechaCreacion", query = "SELECT e FROM Expediente e WHERE e.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Expediente.findByRepLegal", query = "SELECT e FROM Expediente e WHERE e.repLegal = :repLegal")})
public class Expediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "tipo", length = 2147483647)
    private String tipo;
    @Column(name = "archivo", length = 2147483647)
    private String archivo;
    @Column(name = "num_ideentificacion", length = 50)
    private String numIdeentificacion;
    @Column(name = "extension", length = 2147483647)
    private String extension;
    @Column(name = "id_persona")
    private Integer idPersona;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "clabe", length = 2147483647)
    private String clabe;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "rep_legal", length = 2147483647)
    private String repLegal;

    public Expediente() {
    }

    public Expediente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getNumIdeentificacion() {
        return numIdeentificacion;
    }

    public void setNumIdeentificacion(String numIdeentificacion) {
        this.numIdeentificacion = numIdeentificacion;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getRepLegal() {
        return repLegal;
    }

    public void setRepLegal(String repLegal) {
        this.repLegal = repLegal;
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
        if (!(object instanceof Expediente)) {
            return false;
        }
        Expediente other = (Expediente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Expediente[ id=" + id + " ]";
    }
    
}
