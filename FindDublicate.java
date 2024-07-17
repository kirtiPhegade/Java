package ArrayProgram;

public class FindDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{1,2,3,4,5,3,2,6,4,7,5};
		
		for(int i=0;i<array.length;i++)
		{ int count =0 ; 
			for(int j = i+1; j<array.length;j++) {
				if(array[i] == array[j]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(array[i]);
			}
		}

	}

}
/*
 * Output
2
3
4
5

*/
