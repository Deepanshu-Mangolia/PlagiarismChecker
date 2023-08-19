package Similarities;

import static java.lang.Math.abs;

public class ManhattanDistance extends Similarity {
    @Override
    public double FindSimilarity() {
        System.out.println("Manhattan Similarity is Running");

        double sum = 0;
        for (int i = 0; i < v1.size(); i++){
            sum = abs(v1.get(i) - v2.get(i)) + + sum;
        }
        return sum;
    }
}
