package com.company;

public class Class {
    public String Number;
    public Teacher ClassTeacher;
    public Leaner[] Learners;

    public Class(String N, Teacher C, Leaner[] L){
        Learners = L;
        ClassTeacher = C;
        Number = N;
    }

    public void getList(){
        for (Leaner l : Learners) {
            System.out.println(l.FullName);
        }
     }
    public void getListParents(){
        for (Leaner p : Learners) {
            System.out.println(p.Parents);
        }
    }
}