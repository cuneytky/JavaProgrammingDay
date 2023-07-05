package day35_Encapsulation.Taskss;

public class Credentials {
    private String userName;
    private String password;

    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        if(! isStrongPassWord(password) ){
            System.err.println("password is not strong.");
            return;
        }
        this.password = password;
    }

    public boolean isStrongPassWord(String password){
        boolean letter=false, specialchr=false,digit=false;
        boolean longerSpace =password.length()>=8 && !password.contains(" ");

        for (char ch : password.toCharArray()) {

            if( Character.isDigit(ch)){
                 digit= true;
            }else if ( Character.isLetter(ch)) {
                letter =true;
            }else{
                specialchr=true;
            }
        }
        return longerSpace && letter && specialchr && digit ;
    }


    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
/*
2. create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

 */