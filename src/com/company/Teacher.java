package com.company;

public class Teacher extends Participant {
    public String Position;
    public String Qualification;

    public Teacher(String P1, String Q, int C,int P, String F ){
        super(C, F, P);
        Position = P1;
        Qualification = Q;
    }

}
