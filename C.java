package cpack;

import apack.A;

public class C {
    public void display() {
        A a = new A();
        System.out.println("Class C accessing variables from A:");
        // System.out.println("Default: " + a.defaultVar); // Not accessible
        // System.out.println("Protected: " + a.protectedVar); // Not accessible
        // System.out.println("Private: " + a.privateVar); // Not accessible
        System.out.println("Public: " + a.publicVar); // Accessible
    }
}

