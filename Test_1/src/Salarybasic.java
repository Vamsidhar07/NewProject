import java.util.*;
class Salarybasic
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		float ebasic = Float.parseFloat(s.nextLine());
        float etotal,hra,da;
		hra = ebasic*25/100;
		da =ebasic*15/100;
		etotal = ebasic+hra+da;
		System.out.println(etotal);
		float temp = etotal;
		if(temp>=10000&&temp<30000){
			etotal = etotal+ebasic*16/100;
		}
		if(temp>=30000&&temp<50000){
			etotal = etotal+ebasic*21/100;
		}
		if(temp>50000){
			etotal = etotal+ebasic*25/100;
		}
		System.out.println(etotal);
		s.close();
	}
}

