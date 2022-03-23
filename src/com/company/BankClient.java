package com.company;

public class BankClient {
    public static int clientsNumber=0;
    public String name;
    public String address;
    public String phone;
    private String password;
    private String visaCode;
    private String visaNumber;

    BankClient(String name,String address, String phone, String password, String visaCode,String visaNumber){
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.password=password;
        this.visaCode=visaCode;
        this.visaNumber=visaNumber;

        clientsNumber++;

        System.out.println("CLients Number = "+clientsNumber);
    }

    public void login(String visaNumber,String password){
        if(visaNumber==this.visaNumber&&password==this.password){
            System.out.println("Logged in successfully!");
        }
        else{
            System.out.println("Invalid Visa Number or Password!");
        }
    }


    public void checkVisaCode(String viseCode){
        if(viseCode == this.visaCode){
            System.out.println("Account authenticated");
        }
        else{
            System.out.println("Invalid Visa Code");
        }
    }

//    public String getPassword(){
//        return this.password;
//    }
//
//    public void setPassword(String password){
//        this.password=password;
//    }

    public String getVisaNumber(){
        return "*****"+this.visaNumber.substring(this.visaNumber.length()-4,this.visaNumber.length());
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String passowrd){
        if(passowrd.length()>6) {
            this.password = passowrd;
        }
        else{
            System.out.println("Password can't be less than 6 numbers...");
        }
    }

//    int numerator;
//    private int dominator;
//
//    public void setDominator(int d){
//        if(d==0){
//            System.out.println("Dominator can't be zero!");
//        }else{
//            this.dominator=d;
//        }
//    }
//    int date;//Milli seconds since epoch
}
