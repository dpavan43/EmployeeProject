package com.example.japps.model;

public class Employee {
    private String name;
    private int id;
    private double salary;

   public String getname() {
	   return name;
   }
   public void setName(String name) {
	   this.name=name; 
   }
   public int getId(){
	   return id;
   }
   public void setId(int id) {
	   this.id=id;
   }
   public double getSalary() {
	   return salary;
   }
   public void setSalary(double salary) {
	   this.salary=salary;
   }
//   public void displayInfo() {
//	    System.out.println("Employee{Id=" + Id + ",Name='" + Name + "', Salary=" + Salary + '}');
//	}
}


