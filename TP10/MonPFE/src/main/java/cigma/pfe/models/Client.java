package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

import lombok.Data;
import javax.persistence.*;
import java.util.List;


@Entity
@Data
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="client_type")
//@DiscriminatorValue("client")

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

   public class Client {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	private String name;
	
	public Client(String name) {
	
		this.name = name;
	}
	
	public Client() {
	
	}

}