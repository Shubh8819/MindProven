package com.EmployeeDeartment.Service;

import com.EmployeeDeartment.Entity.EmployeeDetails;
import com.EmployeeDeartment.Repositatry.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployessServiceImpl implements EmployessService{

    @Autowired
    private EmployeesRepo employeesRepo;
    @Override
    public List<EmployeeDetails> employess(String department, int salary) {
      return this.employeesRepo.employess(department,salary);
    }

    @Override

    public int softDelet(int eid) {

        return this.employeesRepo.softDelete(eid);

    }

}
