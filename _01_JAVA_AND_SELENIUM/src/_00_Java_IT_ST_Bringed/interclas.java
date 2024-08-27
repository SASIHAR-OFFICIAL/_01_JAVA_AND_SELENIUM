package _00_Java_IT_ST_Bringed;
//                         IMPLEMENTS FOR MULTIPLE INHERITANCE
interface Print{
	void Print();
	//void display1();

	}
interface Showable{  
	void show();  
}  

 class interclas implements Print, Showable {

	public void print(){
		int a=20,b=10,c;
		c=a+b;
		System.out.println(c);
	} 

	public void show(){
		int a=10,b=20,c;
		c=a-b;
		System.out.println(c);} 


	public void display1(){
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);} 

	public static void main(String args[]){  
		interclas obj = new interclas(); 
		//Print obj1 = new Print(); //Object creation not possible in interface name
		obj.Print();
		obj.show();
		obj.display1();
	}

	@Override
	public void Print() {
		// TODO Auto-generated method stub
		
	}
	}