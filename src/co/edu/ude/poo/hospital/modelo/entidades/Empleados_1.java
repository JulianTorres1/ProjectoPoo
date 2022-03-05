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
@Table(name = "empleados", catalog = "bd_poo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Empleados_1.findAll", query = "SELECT e FROM Empleados_1 e"),
    @NamedQuery(name = "Empleados_1.findByIdempleados", query = "SELECT e FROM Empleados_1 e WHERE e.idempleados = :idempleados"),
    @NamedQuery(name = "Empleados_1.findByNombre", query = "SELECT e FROM Empleados_1 e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleados_1.findByDireccion", query = "SELECT e FROM Empleados_1 e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Empleados_1.findByTelefono", query = "SELECT e FROM Empleados_1 e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Empleados_1.findByPoblacion", query = "SELECT e FROM Empleados_1 e WHERE e.poblacion = :poblacion"),
    @NamedQuery(name = "Empleados_1.findByProvincia", query = "SELECT e FROM Empleados_1 e WHERE e.provincia = :provincia"),
    @NamedQuery(name = "Empleados_1.findByNif", query = "SELECT e FROM Empleados_1 e WHERE e.nif = :nif"),
    @NamedQuery(name = "Empleados_1.findByNumeroSeguridadSocial", query = "SELECT e FROM Empleados_1 e WHERE e.numeroSeguridadSocial = :numeroSeguridadSocial"),
    @NamedQuery(name = "Empleados_1.findByTipoDeEmpleado", query = "SELECT e FROM Empleados_1 e WHERE e.tipoDeEmpleado = :tipoDeEmpleado")})
public class Empleados_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempleados", nullable = false)
    private Integer idempleados;
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
    @Column(name = "NIF", length = 45)
    private String nif;
    @Column(name = "NumeroSeguridadSocial", length = 45)
    private String numeroSeguridadSocial;
    @Column(name = "TipoDeEmpleado", length = 45)
    private String tipoDeEmpleado;

    public Empleados_1() {
    }

    public Empleados_1(Integer idempleados) {
        this.idempleados = idempleados;
    }

    public Integer getIdempleados() {
        return idempleados;
    }

    public void setIdempleados(Integer idempleados) {
        this.idempleados = idempleados;
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

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public String getTipoDeEmpleado() {
        return tipoDeEmpleado;
    }

    public void setTipoDeEmpleado(String tipoDeEmpleado) {
        this.tipoDeEmpleado = tipoDeEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempleados != null ? idempleados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados_1)) {
            return false;
        }
        Empleados_1 other = (Empleados_1) object;
        if ((this.idempleados == null && other.idempleados != null) || (this.idempleados != null && !this.idempleados.equals(other.idempleados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.ude.poo.hospital.modelo.entidades.Empleados_1[ idempleados=" + idempleados + " ]";
    }
    
}
