package com.mx.Evento.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
//limbok : es un proyecto que fue creado para acortar codigo
//sus anotaciones @Getter y @Setter atyudan a no esscribir los repetivos metodos
//@EqualsAndHashCode o @ToString son anotaciones que igual pueden escribirse para ahorrase el escribir cada uno de los mencionados
//lombok tambien ofrece la anotacion @Data que contiene dichos metodos que son necesarios para la creacion de una clase
@Entity
@Table(name = "EVENTO")
@Data
public class Evento {
	
	
	@Id
	private int idEvento;
	private String nombre;
	@Column(columnDefinition = "FECHA_HORA")
	private LocalDateTime fechaHora;
	@Column(columnDefinition = "ESTRELLAS_INVITADAS")
	private String estrellasInvitadas;
	private int totalAsistencia;

}
