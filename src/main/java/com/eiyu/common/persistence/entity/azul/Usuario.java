/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "usuario", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id"),
    @NamedQuery(name = "Usuario.findByActivo", query = "SELECT u FROM Usuario u WHERE u.activo = :activo"),
    @NamedQuery(name = "Usuario.findByUsuario", query = "SELECT u FROM Usuario u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuario.findByPassword", query = "SELECT u FROM Usuario u WHERE u.password = :password"),
    @NamedQuery(name = "Usuario.findByIdParticipante", query = "SELECT u FROM Usuario u WHERE u.idParticipante = :idParticipante")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "usuario", length = 255)
    private String usuario;
    @Column(name = "password", length = 255)
    private String password;
    @Basic(optional = false)
    @Column(name = "id_participante", nullable = false)
    private int idParticipante;
    @JoinTable(name = "usuario_rol", joinColumns = {
        @JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "id_rol", referencedColumnName = "id_rol", nullable = false)})
    @ManyToMany
    private List<Rol> rolList;
    @JoinTable(name = "usuarios_permisos", joinColumns = {
        @JoinColumn(name = "id_user", referencedColumnName = "id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "id_permiso", referencedColumnName = "id", nullable = false)})
    @ManyToMany
    private List<Permisos> permisosList;
    @JoinColumn(name = "id_password", referencedColumnName = "id")
    @ManyToOne
    private Apipassword idPassword;
    @JoinColumn(name = "id_rol_fk", referencedColumnName = "id_rol", nullable = false)
    @ManyToOne(optional = false)
    private Rol idRolFk;
    @JoinColumn(name = "id_token_fk", referencedColumnName = "id")
    @ManyToOne
    private Tokens idTokenFk;

    public Usuario() {
    }

    public Usuario(Long id) {
        this.id = id;
    }

    public Usuario(Long id, int idParticipante) {
        this.id = id;
        this.idParticipante = idParticipante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(int idParticipante) {
        this.idParticipante = idParticipante;
    }

    public List<Rol> getRolList() {
        return rolList;
    }

    public void setRolList(List<Rol> rolList) {
        this.rolList = rolList;
    }

    public List<Permisos> getPermisosList() {
        return permisosList;
    }

    public void setPermisosList(List<Permisos> permisosList) {
        this.permisosList = permisosList;
    }

    public Apipassword getIdPassword() {
        return idPassword;
    }

    public void setIdPassword(Apipassword idPassword) {
        this.idPassword = idPassword;
    }

    public Rol getIdRolFk() {
        return idRolFk;
    }

    public void setIdRolFk(Rol idRolFk) {
        this.idRolFk = idRolFk;
    }

    public Tokens getIdTokenFk() {
        return idTokenFk;
    }

    public void setIdTokenFk(Tokens idTokenFk) {
        this.idTokenFk = idTokenFk;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Usuario[ id=" + id + " ]";
    }
    
}
