
package Model;

import java.io.Serializable;


public class Accounts implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String Username;
    private String password;
    private Department department;
    private Staff staff;

    public Accounts() {
    }

    public Accounts(Integer id) {
        this.id = id;
    }

    public Accounts(Integer id, String Username, String password, Department department, Staff staff) {
        this.id = id;
        this.Username = Username;
        this.password = password;
        this.department = department;
        this.staff = staff;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaff_id() {
        return Username;
    }

    public void setStaff_id(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    }
