package com.EmployeeDeartment.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employeesDetails")
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid")
    private int id;

    @Column(name = "ename")
    private String ename;

    @Column(name = "esalery")
    private int salary;

    @Column(name = "department")
    public String deparment;

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public EmployeeDetails() {
    }

    public EmployeeDetails(int id, String ename, int salary) {
        this.id = id;
        this.ename = ename;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", deparment='" + deparment + '\'' +
                '}';
    }
}
