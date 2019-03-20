
/**
 * This class represents Publication and implements Publishable.
 * For the purpose of this class a Publication has 7 attributes 
 * to hold the title, name of author, number of pages, price, 
 * name of publisher, publication date and version type.
 * 
 * @author (Ula Ziolko)
 * 
 * @version (Task 3)
 */
abstract public class Publication implements Publishable
{
    private String title;
    private String name;
    private int    noOfPages;
    private double  price;
    private String publisher;
    private String publicationDate;
    private String versionType;
   
   /**
     * Constructor method
     * In this method the title is set to null String(default),
     * the name of author to null String(default), the number of 
     * pages to zero(default), the price is set to zero(default),
     * the publisher name is set to null String(default), 
     * the publication date is set to null String(default),
     * and the version type is set to null String(default).
     * 
     */
   public Publication()
   {
       title = null;
       name = null;
       noOfPages = 0;
       price = 0;
       publisher = null;
       publicationDate = null;
       versionType = null;
    }
   
   /** 
     * Constructor method to set title, name of author, number of pages,  
     * price, publisher name, publication date and version type.
     * 
     * @param titleIn   the title name of Publication (String)
     * @param nameIn   the author's name of Publication (String)
     * @param noOfPagesIn   the number of pages of Publication (int)
     * @param priceIn   the price of Publication (double)
     * @param publisherIn   the publisher's name of Publication (String)
     * @param publicationDateIn   the publication date of Publication(String)
     * 
     */
   public Publication (String titleIn, String nameIn, int noOfPagesIn,
                       double priceIn, String publisherIn, String 
                       publicationDateIn, String versionTypeIn)
    {
         title = titleIn;
         name = nameIn;
         noOfPages = noOfPagesIn;
         price = priceIn;
         publisher = publisherIn;
         publicationDate = publicationDateIn;
         versionType = versionTypeIn;
      }
      
     /**
     * Set title name
     * 
     * @param titleIn  the title for
     * the Publication (String)
     */
   public void setTitle (String titleIn)
     {
         title = titleIn;
     }   
    /**
     * Set author's name
     * 
     * @param nameIn  the name for
     * the Publication (String)
     */
   public void setName (String nameIn)
     {
       name = nameIn;
     } 
    /**
     * Set number of pages
     * 
     * @param noOfPagesIn  the number of pages for
     * the Publication (int)
     */
   public void setNoOfPages (int noPagesIn)
     {
         noOfPages = noPagesIn;
    }  
    /**
     * Set price
     * 
     * @param priceIn  the price for
     * the Publication (double)
     */
   public void setPrice (double priceIn)
     {
         price = priceIn;
     }
    /**
     * Set publisher's name
     * 
     * @param publisherIn  the publisher for
     * the Publication (String)
     */
   public void setPublisher (String publisherIn)
     {
         publisher = publisherIn;
     }
    /**
     * Set publication date
     * 
     * @param publicationDateIn  the publication date for
     * the Publication (String)
     */
   public void setPublicationDate (String publicationDateIn)
     {
         publicationDate = publicationDateIn;
     }
    /**
     * Set version type
     * 
     * @param versionTypeIn  the version type for
     * the Publication (String)
     */
   public void setVersionType (String versionTypeIn)
     {
         versionType = versionTypeIn;
     }
     
    /**
     * Get title of Publication
     * 
     * @return   title (as a String)
     */
   public String getTitle()
     {
         return ( title );
     }
   /**
     * Get author's name of Publication
     * 
     * @return   name (as a String)
     */
   public String getName()
     {
         return ( name );
     }
    /**
     * Get number of pages of Publication
     * 
     * @return   noOfPages (as a int)
     */
   public int getNoOfPages()
     {
         return ( noOfPages );
     }
    /**
     * Get price of Publication
     * 
     * @return   price (as a double)
     */
   public double getPrice()
      {
          return ( price );
      }
    /**
     * Get publisher of Publication
     * 
     * @return   publisher (as a String)
     */
   public String getPublisher()
     {
         return ( publisher );
     }
    /**
     * Get publication date of Publication
     * 
     * @return   publicationDate (as a String)
     */
   public String getPublicationDate()
     {
         return ( publicationDate );
     }  
    /**
     * Get version type of Publication
     * 
     * @return   versionType (as a String)
     */
   public String getVersionType()
     {
         return ( versionType );
     }  
}//End Class

