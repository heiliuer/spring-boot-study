/**
 * @package : com.vince.model
 * @date : 2015年1月20日
 * @author : vince
 * @version : 0.9
 */
package com.heiliuer.reservetion.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @describe :
 * :
 * @return :
 */
@Entity(name = "company")
public class Company {
    private int id;
    private String fax;
    private String location;
    private String name;
    private String phone;

    private Set<Department> departments = new HashSet<Department>();

    @Id
    @GeneratedValue
    @Column(name = "cId")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "cFax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Column(name = "cLocation")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name = "cName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "cPhone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @OneToMany(mappedBy = "company")
    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

}
