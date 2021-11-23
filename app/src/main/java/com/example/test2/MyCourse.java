package com.example.test2;

public class MyCourse {
    String id;
    String phone;
    public MyCourse(String id, String phone) {
        this.id = id;
        this.phone = phone;
    }

    public MyCourse() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
