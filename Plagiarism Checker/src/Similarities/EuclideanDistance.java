package Similarities;

import static java.lang.Math.abs;

public class EuclideanDistance extends Similarity{


    @Override

    public double FindSimilarity() {
        System.out.println("Euclidean Similarity is Running");

        double sum = 0;
        double SquareRoot = 0;
        for (int i=0; i<v1.size(); i++){
            sum = ((v1.get(i) - v2.get(i)) * (v1.get(i) - v2.get(i)))  + sum;
        }
        SquareRoot = Math.sqrt(sum);

        return SquareRoot;
    }
}
