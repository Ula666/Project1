
/**
 * This class represents Saving Account, and extends Bank Account class.
 * For the purpose of this Class a Saving Account has one
 * attribute to hold the interest rate.
 * 
 * @author Ula Ziolko
 * 
 * @version (Task 2)
 */
public class savingAccount extends bankAccount implements BankInterface,
 CustomerNameInterface
{
    private double interestRate;
    
     /**
     * Constructor method
     * In this method the interest rate is set to zero (defult)
     */    

    public savingAccount()
    {
        interestRate = 0;
        
    }
    /** 
     * Constructor method to extend bank account attributes 
     * (account number, customer name and current balance)
     * and set interest rate
     * 
     * @param interestRateIn   the interest rate for saving account(double)
     */

    public savingAccount(int accountNoIn, String customerNameIn,
                       double currentBalanceIn, double interestRateIn)
    {
        super (accountNoIn, customerNameIn, currentBalanceIn);
        
        interestRate = interestRateIn;
        
        setCurrentBalance ( getCurrentBalance() + interestRate );
 
   }

   public double getInterestRate()
    {
         return (interestRate);
    }
  
   /**
   *  Calculates the balance by adding the interest rate
   *  Updates the account balance.
   */
   public void addInterestRate(double interestRateIn)
    {
        setCurrentBalance((getInterestRate ()/100+1) * getCurrentBalance());
    
   }
   /**
    * This method allows to calculate current balance after
    * withdraw 
    */
   @Override
   public void withdraw(double withdrawIn)
     {
         setCurrentBalance(getCurrentBalance() - withdrawIn);  
         if(getCurrentBalance() < 0)
         {
             setCurrentBalance (getCurrentBalance() + withdrawIn);
             System.out.println("You can't withdraw the money");
            }
         
     }
}

