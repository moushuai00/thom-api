package com.thom.dto;

import com.thom.vo.RegisterVO;

import java.util.Date;

public class LuUser {
    public LuUser(){}

    public LuUser(RegisterVO registerVO) {
        this.account = registerVO.getAccount();
        this.name = registerVO.getName();
        this.email = registerVO.getEmail();
        this.password = registerVO.getPassword();
    }

    private Integer id;

    private String account;

    private String password;

    private String name;

    private String email;

    private Date createDate;

    private Integer isLockedOut;

    private Integer isHintEnabled;

    private Date lastLoginDate;

    private Integer incorrectLoginAttempt;

    private String realname;

    private String empId;

    private Integer mockNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getIsLockedOut() {
        return isLockedOut;
    }

    public void setIsLockedOut(Integer isLockedOut) {
        this.isLockedOut = isLockedOut;
    }

    public Integer getIsHintEnabled() {
        return isHintEnabled;
    }

    public void setIsHintEnabled(Integer isHintEnabled) {
        this.isHintEnabled = isHintEnabled;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Integer getIncorrectLoginAttempt() {
        return incorrectLoginAttempt;
    }

    public void setIncorrectLoginAttempt(Integer incorrectLoginAttempt) {
        this.incorrectLoginAttempt = incorrectLoginAttempt;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public Integer getMockNum() {
        return mockNum;
    }

    public void setMockNum(Integer mockNum) {
        this.mockNum = mockNum;
    }
}