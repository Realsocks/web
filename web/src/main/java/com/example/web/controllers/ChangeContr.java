package com.example.web.controllers;


import com.example.web.Entitys.Employees;
import com.example.web.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeContr {
    @Autowired
    EmployeeRepo changeRepo;

    public ChangeContr(EmployeeRepo changeRepo){
        this.changeRepo = changeRepo;
    }


    @GetMapping("/change")
    public String changeEmployee(){
        return "change";
    }

    @PostMapping("/change")
    public String UpdateData(@RequestParam int id, @RequestParam String name,
                             @RequestParam String lastname,
                             @RequestParam String secondname,
                             @RequestParam String sex,
                             @RequestParam String dateofbirth,
                             @RequestParam String Work,
                             @RequestParam String number){


        Employees emp = changeRepo.findById(id).orElseThrow();
        emp.setName(name);
        emp.setLastname(lastname);
        emp.setSecondname(secondname);
        emp.setSex(sex);
        emp.setDateofbirth(dateofbirth);
        emp.setWork(Work);
        emp.setNumber(number);

        changeRepo.save(emp);

        return "index";

    }


}
