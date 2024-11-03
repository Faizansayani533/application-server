package com.example.FaizanSayaniProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "student")
public class Student {

    @Id
    private String _id;
    private String studentname;
    private String studentaddress;
    private String mobile;


    public Student(String mobile, String studentaddress, String studentname, String _id) {
        this.mobile = mobile;
        this.studentaddress = studentaddress;
        this.studentname = studentname;
        this._id = _id;
    }

    public Student() {
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "_id='" + _id + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

