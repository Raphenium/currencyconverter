package net.kzn.shoppingbackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
	
private static final long serialVersionUID = 1L;
	
	// private fields
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
	
  private String AFN;
  private String AED;

  

public Results() {

  }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

  public String getAFN() {
    return AFN;
  }

  public void setAFN(String AFN) {
    this.AFN = AFN;
  }

  public String getAED() {
    return AED;
  }

  public void setAED(String AED) {
    this.AED = AED;
  }

  

}
