public class Pattern{	

public static void main(String[] args) {
		
		
		int i, j;		
		
		//logic for pattern
	    for (i = 1; i <= 5; i++)		
	    {
	        
	        for (j = 1; j <= 5; j++)		
	        {
	            if (i>=1&&i<=5&&j==1||i==6-1&&j>1)
	                System.out.printf("*");		
	            else
	                System.out.printf(" ");		
	        }
	        
	        
	        
	        System.out.printf("\n");	
	    }

	  
	}

}
