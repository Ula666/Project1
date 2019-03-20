
/**
 * This class represents Checking Account, and extends Bank Account class.
 * For the purpose of this Class a Checking Account has one
 * attribute to hold the fee.
 * 
 * @author Ula Ziolko
 * 
 * @version (Task 2)
 */
public class CheckingAccount extends bankAccount implements BankInterface,
 CustomerNameInterface
{
    private double fee;

   /**
     * Constructor method
     * In this method the fee is set to zero (default)
     * 
     */ 
   public CheckingAccount(){
        fee = 0;
 
    }
   /** 
     * Constructor method to extend attributes from bankAccount class
     * (account number, customer name, current balance) and set
     * the fee
     * 
     * @param feeIn   the fee for checking account(double)
     */
   public CheckingAccount( int accountNoIn, String NameIn,
                       double currentBalanceIn, double feeIn)
             {
          //Call constructor method from supercalss
          super (accountNoIn, NameIn, currentBalanceIn);

          fee = feeIn;        
          //Set the new balanace
          setCurrentBalance ( getCurrentBalance() - fee );
          
      }

   /** 
    * This method allows to deduct fee at any time 
    * and update the new balance
    */
     public void deductFee(double feeIn)
       {          
        setCurrentBalance ( getCurrentBalance() - feeIn );
       }
} //End class