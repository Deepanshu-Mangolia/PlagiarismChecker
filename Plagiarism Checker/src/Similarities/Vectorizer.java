package Similarities;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Vectorizer {
    public  void Vectorize (String inp, String inp2, ArrayList<Double>vector1, ArrayList<Double>vector2){
        FileReader r;
        ArrayList<String> words1 = new ArrayList<>();
        ArrayList<String> words2 = new ArrayList<>();

            try {
                r = new FileReader(inp);
                BufferedReader br = new BufferedReader(r);
                String s = null;
                while((s=br.readLine())!=null)

                {

                    String[] d = s.split("[-';,.\\s*]");
                    for (int i = 0; i < d.length; i++){
                        if(d[i]!=""){
                            words1.add(d[i]);
                        }
                    }

                }
            }  catch (IOException e) {
                throw new RuntimeException(e);
            }

        for(int j = 0; j < words1.size(); j++ ){
            System.out.println(words1.get(j));
        }


        try {
            r = new FileReader(inp2);
            BufferedReader br = new BufferedReader(r);
            String s = null;
            while((s=br.readLine())!=null)

            {

                String[] d = s.split("[-';,.\\s*]");
                for (int i = 0; i < d.length; i++){
                    if(d[i]!=""){
                        words2.add(d[i]);
                    }
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        ArrayList<String> StopWords = new ArrayList<>();
        try {
            r = new FileReader("/Users/deepanshu/IdeaProjects/Plagiarism Checker/src/Similarities/StopWords.txt");
            BufferedReader br = new BufferedReader(r);
            String s = null;
            while((s=br.readLine())!=null)

            {

                StopWords.add(s);

            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }


        Map<String,Integer[]> hm = new HashMap<String,Integer[]>();
        for (int i=0; i<words1.size(); i++){
            if (words1.get(i).equalsIgnoreCase(" ") || StopWords.contains(words1.get(i).toLowerCase())){
                continue;
            }
            else{
                if (hm.containsKey(words1.get(i).toLowerCase())){
                    hm.get(words1.get(i).toLowerCase())[0]++;
                }
                else{
                    hm.put(words1.get(i).toLowerCase(), new Integer[]{0,0});
                    hm.get(words1.get(i).toLowerCase())[0]++;
                }
            }
        }
        for (int i=0; i<words2.size(); i++){
            if (words2.get(i).equalsIgnoreCase(" ") || StopWords.contains(words2.get(i).toLowerCase())){
                continue;
            }
            else{
                if (hm.containsKey(words2.get(i).toLowerCase())){
                    hm.get(words2.get(i).toLowerCase())[1]++;
                }
                else{
                    hm.put(words2.get(i).toLowerCase(), new Integer[]{0,0});
                    hm.get(words2.get(i).toLowerCase())[1]++;
                }
            }
        }
        for (Map.Entry<String,Integer[]> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue()[0] + " , " + entry.getValue()[1]);
            vector1.add((double)entry.getValue()[0]);
            vector2.add((double)entry.getValue()[1]);
        }


    }




}
