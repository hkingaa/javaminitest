package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NewtonTelescope telescope1 = new NewtonTelescope(300, 20, 17);
        System.out.println(telescope1);
        RefactorTelescope telescope2 = new RefactorTelescope(500,18,5);
        System.out.println(telescope2);
    }
}
