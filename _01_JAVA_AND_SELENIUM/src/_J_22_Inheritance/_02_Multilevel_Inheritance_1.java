package _J_22_Inheritance;

class One{                       // Super Class
void one() {
	System.out.println("one");
}}

class Two extends One{				// Sub Classes		
void two() {
	System.out.println("two");
}}

class Three extends Two{				// Sub Classes
void three() {
	System.out.println("Three");
}}

public class _02_Multilevel_Inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three Multi_1 = new Three();
		Multi_1.three();
		Multi_1.two();
		Multi_1.one();
		}}
