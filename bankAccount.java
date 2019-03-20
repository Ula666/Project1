/**
 * This class represents Bank Account, and implements BankInterface
 * For the purpose of this Class a Bank Account has three
 * attributes to hold the account number, customer name and curent balance.
 * 
 * @author Ula Ziolko
 * 
 * @version  (Task 2)
 */
abstract public class bankAccount implements BankInterface,
 CustomerNameInterface
{
   
    private int accountNo;
    private String customerName;
    private double currentBalance;
    
   /**
     * Constructor method
     * In this method the account number is set to zero
     * (default), the customer name is set to null String (default),
     * and the current balance is set to zero (default)
     * 
     */  
   
    public bankAccount()
    {
       accountNo = 0;
       customerName = null;
       currentBalance = 0;
      
    }
    
   /** 
     * Constructor method to set account number, customer name and  
     * current balance
     * 
     * @param accountNoIn   the account number for bank account (int)
     * @param NameIn the customer name for bank account (String)
     * @param currentBalanceIn   the current balace for bank account (double)
     */
   public bankAccount(int accountNoIn, String NameIn,
                       double currentBalanceIn)
    {
        accountNo = accountNoIn;
        customerName = NameIn;
        currentBalance = currentBalanceIn;
        
    }
    
    /**
     * Set account number
     * 
     * @param accountNoIn  the account number for
     * the Bank Account (double)
     */
   public void setAccountNumber (int accountNoIn)
     {
         accountNo = accountNoIn;
     }
    
    /**
     * Set customer name
     * 
     * @param NameIn  the customer name for
     * the Bank Account (String)
     */
   public void setName (String NameIn)
    {
        customerName = NameIn;
    }
    
    /**
     * Set current balance
     * 
     * @param currentBalanceIn  the current balance for
     * the Bank Account (double)
     */
   public void setCurrentBalance (double currentBalanceIn)
     {
         currentBalance = currentBalanceIn;
     }
    
    /**
     * Get account number of Bank Account
     * 
     * @return   account number (as a int)
     */
   public double getAccountNumber()
    {
        return (accountNo);
    }
    
    /**
     * Get customer name of Bank Account
     * 
     * @return   customer name (as a String)
     */
   public String getName()
    {
        return (customerName);
    }
    
    /**
     * Get current balance of Bank Account
     * 
     * @return   current balance (as a double)
     */
   public double getCurrentBalance()
    {
        return (currentBalance);
    }
 
    /**
     * Method to calculate current balance after withdraw 
     */
   public void withdraw(double withdrawIn)
     {
         setCurrentBalance(getCurrentBalance() - withdrawIn);  
         if(getCurrentBalance() < 0)
         {
             setCurrentBalance (getCurrentBalance() + withdrawIn);
             System.out.println("You are overdraw");
            }
         
    }
   
   /**
     * Method to calculate current balance after added deposit
     */
     public void deposit(double depositIn)
      {
         currentBalance = currentBalance + depositIn; 
    }
}