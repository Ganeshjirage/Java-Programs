package com.practice.questions.insert_multiple_student_data_using_JDBC_into_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserInput {

	public void insertUserData(String FirstName, String LastName, String Address, String City, String Salary) {
		ConnectionTest connectionTest = new ConnectionTest();
		try {
			Connection con = connectionTest.getConnectionDetails();
			PreparedStatement state = con.prepareStatement(
					"insert into user (FirstName, LastName, Address, City, Salary) values (?,?,?,?,?)");
			state.setString(1, FirstName);
			state.setString(2, LastName);
			state.setString(3, Address);
			state.setString(4, City);
			state.setString(5, Salary);

			state.executeUpdate();
			System.out.println("Record is inserted successfully..");
			System.out.println();
			state.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter First Name ");
			String FirstName = scan.next();
			System.out.println("Enter Last Name ");
			String LastName = scan.next();
			System.out.println("Enter Address  ");
			String Address = scan.next();
			System.out.println("Enter City  ");
			String City = scan.next();
			System.out.println("Enter Salary  ");
			String Salary = scan.next();

			UserInput userInput = new UserInput();
			userInput.insertUserData(FirstName, LastName, Address, City, Salary);
		}
		scan.close();

	}

}
