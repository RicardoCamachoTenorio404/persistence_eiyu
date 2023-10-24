/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
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
@Table(name = "plantillas", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Plantillas.findAll", query = "SELECT p FROM Plantillas p"),
    @NamedQuery(name = "Plantillas.findByFileName", query = "SELECT p FROM Plantillas p WHERE p.plantillasPK.fileName = :fileName"),
    @NamedQuery(name = "Plantillas.findByDescripcion", query = "SELECT p FROM Plantillas p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Plantillas.findByFechaCreacion", query = "SELECT p FROM Plantillas p WHERE p.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Plantillas.findByPblu", query = "SELECT p FROM Plantillas p WHERE p.plantillasPK.pblu = :pblu"),
    @NamedQuery(name = "Plantillas.findByIdPlantilla", query = "SELECT p FROM Plantillas p WHERE p.idPlantilla = :idPlantilla"),
    @NamedQuery(name = "Plantillas.findByNumCtas", query = "SELECT p FROM Plantillas p WHERE p.numCtas = :numCtas"),
    @NamedQuery(name = "Plantillas.findByNumCtasSolicitadas", query = "SELECT p FROM Plantillas p WHERE p.numCtasSolicitadas = :numCtasSolicitadas"),
    @NamedQuery(name = "Plantillas.findByNumCtasResueltas", query = "SELECT p FROM Plantillas p WHERE p.numCtasResueltas = :numCtasResueltas"),
    @NamedQuery(name = "Plantillas.findByNumCtasCreadas", query = "SELECT p FROM Plantillas p WHERE p.numCtasCreadas = :numCtasCreadas"),
    @NamedQuery(name = "Plantillas.findByNumCtasError", query = "SELECT p FROM Plantillas p WHERE p.numCtasError = :numCtasError"),
    @NamedQuery(name = "Plantillas.findByUsuario", query = "SELECT p FROM Plantillas p WHERE p.usuario = :usuario"),
    @NamedQuery(name = "Plantillas.findByUdn", query = "SELECT p FROM Plantillas p WHERE p.udn = :udn"),
    @NamedQuery(name = "Plantillas.findByFileNameResult", query = "SELECT p FROM Plantillas p WHERE p.fileNameResult = :fileNameResult"),
    @NamedQuery(name = "Plantillas.findByPath", query = "SELECT p FROM Plantillas p WHERE p.path = :path"),
    @NamedQuery(name = "Plantillas.findByFileNamePrevalidacion", query = "SELECT p FROM Plantillas p WHERE p.fileNamePrevalidacion = :fileNamePrevalidacion"),
    @NamedQuery(name = "Plantillas.findByFileNameResultError", query = "SELECT p FROM Plantillas p WHERE p.fileNameResultError = :fileNameResultError"),
    @NamedQuery(name = "Plantillas.findByPreprocesado", query = "SELECT p FROM Plantillas p WHERE p.preprocesado = :preprocesado"),
    @NamedQuery(name = "Plantillas.findByProcesado", query = "SELECT p FROM Plantillas p WHERE p.procesado = :procesado")})
public class Plantillas implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlantillasPK plantillasPK;
    @Column(name = "descripcion", length = 2147483647)
    private String descripcion;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @Column(name = "id_plantilla", nullable = false)
    private int idPlantilla;
    @Column(name = "num_ctas")
    private Integer numCtas;
    @Column(name = "num_ctas_solicitadas")
    private Integer numCtasSolicitadas;
    @Column(name = "num_ctas_resueltas")
    private Integer numCtasResueltas;
    @Column(name = "num_ctas_creadas")
    private Integer numCtasCreadas;
    @Column(name = "num_ctas_error")
    private Integer numCtasError;
    @Column(name = "usuario", length = 2147483647)
    private String usuario;
    @Column(name = "udn")
    private Integer udn;
    @Column(name = "file_name_result", length = 50)
    private String fileNameResult;
    @Column(name = "path", length = 255)
    private String path;
    @Column(name = "file_name_prevalidacion", length = 55)
    private String fileNamePrevalidacion;
    @Column(name = "file_name_result_error", length = 55)
    private String fileNameResultError;
    @Column(name = "preprocesado")
    private Boolean preprocesado;
    @Column(name = "procesado")
    private Boolean procesado;

    public Plantillas() {
    }

    public Plantillas(PlantillasPK plantillasPK) {
        this.plantillasPK = plantillasPK;
    }

    public Plantillas(PlantillasPK plantillasPK, int idPlantilla) {
        this.plantillasPK = plantillasPK;
        this.idPlantilla = idPlantilla;
    }

    public Plantillas(String fileName, int pblu) {
        this.plantillasPK = new PlantillasPK(fileName, pblu);
    }

    public PlantillasPK getPlantillasPK() {
        return plantillasPK;
    }

    public void setPlantillasPK(PlantillasPK plantillasPK) {
        this.plantillasPK = plantillasPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(int idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Integer getNumCtas() {
        return numCtas;
    }

    public void setNumCtas(Integer numCtas) {
        this.numCtas = numCtas;
    }

    public Integer getNumCtasSolicitadas() {
        return numCtasSolicitadas;
    }

    public void setNumCtasSolicitadas(Integer numCtasSolicitadas) {
        this.numCtasSolicitadas = numCtasSolicitadas;
    }

    public Integer getNumCtasResueltas() {
        return numCtasResueltas;
    }

    public void setNumCtasResueltas(Integer numCtasResueltas) {
        this.numCtasResueltas = numCtasResueltas;
    }

    public Integer getNumCtasCreadas() {
        return numCtasCreadas;
    }

    public void setNumCtasCreadas(Integer numCtasCreadas) {
        this.numCtasCreadas = numCtasCreadas;
    }

    public Integer getNumCtasError() {
        return numCtasError;
    }

    public void setNumCtasError(Integer numCtasError) {
        this.numCtasError = numCtasError;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getUdn() {
        return udn;
    }

    public void setUdn(Integer udn) {
        this.udn = udn;
    }

    public String getFileNameResult() {
        return fileNameResult;
    }

    public void setFileNameResult(String fileNameResult) {
        this.fileNameResult = fileNameResult;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileNamePrevalidacion() {
        return fileNamePrevalidacion;
    }

    public void setFileNamePrevalidacion(String fileNamePrevalidacion) {
        this.fileNamePrevalidacion = fileNamePrevalidacion;
    }

    public String getFileNameResultError() {
        return fileNameResultError;
    }

    public void setFileNameResultError(String fileNameResultError) {
        this.fileNameResultError = fileNameResultError;
    }

    public Boolean getPreprocesado() {
        return preprocesado;
    }

    public void setPreprocesado(Boolean preprocesado) {
        this.preprocesado = preprocesado;
    }

    public Boolean getProcesado() {
        return procesado;
    }

    public void setProcesado(Boolean procesado) {
        this.procesado = procesado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plantillasPK != null ? plantillasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plantillas)) {
            return false;
        }
        Plantillas other = (Plantillas) object;
        if ((this.plantillasPK == null && other.plantillasPK != null) || (this.plantillasPK != null && !this.plantillasPK.equals(other.plantillasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Plantillas[ plantillasPK=" + plantillasPK + " ]";
    }
    
}
