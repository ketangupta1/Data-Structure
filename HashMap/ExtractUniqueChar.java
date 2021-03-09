import java.util.*;

public class ExtractUniqueChar {

	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

        char[] ch=str.toCharArray();
        str="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            if(map.containsKey(ch[i]));
            else
            {
                str+=ch[i];
                map.put(ch[i],1);
            }
        }
        
        return str;
	}
}
