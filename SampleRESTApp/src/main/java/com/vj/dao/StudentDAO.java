package com.vj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vj.dto.Student;

public class StudentDAO {

	public Student GetStudent(int id)
			throws Exception {
		
		Student student = new Student();
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
			Connection conn = DriverManager.getConnection("jdbc:mysql://ec2-52-10-67-187.us-west-2.compute.amazonaws.com:3306/hackathon1", "hacker1", "password") ;
			String query = "SELECT id,name,classofstudy,dob FROM students where id = " + id + ";" ;
			PreparedStatement ps = conn	.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setClassOfStudy(rs.getInt("classofstudy"));
				student.setDob(rs.getDate("dob"));
			}
			return student;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		try{
			Student student = dao.GetStudent(1);
			System.out.println(student.getId() + student.getName());
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}