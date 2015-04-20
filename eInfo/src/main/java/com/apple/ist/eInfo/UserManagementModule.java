package com.apple.ist.eInfo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.apple.ist.bean.Product;

@Path("/user-management")
public class UserManagementModule {	 

	
	    @GET
	    @Path("/users")
	    @Produces("application/json")
	    public Product getAllUsers()
	    {
			Product product = new Product();
			product.setName("iPad 3");
			product.setQty(999);
	 
			return product;
	    }
	
}
