
package Similarities;
import java.lang.module.FindException;
import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Which Similarity You Want ??");
        String s = sc.next();
        Similarity sim = SimilarityAdaptor.getSimilarity(s);



//        Similarity sm = new CosineSimilarity();
//        sm.v1 = Vector1;
//        sm.v2 = Vector2;
//        sm.FindSimilarity();
//        System.out.println(sm.FindSimilarity());


//        Similarity MD = new ManhattanDistance();
//        MD.v1 = Vector1;
//        MD.v2 = Vector2;
//        MD.FindSimilarity();
//        System.out.println(MD.FindSimilarity());

//        Similarity ED = new EuclideanDistance();
//        ED.v1 = Vector1;
//        ED.v2 = Vector2;
//        ED.FindSimilarity();
//        System.out.println(ED.FindSimilarity());

//        Similarity MKD = new MinkowskiDistance();
//        MKD.v1 = Vector1;
//        MKD.v2 = Vector2;
//        MKD.FindSimilarity();
//        System.out.println(MKD.FindSimilarity());

//        Similarity JS = new JaccardSimilarity();
//        JS.v1 = Vector1;
//        JS.v2 = Vector2;
        String inp = "/Users/deepanshu/IdeaProjects/Plagiarism Checker/src/Similarities/Input1.txt";
        String inp2 = "/Users/deepanshu/IdeaProjects/Plagiarism Checker/src/Similarities/Input 2.txt";
        Vectorizer vec = new Vectorizer();
        sim.v1 = new ArrayList<Double>();
        sim.v2 = new ArrayList<Double>();

        vec.Vectorize(inp,inp2,sim.v1,sim.v2);




        System.out.println(sim.FindSimilarity());

    }
}