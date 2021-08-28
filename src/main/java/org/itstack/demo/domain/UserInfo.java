package org.itstack.demo.domain;

public class UserInfo {
    private  String code;
    private  String info;
    private  String name;
    private int age;
    private  String address;

    public UserInfo(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address= address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
