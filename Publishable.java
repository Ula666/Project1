/**
 * This class represents Publishable Interface Class
 * 
 * @author Ula Ziolko
 * @version (Task 3)
 */
public interface Publishable
{
      /**
      * Set a publication's title
      * 
      * @param titleIn  The title of a publication
      */
     public void setTitle(String titleIn);
     
      /**
      * Set a publication's author
      * 
      * @param nameIn  The author's name of a publication
      */
     public void setName(String nameIn);
     
      /**
      * Set a publication's price
      * 
      * @param priceIn  The price of a publication
      */
     public void setPrice(double priceIn);

    
     /**
     * Get a publication's title
     * 
     * @ return The publication title
     */
     public String getTitle(); 
    
     /**
     * Get a publication's name of author
     * 
     * @ return The publication author's name
     */
     public String getName(); 
     
    
     /**
     * Get a publication's price
     * 
     * @return The price of a publication
     */
     public double getPrice();
     
}