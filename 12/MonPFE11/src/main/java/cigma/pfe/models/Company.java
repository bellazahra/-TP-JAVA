package cigma.pfe.models;

import lombok.Data;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@IdClass(CampanyId.class)
public class Company {

	@EmbeddedId
	private CampanyId id;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String name;
	private String address;
	private String phone;
	

	@Embedded
	@AttributeOverride(name = "phone", column =  @Column (name ="PHONE_PERSON"))
	private ContactPerson contactPerson;


}
