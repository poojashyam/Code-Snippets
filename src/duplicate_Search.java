import java.util.*;

public class duplicate_Search {
	int[] array1= new int[10];
	public void input(){
		System.out.println("Enter an array of numbers");
		Scanner scr = new Scanner(System.in);
		int  i =0;
		while(scr.hasNextInt()){
			array1[i] = scr.nextInt();
			i++;
			if(i ==10){
				break;}
			
		}
		for(int j= 0; j <10; j++){
			System.out.println(array1[j]);
		}
		sort(array1);
		
	}
	public void sort(int[] arrayp){
		System.out.println(arrayp[3]);
		
	}
	public static void main (String args[]){
		duplicate_Search ds = new duplicate_Search();
		ds.input();	
		
	}

}
