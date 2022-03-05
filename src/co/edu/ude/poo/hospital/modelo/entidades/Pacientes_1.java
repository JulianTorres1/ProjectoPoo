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
@Table(name = "pacientes", catalog = "bd_poo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pacientes_1.findAll", query = "SELECT p FROM Pacientes_1 p"),
    @NamedQuery(name = "Pacientes_1.findByIdpacientes", query = "SELECT p FROM Pacientes_1 p WHERE p.idpacientes = :idpacientes"),
    @NamedQuery(name = "Pacientes_1.findByNombre", query = "SELECT p FROM Pacientes_1 p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Pacientes_1.findByDireccion", query = "SELECT p FROM Pacientes_1 p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Pacientes_1.findByTelefono", query = "SELECT p FROM Pacientes_1 p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Pacientes_1.findByPoblacion", query = "SELECT p FROM Pacientes_1 p WHERE p.poblacion = :poblacion"),
    @NamedQuery(name = "Pacientes_1.findByProvincia", query = "SELECT p FROM Pacientes_1 p WHERE p.provincia = :provincia"),
    @NamedQuery(name = "Pacientes_1.findByNif", query = "SELECT p FROM Pacientes_1 p WHERE p.nif = :nif"),
    @NamedQuery(name = "Pacientes_1.findByMedicoCorrespondiente", query = "SELECT p FROM Pacientes_1 p WHERE p.medicoCorrespondiente = :medicoCorrespondiente"),
    @NamedQuery(name = "Pacientes_1.findByHistorialMedico", query = "SELECT p FROM Pacientes_1 p WHERE p.historialMedico = :historialMedico")})
public class Pacientes_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpacientes", nullable = false)
    private Integer idpacientes;
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
    @Column(name = "NIF", length = 45)
    private String nif;
    @Column(name = "MedicoCorrespondiente", length = 45)
    private String medicoCorrespondiente;
    @Column(name = "HistorialMedico", length = 45)
    private String historialMedico;

    public Pacientes_1() {
    }

    public Pacientes_1(Integer idpacientes) {
        this.idpacientes = idpacientes;
    }

    public Pacientes_1(Integer idpacientes, String nombre) {
        this.idpacientes = idpacientes;
        this.nombre = nombre;
    }

    public Integer getIdpacientes() {
        return idpacientes;
    }

    public void setIdpacientes(Integer idpacientes) {
        this.idpacientes = idpacientes;
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

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getMedicoCorrespondiente() {
        return medicoCorrespondiente;
    }

    public void setMedicoCorrespondiente(String medicoCorrespondiente) {
        this.medicoCorrespondiente = medicoCorrespondiente;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpacientes != null ? idpacientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacientes_1)) {
            return false;
        }
        Pacientes_1 other = (Pacientes_1) object;
        if ((this.idpacientes == null && other.idpacientes != null) || (this.idpacientes != null && !this.idpacientes.equals(other.idpacientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.ude.poo.hospital.modelo.entidades.Pacientes_1[ idpacientes=" + idpacientes + " ]";
    }
    
}
