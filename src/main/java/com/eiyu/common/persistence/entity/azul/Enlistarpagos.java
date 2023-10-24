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
@Table(name = "enlistarpagos", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Enlistarpagos.findAll", query = "SELECT e FROM Enlistarpagos e"),
    @NamedQuery(name = "Enlistarpagos.findById", query = "SELECT e FROM Enlistarpagos e WHERE e.id = :id"),
    @NamedQuery(name = "Enlistarpagos.findByBanco", query = "SELECT e FROM Enlistarpagos e WHERE e.banco = :banco"),
    @NamedQuery(name = "Enlistarpagos.findByBeneficiario", query = "SELECT e FROM Enlistarpagos e WHERE e.beneficiario = :beneficiario"),
    @NamedQuery(name = "Enlistarpagos.findByClaberastreo", query = "SELECT e FROM Enlistarpagos e WHERE e.claberastreo = :claberastreo"),
    @NamedQuery(name = "Enlistarpagos.findByConceptopago", query = "SELECT e FROM Enlistarpagos e WHERE e.conceptopago = :conceptopago"),
    @NamedQuery(name = "Enlistarpagos.findByDestino", query = "SELECT e FROM Enlistarpagos e WHERE e.destino = :destino"),
    @NamedQuery(name = "Enlistarpagos.findByMonto", query = "SELECT e FROM Enlistarpagos e WHERE e.monto = :monto"),
    @NamedQuery(name = "Enlistarpagos.findByNumerodecuenta", query = "SELECT e FROM Enlistarpagos e WHERE e.numerodecuenta = :numerodecuenta"),
    @NamedQuery(name = "Enlistarpagos.findByRefnumerica", query = "SELECT e FROM Enlistarpagos e WHERE e.refnumerica = :refnumerica"),
    @NamedQuery(name = "Enlistarpagos.findByEstatus", query = "SELECT e FROM Enlistarpagos e WHERE e.estatus = :estatus"),
    @NamedQuery(name = "Enlistarpagos.findByPblu", query = "SELECT e FROM Enlistarpagos e WHERE e.pblu = :pblu"),
    @NamedQuery(name = "Enlistarpagos.findByIdRol", query = "SELECT e FROM Enlistarpagos e WHERE e.idRol = :idRol"),
    @NamedQuery(name = "Enlistarpagos.findByIdUsuario", query = "SELECT e FROM Enlistarpagos e WHERE e.idUsuario = :idUsuario")})
public class Enlistarpagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "banco", length = 255)
    private String banco;
    @Column(name = "beneficiario", length = 255)
    private String beneficiario;
    @Column(name = "claberastreo", length = 255)
    private String claberastreo;
    @Column(name = "conceptopago", length = 255)
    private String conceptopago;
    @Column(name = "destino", length = 255)
    private String destino;
    @Basic(optional = false)
    @Column(name = "monto", nullable = false)
    private float monto;
    @Column(name = "numerodecuenta", length = 255)
    private String numerodecuenta;
    @Column(name = "refnumerica", length = 255)
    private String refnumerica;
    @Column(name = "estatus")
    private Boolean estatus;
    @Column(name = "pblu")
    private Integer pblu;
    @Column(name = "id_rol")
    private Integer idRol;
    @Column(name = "id_usuario", length = 255)
    private String idUsuario;

    public Enlistarpagos() {
    }

    public Enlistarpagos(Integer id) {
        this.id = id;
    }

    public Enlistarpagos(Integer id, float monto) {
        this.id = id;
        this.monto = monto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getClaberastreo() {
        return claberastreo;
    }

    public void setClaberastreo(String claberastreo) {
        this.claberastreo = claberastreo;
    }

    public String getConceptopago() {
        return conceptopago;
    }

    public void setConceptopago(String conceptopago) {
        this.conceptopago = conceptopago;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(String numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public String getRefnumerica() {
        return refnumerica;
    }

    public void setRefnumerica(String refnumerica) {
        this.refnumerica = refnumerica;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    public Integer getPblu() {
        return pblu;
    }

    public void setPblu(Integer pblu) {
        this.pblu = pblu;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof Enlistarpagos)) {
            return false;
        }
        Enlistarpagos other = (Enlistarpagos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Enlistarpagos[ id=" + id + " ]";
    }
    
}
