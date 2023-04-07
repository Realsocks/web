package com.example.web.controllers;


import com.example.web.repos.EmployeeRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ListController {
    EmployeeRepo listrepo;

    public ListController(EmployeeRepo listrepo){
        this.listrepo = listrepo;

    }
    @PostMapping("/del")
    public String deleteById(@RequestParam int id, HttpServletRequest request){

        listrepo.deleteById(id);
        return "delete";



    }


}