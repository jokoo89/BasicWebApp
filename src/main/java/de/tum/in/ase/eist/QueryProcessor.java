package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "konstantin";
        } /*else if (query.contains("plus")) {
            //query = "what is 9 plus 15"
            String[] wordList = query.split(" "); //nach jedem Leerzeichen werden die Strings separiert ->DAadruch
            int sum = 0;

            for (String word : wordList){
                try {
                    int intOfWord = Integer.parseInt(word);
                    sum += intOfWord;
                } catch(Exception e){
                    //
            }
                return String.valueOf(sum);*/
            } else if (query.contains("plus")) {
                String[] wordList = query.split(" ");
                String wordList1 = wordList[3];
                String wordList2 = wordList[5];
                return String.valueOf(Integer.parseInt(wordList1) + Integer.parseInt(wordList2));
            }
           // Integer.parseInt("myString 2");
            //query.length(); //für >10
            //String nine = query.substring(8, 1);
           // int result = Integer.parseInt(nine);
           // return String.valueOf(result);

        }
        return "";
    }
}
