package cigma.pfe.models;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data

@DiscriminatorValue("normal")


public class ClientNormal  extends Client{
	
	private int importanceLevel;
	
	public ClientNormal(String name, int importanceLevel) {
	
		super(name);
		this.importanceLevel = importanceLevel;
	}


}
