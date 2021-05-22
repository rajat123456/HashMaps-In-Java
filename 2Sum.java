// Problem: Program which prints all pairs of numbers which sum to target

/*
  Time Complexity = Space Complexity = O(N)
*/


import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int[]arr=new int[m];

        for(int q=0;q<m;q++)
        {
            arr[q]=sc.nextInt();
        }

        int tar=sc.nextInt();

        HashMap<Integer, Integer>map=new HashMap<>();

        for(int q=0;q<arr.length;q++)
        {
            if(map.containsKey(arr[q]))
            {
                int val=map.get(arr[q]);
                map.put(arr[q],val+1);
            }

            else
            map.put(arr[q],1);
        }

        for(int x=0;x<arr.length;x++)
        {
            int req=Math.abs(tar-arr[x]);

            if(map.containsKey(req))
            {
                int val=map.get(req);

                if(val==1)
                map.remove(arr[x]);

                else
                map.put(arr[x],val-1);


                if(req!=arr[x])

                for(int v=1;v<=val;v++)
                {
                    if(arr[x]<=req)
                    System.out.println(arr[x]+" and "+req);

                    else
                    System.out.println(req+" and "+arr[x]);
                }

                else
                for(int v=1;v<=val-1;v++)
                {
                    if(arr[x]<=req)
                    System.out.println(arr[x]+" and "+req);

                    else
                    System.out.println(req+" and "+arr[x]);
                }
            }

        }

    }
}
