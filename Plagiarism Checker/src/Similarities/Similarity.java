package Similarities;

import java.util.ArrayList;

public abstract class Similarity implements ISimilarities {
    public ArrayList<Double> v1;
    public ArrayList<Double> v2;

    public abstract double FindSimilarity();
}
