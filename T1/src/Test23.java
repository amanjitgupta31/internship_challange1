

import java.io.BufferedReader;
import java.io.FileReader;


public class Test23 {
	
	 
	
	 static void permute(String str[], int l, int r) 
	    { 
		 
		 String temp;
	        if (l == r) 
	        {    for(String s:str)
	        	System.out.println(s);
		 System.out.println();
	        }
	        else
	        { 
	            for (int i = l; i <= r; i++) 
	            { 
	                
	                temp = str[i] ; 
	                str[i] = str[l]; 
	                str[l] = temp; 
	                permute(str, l+1, r); 
	                temp = str[i] ; 
	                str[i] = str[l]; 
	                str[l] = temp; 
	            } 
	        } 
	    } 
	 
	 public static void main(String[] args) throws Exception  
		{
			String splitBy = ", ";  
			BufferedReader br = new BufferedReader(new FileReader(args[0]));  
				  
			String str[] = br.readLine().split(splitBy);  
			 
	        int n = str.length; 
	        
	        for(String s:str)
	        	System.out.println(s);
	        permute(str, 0, n-1); 
	        br.close();
	    } 
}



