package cigma.pfe.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TClients")

  public class Client {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@OneToMany
	private List<Facture> factures;
	
	@ManyToMany(cascade = {CascadeType.PERSIST})
	@JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
			name = "client_fk",
			referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "promotion_fk",referencedColumnName = "id"))
	
	private List<Promotion> promotions;
	
	@OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private CarteFidelio carteFidelio;

	
	

	
	public Client() {
	}
	
	
	public Client(String name) {
	this.name = name;
	}
}
