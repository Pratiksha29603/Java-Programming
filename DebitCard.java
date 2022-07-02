public class  Card    
{
    public static void RequestCard()    
    {
        System.out.println("Request Logged");  
    }
}
public class DebitCard extends Card   
 {
    public DebitCard()  
    {
        System.out.println("Debit Card");
		Card.RequestCard() ; 
    }
    public static void Main()
    {
        DebitCard debitCardObj = new DebitCard(); 
    }
}