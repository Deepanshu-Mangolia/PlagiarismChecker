package Similarities;

public class CosineSimilarity extends Similarity {
    @Override
    public double FindSimilarity() {
        double sum = 0;
        double squareV1 = 0;
        double squareV2 = 0;
        double SquareRoot = 0;
        double CosO = 0;

        System.out.println("Cosine Similarity is Running");

        for (int i = 0; i < v1.size(); i++) {
            sum = (v1.get(i) * v2.get(i)) + sum;
        }
        for (int j = 0; j < v1.size(); j++) {
            squareV1 = v1.get(j) * v1.get(j) + squareV1;

        }
        for (int k = 0; k < v2.size(); k++) {
            squareV2 = v2.get(k) * v2.get(k) + squareV2;
        }
        SquareRoot = Math.sqrt(squareV1) * Math.sqrt(squareV2);
        CosO = sum/SquareRoot;

        return CosO;

    }
}