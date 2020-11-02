package modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="armas")
@Data
@AllArgsConstructor
public class Arma {
	
	@Id
	private String id;


	@ManyToMany(cascade = CascadeType.DETACH,  mappedBy = "armas")
	private List<Enemigo> enemigos;


}
