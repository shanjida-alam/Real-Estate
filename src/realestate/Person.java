/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestate;
import java.io.*;
/**
 *
 * @author Shanjida
 */
public class Person implements Serializable 
{
    private String name;
    private String email;
    private String password;
    private String address;
    private String gender;
    private String mobno;
    private int age;
    private LOGIN my_project;

    public Person(String name, String email, String password, String address, String gender, String mobno, int age, LOGIN my_project) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.gender = gender;
        this.mobno = mobno;
        this.age = age;
        this.my_project = my_project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LOGIN getMy_project() {
        return my_project;
    }

    public void setMy_project(LOGIN my_project) {
        this.my_project = my_project;
    }
    
}