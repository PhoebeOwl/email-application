package com.administration;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailAccount {
    private String firstname;
    private String lastname;
    private String department;
    private int capacity;
    private String password;
    private String companySuffix="google.com";
//    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//    static SecureRandom rnd = new SecureRandom();


    public EmailAccount(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
        this.department=setDepartment();
        this.password=getPassword(8);
        this.capacity=100;

    }
    public String setDepartment(){
        List<String> departmentChoice=new ArrayList<>();
        departmentChoice.add("sales");
        departmentChoice.add("development");
        departmentChoice.add("accounting");

        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("enter department: sales/development/accounting");
            String department= scanner.next();
            scanner.nextLine();
            if(departmentChoice.contains(department)){
                return department;
            }
            System.out.println("no such a department, try again");
        }

    }
    public void setPassword(String password){
        this.password= password;
    }
    public String getName(){
        return firstname+" " +lastname;
    }
    public int getCapacity(){return capacity;}
    public String getEmailAddress(){
        return firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
    }
//    private String generatePassword(int len){
//        StringBuilder sb = new StringBuilder( len);
//        for( int i = 0; i < len; i++ ){
//            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
//            // generate an integer between 0 to AB.length()
//        }
//        return sb.toString();
//
//    }
    private String getPassword(int len){
        String oriString= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder password =new StringBuilder(len);
        for(int i=0;i<len;i++){
            password.append(oriString.charAt((int)(Math.random()*oriString.length())));
        }
        return password.toString();
    }

    @Override
    public String toString() {
        return "Details of this Email account:\n" +
                "Your Email is:" +getEmailAddress()+"\n"+
                "capacity=" + capacity +"MB\n"+
                "password=" + password;
    }
}
