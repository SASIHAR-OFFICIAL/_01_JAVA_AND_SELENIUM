package _J_02_06_05_Method_Overloading_POLYMORPHISM;

class TestOverloading1 {  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  

class Adder {  
public static void main(String[] args){  
	
System.out.println(TestOverloading1.add(11,11));  
System.out.println(TestOverloading1.add(11,11,11));  
}}  
