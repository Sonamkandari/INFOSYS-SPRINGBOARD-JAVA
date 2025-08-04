package ACCESS_MODIFIERS;

public class data {
   String name;
   String Department;
   //private access modifier we can not access the personId attribute out side this data class
    private int PersonId;
   int PhoneNo;
  // created a function through which we can use private access modifier variable
   public int getPersonId(){// getter
     return PersonId;
   }

   public void setPersonId(){
     
   }
    
}
