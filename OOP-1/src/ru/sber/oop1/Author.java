package ru.sber.oop1;



public class Author {
    private String name;
    private String gender;
    private String email;
    Author(String n, String g, String e){
        name = n;
        gender = g;
        email = e;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setGender(String g){
        this.gender = g;
    }
    public void setEmail(String e){
        this.email = e;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Author{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + ", email='" + email + '\'' + '}';
    }
}
