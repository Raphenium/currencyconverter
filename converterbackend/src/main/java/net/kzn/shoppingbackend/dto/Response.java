package net.kzn.shoppingbackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Response {

private static final long serialVersionUID = 1L;
	
	// private fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	  @JsonProperty
	  @OneToOne
	  private RestResponse RestResponse;
	  
	  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RestResponse getRestResponse() {
	    return RestResponse;
	  }

	  public void setRestResponse(RestResponse restResponse) {
	    RestResponse = restResponse;
	  }

	  public Response(){
	    
	  }

	  @Override
	  public String toString() {
	    return "Response [RestResponse=" + RestResponse + "]";
	  }

	}
