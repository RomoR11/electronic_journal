package com.company;

public class Participant extends Person {
   public int CardID;

   public Participant(int C, String F, int P){
      super(F, P);
      CardID = C;
   }

}
