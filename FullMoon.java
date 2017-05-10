
import java.util.Scanner;

public class FullMoon {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter date (1,2,3...,365): ");
		int date = input.nextInt();
		int no = 0;
		if(date<=31){
			no = date-31;
		}else if(date<=59){
			no = date-59;
			
		}else if(date<=90){
			no = date-90;
		}else if(date<=120){
			no = date-120;
		}else if(date<=151){
			no = date-151;
		}else if(date<=181){
			no = date-181;
		}else if(date<=212){
			no = date-212;
		}else if(date<=243){
			no = date-243;
		}else if(date<=273){
			no = date-273;
		}else if(date<=304){
			no = date-304;
		}else if(date<=334){
			no = date-334;
		}else if(date<=365){
			no = date-365;
		}
		
		System.out.println("No. of days remaining untill next full moon: "+Math.abs(no));
		

	}

}
