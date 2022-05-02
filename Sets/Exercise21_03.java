import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;
import java.io.File;
import java.util.Arrays;
public class Exercise21_03 {
    public static void main(String args[]){
        String filename = args[0];

        // Step 1: read the file.
        File file = new File(filename);
        if(file.exists()){
            try {
                System.out.println("The number of keywords in "+ filename + " is "+ countKeywords(file));
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }
        else {
            System.out.println("File "+ filename + " does not exist");
        }
    }

    public static int countKeywords(File file) throws Exception {
        // Array of all Java keywords + true, ffalse and null
        String[] keywordString = {"abstract", "assert", "boolean","break","byte","case","catch","char","class","const","continue","default","do","double","else","enum","extends","for","final","finally","float","goto","if","implements","import","instanceof","int","interface","long","native","new","package","private","protected","public","return","short","static","strictfp","super","switch","synhronized","this","throw","throws","transient","try","void","volatile","while","true","false","null"};

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while((st = br.readLine()) != null){
            String[] words = st.split(" ");
            if(Arrays.asList(words).contains("//"))
                continue;
            for(String word : words)
                if(keywordSet.contains(word))
                    count++;
        }
        return count;
    }
    
}
