package com.example.tennis_vital_fuse;
/*
public class ModelUsers {
    String name,email,search,phone,image,cover,uidm;

    public ModelUsers() {
    }

    public ModelUsers(String name, String email, String search, String phone, String image, String cover,String uid ) {
        this.name=name;
        this.email=email;
        this.search=search;
        this.phone=phone;
        this.image=image;
        this.cover=cover;
        this.uidm=uidm;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getUid() {
        return uidm;
    }

    public void setUid(String uidm) {
        this.cover = uidm;
    }

}
*/

public class ModelUsers {
    String fullName;
    String age;
    String email;
    String image;
    String uid;

    public ModelUsers() {
    }

    String onlineStatus;
    String typingTo;

    public String getAge() {
        return age;
    }

    public void setAge(String name) {
        this.age = age;
    }
    public String getName() {
        return fullName;
    }

    public void setName(String name) {
        this.fullName = fullName;
    }

    public String getTypingTo() {
        return typingTo;
    }

    public void setTypingTo(String typingTo) {
        this.typingTo = typingTo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ModelUsers(String name, String onlineStatus, String typingTo, String email, String image, String uid, String age) {
        this.fullName = name;
        this.onlineStatus = onlineStatus;
        this.typingTo = typingTo;
        this.email = email;
        this.image = image;
        this.uid = uid;
        this.age=age;
    }
}
