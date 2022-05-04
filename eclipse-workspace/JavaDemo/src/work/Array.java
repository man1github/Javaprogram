package work;

public class Array {

	public static void main(String[] args) {
	
	//	class - 25/3/22************
	/*	
	// 	int[] array = {1,2,3,4,5,6};
		int[] array = new int[5];
		array[0] = 5;
		array[1] = 6;
		array[2] = 7;
		array[3] = 8;
		array[4] = 3;
		
	// METHOD 1	
		for(int j=0; j<array.length; j++) {
			System.out.println(array[j]);
		}*
		System.out.println("###############################");
		
	// METHOD 2	(important)
		for(int x : array) {
			System.out.println(x);
		}
		System.out.println("###############################");	
		String[] name = new String[5];
		name[0] = "manoj";
		name[1] = "naveen";
		name[2] = "oxford";
		name[3] = "peacock";
		name[4] = "queen";
		
	    for(String y : name) {
	    	System.out.println(y);
	    }
	    
		System.out.println("###############################"); 
		 
    	// int[][] multiarray = {{5,6},{3,4}};
    */    // int[][] multiarray = {{1,2,3},{4,5,6},{7,8,9}};	   
	    int[][] multiarray = new int[2][3];
	    int[][] multiarray1 = new int[2][3];
	    multiarray[0][0] = 1;
	    multiarray[0][1] = 1;
	    multiarray[0][2] = 1;
	    multiarray[1][2] = 2;
	    multiarray[1][0] = 3;
	    multiarray[1][1] = 4;
	    multiarray1[0][0] = 1;
	    multiarray1[0][1] = 1;
	    multiarray1[0][2] = 1;
	    multiarray1[1][2] = 2;
	    multiarray1[1][0] = 3;
	    multiarray1[1][1] = 4;
	    
	    for (int[] singlearray : multiarray) {
	    	for (int g : singlearray) {
		    	System.out.print(g +" ");
	    	}
	    	System.out.println(" ");
	    }
	    for (int[] singlearray1 : multiarray1) {
	    	for (int g1 : singlearray1) {
		    	System.out.print(g1 +" ");
	    	}
	    	System.out.println(" ");
	    }	
		
	}

}
