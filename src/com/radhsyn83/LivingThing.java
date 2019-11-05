package com.radhsyn83;

public abstract class LivingThing {
    public abstract void walk(String nama);

    public void Breath(String nama){
        System.out.println(nama + " Bernafas ");
    }
    public void eat(String nama){
        System.out.println(nama + " Makan ");
    }
}