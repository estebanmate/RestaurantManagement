package Entity;
// Generated Dec 14, 2017 4:30:01 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Branch generated by hbm2java
 */
public class Branch  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String address;
     private String phone;
     private String province;
     private Integer numTable;
     private Date createdAt;
     private int delFlag;

    public Branch() {
    }

	
    public Branch(String name, String address, String phone, String province, Date createdAt, int delFlag) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.province = province;
        this.createdAt = createdAt;
        this.delFlag = delFlag;
    }
    public Branch(String name, String address, String phone, String province, Integer numTable, Date createdAt, int delFlag) {
       this.name = name;
       this.address = address;
       this.phone = phone;
       this.province = province;
       this.numTable = numTable;
       this.createdAt = createdAt;
       this.delFlag = delFlag;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }
    public Integer getNumTable() {
        return this.numTable;
    }
    
    public void setNumTable(Integer numTable) {
        this.numTable = numTable;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public int getDelFlag() {
        return this.delFlag;
    }
    
    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }




}


