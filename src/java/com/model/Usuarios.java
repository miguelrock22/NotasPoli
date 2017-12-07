package com.model;
// Generated Dec 6, 2017 2:03:14 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer idUsuario;
     private Roles roles;
     private String email;
     private String password;
     private String cedula;
     private String nombre;
     private String direccion;
     private String telefono;
     private String carrera;
     private Set<AsigEst> asigEsts = new HashSet<AsigEst>(0);
     private Asignatura asignatura;

    public Usuarios() {
    }

	
    public Usuarios(String email) {
        this.email = email;
    }
    public Usuarios(Roles roles, String email, String password, String cedula, String nombre, String direccion, String telefono, String carrera, Set<AsigEst> asigEsts, Asignatura asignatura) {
       this.roles = roles;
       this.email = email;
       this.password = password;
       this.cedula = cedula;
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.carrera = carrera;
       this.asigEsts = asigEsts;
       this.asignatura = asignatura;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCarrera() {
        return this.carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public Set<AsigEst> getAsigEsts() {
        return this.asigEsts;
    }
    
    public void setAsigEsts(Set<AsigEst> asigEsts) {
        this.asigEsts = asigEsts;
    }
    public Asignatura getAsignatura() {
        return this.asignatura;
    }
    
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }




}

