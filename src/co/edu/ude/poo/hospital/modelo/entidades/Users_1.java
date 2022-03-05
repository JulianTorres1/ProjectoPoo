/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.hospital.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author julia
 */
@Entity
@Table(name = "users", catalog = "bd_poo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Users_1.findAll", query = "SELECT u FROM Users_1 u"),
    @NamedQuery(name = "Users_1.findByIdUsers", query = "SELECT u FROM Users_1 u WHERE u.idUsers = :idUsers"),
    @NamedQuery(name = "Users_1.findByNombre", query = "SELECT u FROM Users_1 u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Users_1.findByDireccion", query = "SELECT u FROM Users_1 u WHERE u.direccion = :direccion"),
    @NamedQuery(name = "Users_1.findByTelefono", query = "SELECT u FROM Users_1 u WHERE u.telefono = :telefono"),
    @NamedQuery(name = "Users_1.findByPoblacion", query = "SELECT u FROM Users_1 u WHERE u.poblacion = :poblacion"),
    @NamedQuery(name = "Users_1.findByProvincia", query = "SELECT u FROM Users_1 u WHERE u.provincia = :provincia"),
    @NamedQuery(name = "Users_1.findByCodigoPostal", query = "SELECT u FROM Users_1 u WHERE u.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "Users_1.findByNif", query = "SELECT u FROM Users_1 u WHERE u.nif = :nif"),
    @NamedQuery(name = "Users_1.findByNumeroSeguridadSocial", query = "SELECT u FROM Users_1 u WHERE u.numeroSeguridadSocial = :numeroSeguridadSocial")})
public class Users_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsers", nullable = false)
    private Integer idUsers;
    @Basic(optional = false)
    @Column(name = "Nombre", nullable = false, length = 45)
    private String nombre;
    @Column(name = "Direccion", length = 45)
    private String direccion;
    @Column(name = "Telefono", length = 45)
    private String telefono;
    @Column(name = "Poblacion", length = 45)
    private String poblacion;
    @Column(name = "Provincia", length = 45)
    private String provincia;
    @Column(name = "CodigoPostal", length = 45)
    private String codigoPostal;
    @Column(name = "NIF", length = 45)
    private String nif;
    @Column(name = "NumeroSeguridadSocial", length = 45)
    private String numeroSeguridadSocial;
    

    public Users_1() {
    }

    public Users_1(Integer idUsers) {
        this.idUsers = idUsers;
    }

    public Users_1(Integer idUsers, String nombre) {
        this.idUsers = idUsers;
        this.nombre = nombre;
    }

    public Integer getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(Integer idUsers) {
        this.idUsers = idUsers;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsers != null ? idUsers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users_1)) {
            return false;
        }
        Users_1 other = (Users_1) object;
        if ((this.idUsers == null && other.idUsers != null) || (this.idUsers != null && !this.idUsers.equals(other.idUsers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.ude.poo.hospital.modelo.entidades.Users_1[ idUsers=" + idUsers + " ]";
    }
    
}
