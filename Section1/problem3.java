//Solved Problem 3 on Interview Bit and pasted same code here there is no main method here. Use this code on Interview Bit Editor 

public class Solution 
{
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) 
    {

        ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
        HashMap<String, ArrayList<Integer>> hmap = new HashMap<String, ArrayList<Integer>>();
        for(int i = 0; i < A.size(); i++)
        {
            char ch[] = A.get(i).toCharArray();
            Arrays.sort(ch);
            String str = String.valueOf(ch);
            if(hmap.get(str) == null)
            {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i+1);
                hmap.put(str,list);
            }
            else    { hmap.get(str).add(i+1); }
        }
        
        
        for(ArrayList<Integer> list : hmap.values())
        {
           
                answer.add(list);
          
        }
        
        return answer;
    }
}
