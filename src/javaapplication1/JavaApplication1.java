/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {
public static void main (String[] args){
Scanner user_input =new Scanner(System.in);

System.out.println ("Enter your usermname:");
String username, password;
username = user_input.next();
System.out.println ("Enter your password:") ;
password = user_input.next () ;
System.out.println ("Hello " + username+  "! Welcome to CSC200 class! and your password is:" + password);
}
}

