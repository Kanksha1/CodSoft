import java.util.*;
 public class NumberGuessing { 
public static void main(String[] args) {
 Game g=new Game();
 boolean flag=true; 
int n; 
while(flag) {
 n=g.UserInput(); 
boolean b=g.isCorrect(n);
 if(b) { 
System.out.println("Guessed is");
 g.getNumberOfGuesses(); 
System.out.println("Guesses"); 
System.out.println(); 
flag=false; 
break; 
}
 else 
flag=true; 
} } } 
class Game {
 public int cn;
 public int count=0;
 Scanner sc=new Scanner(System.in); 
Random r=new Random(); 
public Game(){ 
cn=r.nextInt(101);
 } 
public int UserInput() { 
System.out.println("Guess the number(1-100):"); 
int un=sc.nextInt(); 
return un;
 } 
public boolean isCorrect(int n) { 
int f=0; 
if(n<=100&&n>=0) { 
setNumberOfGuesses(); 
if(n==cn) {
 System.out.println("You guessed is right.The number is "+n);
 f=1; } 
else if(n<cn) 
System.out.println("Your number is less than actual number");
 else if(n>cn) 
System.out.println("Your number is greater than the actual number"); }
 else 
System.out.println("Please enter in range 0-100"); 
if(f==1) 
return true; 
return false; 
} 
public void setNumberOfGuesses(){ 
count++; 
}
 public void getNumberOfGuesses(){ 
System.out.print(count);
 }

}