package com.vj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.vj.dao.StudentDAO;
import com.vj.dto.Student;

@Path("/student")
public class SampleResource {
	
	@GET
	@Path("/{param}")
	@Produces("application/json")
	public String getStudent(@PathParam("param") String idStr) throws Exception {
 
		//String result = "Restful example : " + msg;
 
		//return Response.status(200).entity(result).build();
		
		System.out.println("Call Reached getStudent");
		
		StudentDAO dao = new StudentDAO();
		int id = Integer.parseInt(idStr);
		Student student = dao.GetStudent(id);
		
		Gson gson = new Gson();
		return gson.toJson(student);
	}

}
