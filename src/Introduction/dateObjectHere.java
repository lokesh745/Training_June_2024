package Introduction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.c2lbiz.symbiosys.systemcommon.util.DateUtil;

public class dateObjectHere {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		datePractice obj1 = new datePractice();
		
		System.out.print("Enter name: ");
		obj1.setName(sc.nextLine());
		
		System.out.print("Enter Date in format dd/mm/yyyy: ");
		String birthDt = sc.nextLine();
			
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
		Date date11 = formatter.parse(birthDt);
		obj1.setDob(date11);
		
		Date today = new Date();
		
		obj1.setAge(DateUtil.getAge(date11, today));
		
		
		System.out.println("Entered Name : " + obj1.getName() + "\n" + "Entered Date : " + obj1.getDob() + "\n" + "Age : " + obj1.getAge());
			
	}

}
