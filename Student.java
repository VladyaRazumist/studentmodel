/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmodel;

/**
 *
 * @author леха
 */
public class Student {
    private final  int weight; // quantity of this type 
    private final int No;    // ordinal
    private final double p; // distraction probability
    private final double q; // discount coefficient
    private int [] load; 
    public Student (int weight,double p, double q,int i)
    {
       this.weight=weight;
       this.p=p;
       this.q=q;
       this.No=i;
       
    }
    public double getP() {
    
    return p;
    }
    public double getQ() {
    
    return q;
    }
    public double getWeight() {
    
    return weight;
    }
    public int getNum() {
        return No;
    }
    public void setLoad(int N) {      // same load for the group of students
    
        load = new int [N];
            for (int x=0;x<N;x++){
            load[x]=2; // random load from 1 to 4 for now
           
        } 
    }
    public int getLoad (int i) {
            return load[i];
        }
    public int getlenL() {
        return load.length;
    }
    
    }
