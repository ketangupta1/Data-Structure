public static ArrayList<Integer> removeDuplicates(int a[])
{
  ArrayList<Integer> output=new ArrayList<>();
  HashMap<Integer,Boolean> seen=new HashMap<>();
  for(int i=0;i<a.length;i++
      {
        if(seen.containsKey(a[i])){
          continue;
        }
        output.add(a[i]);
        seen.put(a[i],true);
      }
      return output;
 }
