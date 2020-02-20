package assignment2;

public class Tasks {
	
	public int[] makeMiddle(int[] arr) {
		
		int [] midArray = new int[2];
		
		//exit condition
		if (arr.length < 2) {
			return midArray;
		}
		
		//set new array data		
		if (arr.length >= 2) {
			for (int i = 0; i < 2; i++)
			midArray[0] =arr[( arr.length/2) -1];
			midArray[1] =arr[( arr.length/2)];
		}
		return midArray;			
	}
	
	public int[] fun(int[] arr) {
		
		int [] temp = new int[arr.length];
		
		//exit condition
		if (arr.length <= 1) {
			return arr;
		}
		
		//set new array data
		if (arr.length > 1) {
			
			for (int i = 0; i < arr.length - 1; i++) {
				temp[i] = arr[i + 1];
				temp[temp.length - 1] = arr[0];
			}			
		}
		return temp;			
	}
	
	public int[] middleWay(int[][] arr) {
		
		int [] temp = new int[2];
	
		temp[0] =arr[0][1];
		temp[1] =arr[1][1];		
		
		return temp;		
	}


}
