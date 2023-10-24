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
@Table(name = "claves_rastreo", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "ClavesRastreo.findAll", query = "SELECT c FROM ClavesRastreo c"),
    @NamedQuery(name = "ClavesRastreo.findById", query = "SELECT c FROM ClavesRastreo c WHERE c.id = :id"),
    @NamedQuery(name = "ClavesRastreo.findByFecha", query = "SELECT c FROM ClavesRastreo c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "ClavesRastreo.findBySpeiEmisor", query = "SELECT c FROM ClavesRastreo c WHERE c.speiEmisor = :speiEmisor"),
    @NamedQuery(name = "ClavesRastreo.findByHora", query = "SELECT c FROM ClavesRastreo c WHERE c.hora = :hora"),
    @NamedQuery(name = "ClavesRastreo.findByTipoAplicacion", query = "SELECT c FROM ClavesRastreo c WHERE c.tipoAplicacion = :tipoAplicacion"),
    @NamedQuery(name = "ClavesRastreo.findByIdParticipante", query = "SELECT c FROM ClavesRastreo c WHERE c.idParticipante = :idParticipante"),
    @NamedQuery(name = "ClavesRastreo.findByDatoIncremental", query = "SELECT c FROM ClavesRastreo c WHERE c.datoIncremental = :datoIncremental"),
    @NamedQuery(name = "ClavesRastreo.findByDatoVerificador", query = "SELECT c FROM ClavesRastreo c WHERE c.datoVerificador = :datoVerificador")})
public class ClavesRastreo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fecha", nullable = false, length = 2147483647)
    private String fecha;
    @Basic(optional = false)
    @Column(name = "spei_emisor", nullable = false, length = 2147483647)
    private String speiEmisor;
    @Basic(optional = false)
    @Column(name = "hora", nullable = false, length = 2147483647)
    private String hora;
    @Basic(optional = false)
    @Column(name = "tipo_aplicacion", nullable = false, length = 2147483647)
    private String tipoAplicacion;
    @Basic(optional = false)
    @Column(name = "id_participante", nullable = false, length = 2147483647)
    private String idParticipante;
    @Column(name = "dato_incremental")
    private Integer datoIncremental;
    @Column(name = "dato_verificador", length = 2147483647)
    private String datoVerificador;

    public ClavesRastreo() {
    }

    public ClavesRastreo(Integer id) {
        this.id = id;
    }

    public ClavesRastreo(Integer id, String fecha, String speiEmisor, String hora, String tipoAplicacion, String idParticipante) {
        this.id = id;
        this.fecha = fecha;
        this.speiEmisor = speiEmisor;
        this.hora = hora;
        this.tipoAplicacion = tipoAplicacion;
        this.idParticipante = idParticipante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSpeiEmisor() {
        return speiEmisor;
    }

    public void setSpeiEmisor(String speiEmisor) {
        this.speiEmisor = speiEmisor;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipoAplicacion() {
        return tipoAplicacion;
    }

    public void setTipoAplicacion(String tipoAplicacion) {
        this.tipoAplicacion = tipoAplicacion;
    }

    public String getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(String idParticipante) {
        this.idParticipante = idParticipante;
    }

    public Integer getDatoIncremental() {
        return datoIncremental;
    }

    public void setDatoIncremental(Integer datoIncremental) {
        this.datoIncremental = datoIncremental;
    }

    public String getDatoVerificador() {
        return datoVerificador;
    }

    public void setDatoVerificador(String datoVerificador) {
        this.datoVerificador = datoVerificador;
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
        if (!(object instanceof ClavesRastreo)) {
            return false;
        }
        ClavesRastreo other = (ClavesRastreo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.ClavesRastreo[ id=" + id + " ]";
    }
    
}
