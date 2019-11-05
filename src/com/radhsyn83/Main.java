package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human human = new Human();
        human.setNama("Rizky Adam");

        human.walk(human.getNama());
        human.Breath(human.getNama());
        human.eat(human.getNama());
    }
}
