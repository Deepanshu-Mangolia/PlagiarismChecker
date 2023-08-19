package Similarities;
public class SimilarityAdaptor {
    public static Similarity getSimilarity(String SimilarityType) {

        if (SimilarityType.equals("Cosine")) {
            return new CosineSimilarity();
        }

        else if (SimilarityType.equals("Euclidean")) {
            return new EuclideanDistance();
        }

        else if (SimilarityType.equals("Jaccard")) {
            return new JaccardSimilarity();
        }

        else if (SimilarityType.equals("Manhattan")) {
            return new ManhattanDistance();
        }

        else if (SimilarityType.equals("Minkowski")) {
            return new MinkowskiDistance();
        }


        return new CosineSimilarity();
    }
}