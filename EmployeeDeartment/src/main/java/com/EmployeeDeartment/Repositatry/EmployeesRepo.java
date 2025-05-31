package com.EmployeeDeartment.Repositatry;

import com.EmployeeDeartment.Entity.EmployeeDetails;

import java.util.List;

public interface EmployeesRepo{

  public List<EmployeeDetails> employess(String department, int salary);
  public int softDelete(int eid);
}
