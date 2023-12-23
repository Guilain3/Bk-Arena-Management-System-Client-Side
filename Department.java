
package Model; 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Department implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer dep_id;
    private String dep_name;
    List<Accounts> account=new ArrayList<>();
    List< Staff> staffs=new ArrayList<>();

    public Department() {
    }

    public Department(Integer dep_id) {
        this.dep_id = dep_id;
    }

    public Department(Integer dep_id, String dep_name) {
        this.dep_id = dep_id;
        this.dep_name = dep_name;
    }

    public Integer getDep_id() {
        return dep_id;
    }

    public void setDep_id(Integer dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public List<Accounts> getAccount() {
        return account;
    }

    public void setAccount(List<Accounts> account) {
        this.account = account;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

    @Override
    public String toString() {
        return dep_name;
    }

          
    
}
