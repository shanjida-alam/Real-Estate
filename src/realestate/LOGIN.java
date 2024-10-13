/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package realestate;
import java.io.*;
/**
 *
 * @author Shanjida
 */
public class LOGIN implements Serializable
{
    private String user;
    private String pass;

    public LOGIN(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    public boolean equals(LOGIN my_project)
    {
        return (this.user==my_project.user && this.pass.equals(my_project.pass));
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
