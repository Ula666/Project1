
/**
 * This represents Magazine and extend Publication class.
 * For the purpose of this class a Publication has three attributes
 * to hold issue number, category and frequency of publishing time.
 *
 * @author (Ula Ziolko)
 * 
 * @version (Task 3)
 */
public class Magazine extends Publication implements Publishable
{
   
    private int issueNo;
    private String category;
    private String frequency;
   /**
     * Constructor method
     * In this method the issue number is set to zero(default),
     * the category is set to null String(default) and
     * the frequency is set to null String(default)
     * 
     */
    public Magazine()
    {
        issueNo = 0;
        category = null;
        frequency = null;
    }
   /** 
     * Constructor method to extend attributes from Publication class
     * (title, name of author, number of pages, price,
     * publisher name, publication date and version type) 
     * and to set edition issue number, category and frequency.
     * 
     * @param issueNoIn   the issue number of Magazine(int)
     * @param categoryIn   the category of Magazine(String)
     * @param frequencyIn   the frequency of Magazine(String)
     * 
     */
    public Magazine (String titleIn, String nameIn, int noOfPagesIn,
                       double priceIn, String publisherIn, String 
                       publicationDateIn, String versionTypeIn, int
                       issueNoIn, String categoryIn, String frequencyIn)
                       {
                           super (titleIn, nameIn, noOfPagesIn, priceIn, 
                           publisherIn, publicationDateIn, versionTypeIn);
                          
                           issueNo = issueNoIn;
                           category = categoryIn;
                           frequency = frequencyIn;
                        }
    /**
     * Set issue number
     * 
     * @param issueNoIn  the issue number of
     * the Magazine (int)
     */
   public void setIssueNo(int issueNoIn)
     {
         issueNo = issueNoIn;
     }      
    /**
     * Set category
     * 
     * @param categoryIn  the category of
     * the Magazine (String)
     */
   public void setCategory(String categoryIn)
     {
         category = categoryIn;
     } 
   /**
     * Set frequency
     * 
     * @param frequencyIn  the frequency of
     * the Magazine (String)
     */
   public void setFrequency(String frequencyIn)
     {
         frequency = frequencyIn;
     } 
     
     /**
     * Get issue number of Magazine
     * 
     * @return   issueNo (as a int)
     */
   public int getIssueNo()
     {
         return ( issueNo );
     }
     /**
     * Get category of Magazine
     * 
     * @return   category (as a String)
     */
   public String getCategory()
     {
         return ( category );
     }
     /**
     * Get frequency of Magazine
     * 
     * @return   frequency (as a String)
     */
   public String getFrequency()
     {
         return ( frequency );
     }
}
