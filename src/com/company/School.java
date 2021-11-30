package com.company;

public class School {
    public Employee[] Employees;
    public Teacher[] Teachers;
    public Leaner[] Learners;
    public String Address;
    public String Name;
    public Class[] Classes;
    public Elective[] Electives;
    public Section[] Sections;

    public School(Employee[] E, Teacher[] T, Leaner[] L, String A, String N, Class[] C, Elective[] E1, Section[] S){
        Employees = E;
        Teachers = T;
        Learners = L;
        Address = A;
        Name = N;
        Classes = C;
        Electives = E1;
        Sections = S;
    }

    public void getListTeachers() {
        for (Teacher t : Teachers) {
            System.out.println(t.FullName);
        }
    }

    public void getListEmployers() {
        for (Employee e : Employees) {
            System.out.println(e.FullName);
            System.out.println(e.Position);
        }
    }

    public void getListLearners() {
        for (Leaner l : Learners) {
            System.out.println(l.FullName);
            System.out.println(l.Parents);
        }
    }

    public void getElectronicJournal() {

    }

    public Participant getParticipants(int ID) {
        for (Participant e : Employees) {
            if (e.CardID == ID) {
                System.out.println(e.FullName);
                return e;
            }
        }
        for (Participant l : Learners) {
            if (l.CardID == ID) {
                    System.out.println(l.FullName);
                    return l;
                }
            }
        for (Teacher t : Teachers) {
            if (t.CardID == ID) {
                System.out.println(t.FullName);
                return t;
            }
        }
            System.out.println("Ничего не найдено");
            return null;
    }
}
