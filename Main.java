/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmodel;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;   
import static java.lang.System.*;

public class Main {
     
    public static void main  (String [] args)throws Exception {
        int [] w;
        double [] p;
        double [] q;
       /* Scanner in = new Scanner(System.in);
        out.println("Введите количество типов студентов");
        int N=in.nextInt();    // number of students     
       w=new int [N];
       p=new double [N];
       q=new double [N];
       out.println("Вводите w[i] p[i] q[i] (double - разделяя запятой)");
    for (int i=0;i<N;i++) { // arrays of parameters
        w[i]=in.nextInt();
        p[i]=in.nextDouble();
        q[i]=in.nextDouble();
    }
      */   // for enter via keyboard
   /*
      int N=3;
       w=new int []{3,4,7};
       p=new double []{0.5,0.3,0.2};
       q=new double []{0.9,0.8,0.7};
      Group first = new Group(N, p , q, w);  
        first.PrintGroup();
   */
        Student student = new Student(8,0.5,0.6); // w, p , q , i
        GSolver test;
        Task T = new Task (10,1,10);    // B,t1,t2   
        test = new GSolver(student,T); // Student and Task
        student.setLoad(60);             // Planned period
        ParametersSetter sf = new ParametersSetter (student,T); 
        sf.Compute();
    }
    }
