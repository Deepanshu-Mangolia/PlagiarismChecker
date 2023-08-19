package Similarities;

public class JaccardSimilarity extends Similarity {
    @Override
    public double FindSimilarity() {
        System.out.println("Jaccard Similarity is Running");

        double count = 0;
        for (int i=0; i <v1.size(); i++){
            if (v1.get(i) >= 1 && v2.get(i) >= 1) {
                count++;
            }
        }
        double TotalElement = v1.size()*2 - count;
        double Jaccard = count/TotalElement;

        return Jaccard;
    }
}
