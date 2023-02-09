package assignment_1;

import org.json.JSONObject;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 Create a program which will take input from users for registration and save the info to a json file.
 The system will require following user info:
Full Name, email, password, address, mobile no
 */
public class Task6 {
    public static void saveToJSON(String fullName, String email, String password, String address, String phone){
        String path = "/home/akash/JavaAssignment/src/main/resources/info.json";
        JSONObject  json = new JSONObject();
        try {
            json.put("fullName", fullName);
            json.put("email", email);
            json.put("password", password);
            json.put("address", address);
            json.put("phone", phone);

        } catch (Exception e) {
            e.getMessage();
        }

        try {
            FileWriter file = new FileWriter(path);
            file.write(json.toString());
            file.flush();
            System.out.println("Successfully Saved to a JSON file");
            System.out.println("\nInfo : "+json);

        }catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name : ");
        String fullName = sc.nextLine();

        System.out.print("Enter email : ");
        String email = sc.nextLine();

        System.out.print("Enter password : ");
        String password = sc.nextLine();

        System.out.print("Enter address : ");
        String address = sc.nextLine();

        System.out.print("Enter mobile number : ");
        String phone = sc.nextLine();

        saveToJSON(fullName, email, password, address, phone);
    }
}
