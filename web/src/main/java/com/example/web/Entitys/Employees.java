package com.example.web.Entitys;
import jakarta.persistence.*;



import java.util.ArrayList;
import java.util.LinkedList;

import static java.lang.Integer.parseInt;


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "name")
public class Employees {
    //пустой конструктор


    //констуркторы


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private String secondname;
    @Column
    private String Work;
    @Column
    private String sex;
    @Column
    private String dateofbirth;
    @Column
    private String number;




    //геттеры и сеттеры

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getWork() {
        return Work;
    }

    public void setWork(String work) {
        Work = work;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public Employees(String name, String lastname, String secondname, String work, String sex, String dateofbirth, String number) {

        this.name = name;
        this.lastname = lastname;
        this.secondname = secondname;
        Work = work;
        this.sex = sex;
        this.dateofbirth = dateofbirth;
        this.number = number;

    }
    public Employees() {

    }
}