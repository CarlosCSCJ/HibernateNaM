package modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="personajes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enemigo implements Serializable {
	
	@Id
	private String id;
	
	@Column(name = "nombre")
	private String nombre;


	@ManyToMany(cascade= CascadeType.DETACH)
	@JoinTable(name="enemigoArma", 
			   joinColumns = {@JoinColumn(name="id_enemigo")},
			   inverseJoinColumns = {@JoinColumn(name="id_arma")}
	)
	private List<Arma> armas;
}
