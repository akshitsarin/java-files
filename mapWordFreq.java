// find frequency of each word in a sentence
import java.util.*;
class mapWordFreq 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String a[] = s.split(" "); // split at single " "
	String a[] = s.split("\\s+"); // split at any whitespace
        Map<String, Integer> words = new HashMap<>();
        for (String str : a)
        {
            if (words.containsKey(str))
                words.put(str, 1 + words.get(str));
            else
                words.put(str, 1);
        }
        System.out.println(words);
    }
}
//
