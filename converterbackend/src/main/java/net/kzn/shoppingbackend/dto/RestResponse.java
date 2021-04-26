package net.kzn.shoppingbackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RestResponse {
private static final long serialVersionUID = 1L;
	
	// private fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String base;
	
	  @OneToOne
	  private Results result;
	  
	  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RestResponse(){    
	  }
	  
	  public String getBase() {
	    return base;
	  }
	  public void setBase(String base) {
	    this.base = base;
	  }
	  public Results getResult() {
	    return result;
	  }
	  public void setResult(Results result) {
	    this.result = result;
	  }

	  @Override
	  public String toString() {
	    return "RestResponse [base=" + base + ", result=" + result + "]";
	  }

}
