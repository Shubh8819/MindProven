package com.EmployeeDeartment.Repositatry;

import com.EmployeeDeartment.Entity.EmployeeDetails;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class EmployessRepoImpl implements EmployeesRepo{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<EmployeeDetails> employess(String department, int salary) {
        String q="select employeesDetails.eid ,employeesDetails.ename , employeesDetails.salary, employeesDetails.department  from employeesDetails where salary = : salary and department=:department";
        Query query= entityManager.createNativeQuery(q);
        query.setParameter("salary", salary);
        query.setParameter("department", department);


        return query.getResultList();
    }

    @Override
    @Transactional
    public int softDelete(int eid) {
        String q = "UPDATE employeesDetails SET isDeleted = 1 WHERE eid = :eid";
        Query query = entityManager.createNativeQuery(q);
        query.setParameter("eid", eid);

        return query.executeUpdate();
    }

}

