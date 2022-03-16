package cigma.pfe.models;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String name;
	private String address;
	private String phone;
	

	@Embedded
	@AttributeOverride(name = "phone", column =  @Column (name ="PHONE_PERSON"))
	private ContactPerson contactPerson;


}
