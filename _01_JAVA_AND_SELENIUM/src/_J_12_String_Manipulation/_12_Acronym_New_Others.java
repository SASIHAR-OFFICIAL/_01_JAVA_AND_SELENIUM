package _J_12_String_Manipulation;

class _12_Acronym_New_Others {
static void acronym(String name){
if(name.length()==0)	
	return;
System.out.println(Character.toUpperCase(name.charAt(0)));
for(int i=1;i<name.length()-1;i++)
	if(name.charAt(i)==' ')
		System.out.println(""+Character.toUpperCase(name.charAt(i+1)));
}
}
