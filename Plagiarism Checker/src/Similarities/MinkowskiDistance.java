package Similarities;


import java.util.Scanner;

import static java.lang.Math.abs;

public class MinkowskiDistance extends Similarity {
    Scanner sc = new Scanner(System.in);
    double p = sc.nextInt();
    @Override
    public double FindSimilarity() {
        System.out.println("Minkowski Similarity is Running");

        double sum = 0;
        for (int i= 0; i <v1.size(); i++){
            sum = Math.pow(abs(v1.get(i) - v2.get(i)), p)+ sum;
        }
        double Minkowski = Math.pow(sum, 1 /p);
        return Minkowski;
    }
}
