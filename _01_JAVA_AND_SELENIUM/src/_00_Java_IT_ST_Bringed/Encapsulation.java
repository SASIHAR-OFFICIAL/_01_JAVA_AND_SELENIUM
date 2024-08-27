package _00_Java_IT_ST_Bringed;

public class Encapsulation {
	   private String name="Rijin";
	   private String idNum;
	   private int age;

	   public   int getAge() {
	      return age;
	   }

	   protected String getName() {
	      return name;
	   }

	    String getIdNum() {
	      return idNum;
	   }

	   public void setAge( int newAge) {
	      age = newAge;
	   }

	  /* public void setName(String newName) {
	      name = newName;
	   }*/

	   public  void setIdNum( String newId) {
	      idNum = newId;
	   }
	}
