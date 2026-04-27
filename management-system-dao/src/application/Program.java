package application;

import model.entities.Department;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Department dp = new Department("Joao", 1213);
        System.out.println(dp);

        sc.close();
    }
}
