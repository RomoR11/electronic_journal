package com.company;

public class Section {
   public String Name;
    public Leaner[] Learners;
    public Teacher ClassTeacher;

    public Section(String N, Leaner[] L, Teacher C){
     Name = N;
     Learners = L;
     ClassTeacher = C;
    }

    public void getList(){
     for (Leaner l : Learners) {
      System.out.println(l.FullName);
     }
    }
 public void getListParents() {
  for (Leaner p : Learners) {
   System.out.println(p.Parents);
  }
 }
}
