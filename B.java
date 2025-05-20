package bpack;

import apack.A;

public class B extends A {
    public void display() {
        System.out.println("Class B accessing variables from A:");
        // System.out.println("Default: " + defaultVar); // Not accessible
        System.out.println("Protected: " + protectedVar); // Accessible
        // System.out.println("Private: " + privateVar); // Not accessible
        System.out.println("Public: " + publicVar); // Accessible
    }
}
