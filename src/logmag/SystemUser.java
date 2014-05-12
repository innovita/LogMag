/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logmag;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

/**
 *
 * @author lanfiamoussa
 */
@Entity
@Table(name="SYSTEMUSER")
public class SystemUser implements Serializable {
    
    @Id @GeneratedValue
    @Column(name="id")
    private int id;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="password")
    private String password;
    
    @Column(name="full_name")
    private String fullName;
    
    @Column(name="date_time_stamp")
    private Date dataTimeStamp;
    
    public SystemUser(){
        
    }
    
    public SystemUser(int id, String userName){
        this.id = id;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDataTimeStamp() {
        return dataTimeStamp;
    }

    public void setDataTimeStamp(Date dataTimeStamp) {
        this.dataTimeStamp = dataTimeStamp;
    }
    
}
