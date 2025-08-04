package ACCESS_MODIFIERS;

public class person {
    public static void main(String[] args) {
        //creating object for my data class
        data myobj=new data();
        myobj.Department="DOC";
      //  myobj.PersonId=1; //-> since Personid has a private Access modifier
        myobj.PhoneNo=89744889;
        myobj.name="sonam";

        System.out.println(myobj.name);
        // System.out.println(myobj.PersonId);
        System.out.println(myobj.PhoneNo);
        System.out.println(myobj.Department);

        //After using setter function
        

    }
    
}
