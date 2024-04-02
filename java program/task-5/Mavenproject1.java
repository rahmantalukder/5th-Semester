/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author DTI
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Rokon");
        name.add("Akash");
        name.add("Niloy");
        name.add("abc");
        System.out.println(name);
        System.out.println(name.get(2));
        System.out.println(name.set(3, "DEF"));
        System.out.println(name);
        name.remove(3);
        System.out.println(name);
        
        ArrayList<Student> stdDetails = new ArrayList<>();
        Student st = new Student("Mohamin", "017xxxxx", "Lalbag", 664153);
        Student st1 = new Student("Sharuk Khan", "017xxxxx", "Kolkata", 664253);
        stdDetails.add(st);
        stdDetails.add(st1);
        Student d = stdDetails.get(1);
        String det = d.name+","+d.phn+","+d.add+","+d.id;
        System.out.println(det);
        
        String path = "C:\\Users\\DTI\\Desktop\\Java"
                + "\\mavenproject1\\src\\main\\java\\com\\"
                + "example\\project\\stDetails.txt";
        
        
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write(det);
            bw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}
