package com.mycompany.springboot.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "tb_emp", catalog = "company", schema = "")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "TbEmp.findAll", query = "SELECT t FROM TbEmp t"),
//    @NamedQuery(name = "TbEmp.findById", query = "SELECT t FROM TbEmp t WHERE t.id = :id"),
//    @NamedQuery(name = "TbEmp.findByName", query = "SELECT t FROM TbEmp t WHERE t.name = :name"),
//    @NamedQuery(name = "TbEmp.findByGender", query = "SELECT t FROM TbEmp t WHERE t.gender = :gender"),
//    @NamedQuery(name = "TbEmp.findByDepartment", query = "SELECT t FROM TbEmp t WHERE t.department = :department"),
//    @NamedQuery(name = "TbEmp.findByDob", query = "SELECT t FROM TbEmp t WHERE t.dob = :dob")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Column(length = 255)
    private String name;
    @Column(length = 255)
    private String gender;
    @Column(length = 255)
    private String department;
    @Temporal(TemporalType.DATE)
    private Date dob;

    public Employee() {
    }

    public Employee(Integer id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", department=").append(department);
        sb.append(", dob=").append(dob);
        sb.append('}');
        return sb.toString();
    }

    

}
