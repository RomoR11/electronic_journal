package com.company;

public class Elective extends School {
   public String AcademicSubject;
    public Leaner[] Learners;
    public Teacher ClassTeacher;

    public Elective(String A, Leaner[] L, Teacher T){
     AcademicSubject = A;
     Learners = L;
     ClassTeacher = T;
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
