//Solved Problem 1 in Interview Bit pasted same code here.No main Method

public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) 
    {
        Collections.sort(A);
        int min_sum = Integer.MAX_VALUE;
        int answer = 0;
        for (int i=0;i<A.size();i++) 
        {
            int j=i+1;
            int k=A.size()-1;
            while (j<k) 
            {
                int sum = A.get(i)+A.get(j)+A.get(k);
                int diff = Math.abs(sum-B);
                if(diff == 0) {return sum;}
                if (diff<min_sum) 
                {
                    min_sum = diff;
                    answer = sum;
                 }
                if (sum <= B) { j++ ; } 
                else { k-- ; }
            }
        }
 
             return answer;
    }
}
