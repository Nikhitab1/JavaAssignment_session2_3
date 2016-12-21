
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   int row,col,size=5;
		   
		   for(row=0;row<size;row++){
			   for(col=0;col<size;col++){
				  if(row==0 && col==2|| row==1 && col==1 || row==1 && col==3 || row==2 && col==0 || row==2 && col==4 || row==3 && col==1 || row==3 && col==3 || row==4 && col==2)
				  {
					System.out.print("a");
					
				  
				  }else
			if(row==1 && col==2 || row==2 && col==1 || row==2 && col==3 || row==3 && col==2)
			{
				System.out.print("b");	  
					  
	       }else
	    	   if(row==2 && col==2){
	    		   System.out.print("c");
	    	   }else
	    	   {
	    		   System.out.print(" ");
	    	   }
			  
			   }
			   System.out.println();
		   }
		      
		   
	}

}
