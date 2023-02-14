package it.develhope.Exceptions;

public class User {
    public String name;
    public String surname;
    public String username;
    public int age=0;

    public void setAge(int age) throws Exception {
        if (age < 0) {
            throw new AgeException(age);
        }
        if (age==0){
            throw new ZeroAgeException(age);
        }
        this.age = age;
    }

    public void validateData() throws NullPointerException,AgeException {
        //quando un metodo solleva un eccezione, si ferma.(blocca)
        if (name==null) throw new NullPointerException("name is null");
        if (surname==null) throw new NullPointerException("surname is null");
        if (username==null) throw new NullPointerException("username is null");
        if (age<0) throw new AgeException(this.age);
    }
}
