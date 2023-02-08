package it.develhope.Enumerations;

public class User {
    private UserTypeEnum type;
    private String name;
    private String surname;
    private String username;

    public User(UserTypeEnum type, String name, String surname, String username) {
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.username = username;
    }

    public String getCompleteName(){
        return this.name + " " + this.surname + "(" + this.surname + ")";
    }

    public UserTypeEnum getType() {
        return type;
    }

    public void setType(UserTypeEnum type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
