/*java regex
* INSTRUCTIONS for creating an account
* phno.:must contain only numerical values and should be only 10 characters of length
* Gmail:must include @domain.com    (domain viz. gmail.com/Yahoo.com/Firefox.com/outlook.com etc..)
* Username:special symbols and blank spaces not allowed;only alphanumeric characters allowed
* password:must be atleast 8 characters
* */

import java.util.Scanner;
public class Experiment8_Regex{
	public static void main(String args[]){
	    int flag=0;
	    Scanner sc=new Scanner(System.in);
		String mail,uname,pwd,phno;
		System.out.println("Enter username(Special symbols not allowed):");
		uname=sc.nextLine();
		if(!uname.matches("[a-zA-Z0-9]+")){
            System.out.println("invalid username");
            flag+=1;
        }
		if(flag==0){
            System.out.println("Enter your email(include @domain.com at the end): ");
            mail=sc.nextLine();
            if(!mail.matches("[a-zA-Z0-9_.]+@[a-zA-Z]+.com")){
                System.out.println("invalid mail");
                flag+=1;
            }
        }
		if(flag==0){
            System.out.println("Enter valid mobile number:");
            phno=sc.nextLine();
            if(!phno.matches("[0-9]{10}")){
                System.out.println("invalid mobile number");
                flag+=1;
            }
        }
		if(flag==0){
            System.out.println("Enter your password:");
            pwd=sc.nextLine();
            if(pwd.length()<8){
                System.out.println("invalid password...need more than 8 characters!!" );
            }
            else{
                System.out.println("confirm your password:");
                String newpwd=sc.nextLine();
                while(!newpwd.equals(pwd)){
                    System.out.println("password not matched...tryagain!!\nconfirm your password:");
                    newpwd=sc.nextLine();
                }
                System.out.println("Your account is created successfully!!");
            }
        }


	}
}
