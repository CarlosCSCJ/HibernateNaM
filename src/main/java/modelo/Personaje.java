package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="personajes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personaje implements Serializable {
	
	@Id
	private String id;
	
	@Column(name = "nombre")
	private String nombre;


	@ManyToOne
	@JoinColumn(name="id_alarma")
	private Arma arma;
}
