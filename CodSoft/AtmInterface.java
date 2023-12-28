import java.util.*;
public class AtmInterface
{
	public static void main(String[] args) {
		int deposit,withdraw,balance=8000;
		Scanner sc=new Scanner(System.in);
		int pin=2410;
		System.out.println("Please enter your pin number: ");
		int pass=sc.nextInt();
		int t=1;
		if(pass!=pin)
		{
		    while(true)
		    {
		        t++;
		        System.out.println("Wrong pin Number!! ");
		        System.out.println("Please Re-entry your pin(Max.Attempts:-3)");
		        pass=sc.nextInt();
		        if(pass==pin)
		        break;
		        if(t==3)
		        {
		            System.out.println("You have exceeded your trials!! Please retry");
		            System.exit(0);
		        }
		    }
		}
		if(pass==pin)
		{
		    System.out.println(".......WELCOME......");
		    while(true)
		    {
		        System.out.println("1--->Balance amount");
		        System.out.println("2--->Withdraw money");
		        System.out.println("3-->Deposit money");
		        System.out.println("4-->Quit");
		        System.out.println("Enter your choice: ");
		        int c=sc.nextInt();
		        switch (c) {
		            case 1:
		                System.out.println("Your Balnce is: "+balance);
		                System.out.println("");
		                break;
		            case 2:
		                System.out.println("Enter amount you want to Withdraw: ");
		                withdraw=sc.nextInt();
		                if(withdraw>balance||balance==0)
		                {
		                    System.out.println("You have insufficient balance!! ");
		                    break;
		                }
		                System.out.println("Collect your money");
		                balance=balance-withdraw;
		                System.out.println("");
		                break;
		           case 3:
		               System.out.println("Enter money to be deposited: ");
		               deposit=sc.nextInt();
		               balance=balance+deposit;
		               System.out.println("Your Money has successfully deposited! ");
		               System.out.println(" ");
		               break;
		           case 4:
		               System.out.println("Thank you!");
		               System.exit(0);
		        }
		    }
		}
	}
}