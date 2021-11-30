package com.company;

public class Leaner extends Participant {
    public Parent[] Parents;

    public Leaner( int C,int P, String F, Parent[] P1 ){
        super(C, F, P);
        Parents = P1;

    }
}
