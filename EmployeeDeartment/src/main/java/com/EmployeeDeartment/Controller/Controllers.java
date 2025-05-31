package com.EmployeeDeartment.Controller;

import com.EmployeeDeartment.Entity.EmployeeDetails;
import com.EmployeeDeartment.Service.EmployessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controllers {
    @Autowired
    private EmployessService employessService;

    @GetMapping("/getByDepartment")
    public List<EmployeeDetails> getEmployee(@RequestParam(name = "department") String department
            , @RequestParam(name = "minSalery")int minsalary){
        List<EmployeeDetails> list=this.employessService.employess(department,minsalary);
        return list;
    }
    @PutMapping("/soft/{eid}")
    public String softDelet(@PathVariable int eid){
        int a=this.employessService.softDelet(eid);
        String responce="fail";
        if(a>0){
           responce="Success" ;
        }
        return responce;
    }
}
