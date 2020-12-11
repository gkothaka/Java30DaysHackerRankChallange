package everyDayChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Phone a Friend -- Dictionaries and Maps
public class Day8 {
public static void main(String[] args) {
	Map<String, String> myPhone = new HashMap<String, String>();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter no of records");
    int n = in.nextInt();
    in.nextLine();
    for(int i=0;i<n;i++){
        String[] name = in.nextLine().split(" ");
        myPhone.put(name[0], name[1]);
    }
    while(in.hasNext()){
       String s = in.nextLine();
       if(myPhone.get(s)==null)
    	   System.out.println("Not found");
       else
    	   System.out.println(s+"="+myPhone.get(s));
    }
    in.close();
    }
}
