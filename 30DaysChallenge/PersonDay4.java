package everyDayChallenge;

public class PersonDay4 {
int age;
public PersonDay4(int age) {
	super();
	if(age<=0){
	this.age = 0;
	System.out.println("Age is not valid");
	}
	else this.age=age;
}
public int yearPasses()
{
	return age++;
}
public String amIOld()
{
	return age<13?"young":(age >=13 && age <18)?"You are a teenager":"You are old";
}
}
