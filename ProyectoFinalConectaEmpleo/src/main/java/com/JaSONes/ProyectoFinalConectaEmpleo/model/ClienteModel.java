package com.JaSONes.ProyectoFinalConectaEmpleo.model;


import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


public class ClienteModel implements Serializable {
		

	private static final long serialVersionUID = -8654010482565274944L;
		public enum Sexo{
			HOMBRE, MUJER
		}
		
		private String dni;
		private String nombre;
		private String apellidos;
		@DateTimeFormat(iso=ISO.DATE, pattern= "yyyy/MM/dd")
		private LocalDate fecha_Nacimiento;
		private Sexo sexo;
		private String domicilio;
		private String cp;
		private String Ciudad;
		private String telefono_fijo;
		private String mail;
		@DateTimeFormat(iso=ISO.DATE, pattern="yyyy-MM-dd")
		private LocalDate fecha_primera_visita;
		private int peluquero_favorito;
		
		//Constructor por defecto
		public ClienteModel(String dni2, Object object, Object object2) {
			super();

		}
		
		//Constructor con parámetros		
		public ClienteModel(String dni, String nombre, String apellidos, 
				LocalDate fecha_Nacimiento, String telefono_fijo,
				String mail) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fecha_Nacimiento = fecha_Nacimiento;
			this.telefono_fijo = telefono_fijo;
			this.mail = mail;
		}
		
		//Getters and setters
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public LocalDate getFecha_Nacimiento() {
			return fecha_Nacimiento;
		}
		public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
			this.fecha_Nacimiento = fecha_Nacimiento;
		}
		public Sexo getSexo() {
			return sexo;
		}
		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}
		public String getDomicilio() {
			return domicilio;
		}
		public void setDomicilio(String domicilio) {
			this.domicilio = domicilio;
		}
		public String getCp() {
			return cp;
		}
		public void setCp(String cp) {
			this.cp = cp;
		}
		public String getCiudad() {
			return Ciudad;
		}
		public void setCiudad(String ciudad) {
			Ciudad = ciudad;
		}
		public String getTelefono_fijo() {
			return telefono_fijo;
		}
		public void setTelefono_fijo(String telefono_fijo) {
			this.telefono_fijo = telefono_fijo;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public LocalDate getFecha_primera_visita() {
			return fecha_primera_visita;
		}
		public void setFecha_primera_visita(LocalDate fecha_primera_visita) {
			this.fecha_primera_visita = fecha_primera_visita;
		}
		public int getPeluquero_favorito() {
			return peluquero_favorito;
		}
		public void setPeluquero_favorito(int peluquero_favorito) {
			this.peluquero_favorito = peluquero_favorito;
		}

		//Método toString
		@Override
		public String toString() {
			return "ClienteModel [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos
					+ ", fecha_Nacimiento=" + fecha_Nacimiento + ", sexo=" + sexo + ", domicilio=" + domicilio + ", cp="
					+ cp + ", Ciudad=" + Ciudad + ", telefono_fijo=" + telefono_fijo + ", mail=" + mail
					+ ", fecha_primera_visita=" + fecha_primera_visita + ", peluquero_favorito=" + peluquero_favorito
					+ "]";
		}
		
		//Método para igualar por DNI.
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				   return true;
				if (obj == null)
				   return false;
				if (getClass() != obj.getClass())
				   return false;
				ClienteModel other = (ClienteModel) obj;
				if (dni != other.dni)
				    return false;
				return true;

		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dni == null) ? 0 : dni.hashCode());
			return result;

		}
		

		
		
		
}
