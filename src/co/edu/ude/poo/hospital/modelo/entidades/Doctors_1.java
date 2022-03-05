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
@Table(name = "doctors", catalog = "bd_poo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Doctors_1.findAll", query = "SELECT d FROM Doctors_1 d"),
    @NamedQuery(name = "Doctors_1.findByIdDoctors", query = "SELECT d FROM Doctors_1 d WHERE d.idDoctors = :idDoctors"),
    @NamedQuery(name = "Doctors_1.findByNombre", query = "SELECT d FROM Doctors_1 d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Doctors_1.findByDireccion", query = "SELECT d FROM Doctors_1 d WHERE d.direccion = :direccion"),
    @NamedQuery(name = "Doctors_1.findByTelefono", query = "SELECT d FROM Doctors_1 d WHERE d.telefono = :telefono"),
    @NamedQuery(name = "Doctors_1.findByPoblacion", query = "SELECT d FROM Doctors_1 d WHERE d.poblacion = :poblacion"),
    @NamedQuery(name = "Doctors_1.findByProvincia", query = "SELECT d FROM Doctors_1 d WHERE d.provincia = :provincia"),
    @NamedQuery(name = "Doctors_1.findByCodigoPostal", query = "SELECT d FROM Doctors_1 d WHERE d.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "Doctors_1.findByNif", query = "SELECT d FROM Doctors_1 d WHERE d.nif = :nif"),
    @NamedQuery(name = "Doctors_1.findByNumeroSeguridadSocial", query = "SELECT d FROM Doctors_1 d WHERE d.numeroSeguridadSocial = :numeroSeguridadSocial"),
    @NamedQuery(name = "Doctors_1.findByNumeroDeColegiado", query = "SELECT d FROM Doctors_1 d WHERE d.numeroDeColegiado = :numeroDeColegiado"),
    @NamedQuery(name = "Doctors_1.findByTipoDeDoctor", query = "SELECT d FROM Doctors_1 d WHERE d.tipoDeDoctor = :tipoDeDoctor")})
public class Doctors_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDoctors", nullable = false)
    private Integer idDoctors;
    @Column(name = "Nombre", length = 45)
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
    @Column(name = "NumeroDeColegiado", length = 45)
    private String numeroDeColegiado;
    @Column(name = "TipoDeDoctor", length = 45)
    private String tipoDeDoctor;

    public Doctors_1() {
    }

    public Doctors_1(Integer idDoctors) {
        this.idDoctors = idDoctors;
    }

    public Integer getIdDoctors() {
        return idDoctors;
    }

    public void setIdDoctors(Integer idDoctors) {
        this.idDoctors = idDoctors;
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

    public String getNumeroDeColegiado() {
        return numeroDeColegiado;
    }

    public void setNumeroDeColegiado(String numeroDeColegiado) {
        this.numeroDeColegiado = numeroDeColegiado;
    }

    public String getTipoDeDoctor() {
        return tipoDeDoctor;
    }

    public void setTipoDeDoctor(String tipoDeDoctor) {
        this.tipoDeDoctor = tipoDeDoctor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDoctors != null ? idDoctors.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctors_1)) {
            return false;
        }
        Doctors_1 other = (Doctors_1) object;
        if ((this.idDoctors == null && other.idDoctors != null) || (this.idDoctors != null && !this.idDoctors.equals(other.idDoctors))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.ude.poo.hospital.modelo.entidades.Doctors_1[ idDoctors=" + idDoctors + " ]";
    }
    
}
