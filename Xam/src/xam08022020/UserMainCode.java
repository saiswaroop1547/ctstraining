package xam08022020;

import java.util.ArrayList;

public class UserMainCode 

{
		public static ArrayList<Integer> performSetOperations(ArrayList<Integer> ar1,ArrayList<Integer> ar2, char ch)
		{
		ArrayList<Integer> ar = new ArrayList<Integer>();
	    int i = 0;
	    switch (ch) 
	    {
	    	case '+':
	    		ar1.removeAll(ar2);
	    		ar1.addAll(ar2);
	    		ar = ar1;
	    		break;
	    	case '*':
	    		ar1.retainAll(ar2);
	    		ar = ar1;
	    		break;
	    	case '-':
	    		 for (int j = 0; j < ar1.size(); j++) 
	    	      {
	    	        i = 0;
	    	        for (int k = 0; k < ar2.size(); k++) 
	    	        {
	    	          if (ar1.get(j) == ar2.get(k))
	    	            i = 1;
	    	        }
	    	        if (i == 0)
	    	          ar.add(ar1.get(j));
	    	      }
	      break;
	    }
	    return ar;
		}
	}
