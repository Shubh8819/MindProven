package com.EmployeeDeartment.Service;

import com.EmployeeDeartment.Entity.EmployeeDetails;
import com.EmployeeDeartment.Repositatry.EmployeesRepo;

import java.util.List;

public interface EmployessService  {
    public List<EmployeeDetails> employess(String department, int salary);

    public int softDelet(int eid);
}
