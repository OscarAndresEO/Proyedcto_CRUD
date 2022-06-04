package com.example.crud.modelo;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "estudiante")
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column(name = "carnet", nullable = false, length = 128)
	private String carnet;
	@Column(name = "nombre", nullable = false, length = 64)
	private String nombre;

	@Column(name = "telefono", nullable = false, length = 15)
	private String telefono;

	@Column(name = "email", nullable = false, length = 64)
	private String email;



	@Column(name = "estado",insertable = false, columnDefinition="varchar(16) not null DEFAULT 'ACTIVO' ")
	private String estado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_creacion", updatable = false, nullable = false, insertable = false,
			columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Calendar fecha_creacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_modificacion", updatable = false, nullable = true, insertable = false,
			columnDefinition="TIMESTAMP ")
	private Calendar fecha_modificacion;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Calendar getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Calendar fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}


	public Estudiante(int id, String nombre, String telefono, String email, String carnet, String estado, Calendar fecha_creacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.carnet = carnet;
		this.estado = estado;
		this.fecha_creacion = fecha_creacion;

	}

	public Estudiante(int id) {
		this.id = id;
	}

	public Estudiante() {
		super();
	}
}