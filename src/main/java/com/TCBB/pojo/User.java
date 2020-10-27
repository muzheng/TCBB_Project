package com.TCBB.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String sex;

    private Date birthday;

    private String password;

    private String phone;

    private String question;

    private String answer;

    private Integer role;

    private Integer usertatus;

    private Date createTime;

    private Date updateTime;

    public User(Integer id, String username, String sex, Date birthday, String password, String phone, String question, String answer, Integer role, Integer usertatus, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.password = password;
        this.phone = phone;
        this.question = question;
        this.answer = answer;
        this.role = role;
        this.usertatus = usertatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getUsertatus() {
        return usertatus;
    }

    public void setUsertatus(Integer usertatus) {
        this.usertatus = usertatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}