package assignment2;

import assignment2.Tasks;

public class RunApp {

	public static void main(String[] args) {
		//initiate class
		Tasks task =  new Tasks();
				
		//arrays for testing
		int[] array = new int[] { 1,2,3,4,5,6,7,8};
		int[] array2 = new int[] { 1,2};
		
		int[][] array3 = new int[][] {{ 1,2,3},{ 4,5,6}};

		
		int[] output = task.middleWay(array3);
		

		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + "  ");
		}

	}

}
