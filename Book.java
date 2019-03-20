/**
 * This class represents Book, and extends Publication class.
 * For the purpose of this Class a Book has three
 * attributes to hold edition number, genre and cover type.
 * 
 * @author Ula Ziolko
 * 
 * @version (Task 3)
 */
public class Book extends Publication implements Publishable
{
    
    private String editionNo;
    private String genre;
    private String coverType;
    
   /**
     * Constructor method
     * In this method the edition number is set to null String(default),
     * the genre is set to null String(default) and
     * the cover type is set to null String(default)
     * 
     */
   public Book()
    {
      editionNo = null;  
      genre = null;
      coverType = null;
    }
   /** 
     * Constructor method to extend attributes from Publication class
     * (title, name of author, number of pages, price,
     * publisher name, publication date and version type) 
     * and to set edition number, genre and cover type.
     * 
     * @param editionNoIn   the edition number of Book(String)
     * @param genreIn   the genre of Book(String)
     * @param coverTypeIn   the cover type of Book(String)
     * 
     */
   public Book (String titleIn, String nameIn, int noOfPagesIn,
                       double priceIn, String publisherIn, String 
                       publicationDateIn, String versionTypeIn,
                       String editionNoIn, String genreIn, String coverTypeIn)
                       {
                           super (titleIn, nameIn, noOfPagesIn, priceIn, 
                           publisherIn, publicationDateIn, versionTypeIn);
                         
                           editionNo = editionNoIn;
                           genre = genreIn;
                           coverType = coverTypeIn;
                        }
   /**
     * Set edition number
     * 
     * @param editionNoIn  the edition number of
     * the Book (String)
     */
   public void setEditionNo(String editionNoIn)
     {
         editionNo = editionNoIn;
     } 
   /**
     * Set genre
     * 
     * @param genreIn  the genre of
     * the Book (String)
     */
   public void setGenre(String genreIn)
     {
         genre = genreIn;
     } 
    /**
     * Set type of cover
     * 
     * @param coverTypeIn  the type of cover of
     * the Book (String)
     */
   public void setCoverType(String coverTypeIn)
     {
         coverType = coverTypeIn;
     } 
     
    /**
     * Get edition number of Book
     * 
     * @return   editionNo (as a String)
     */
   public String getEditionNo()
     {
         return ( editionNo );
     }
     /**
     * Get genre of Book
     * 
     * @return   genre (as a String)
     */
   public String getGenre()
     {
         return ( genre );
     }
    /**
     * Get cover type of Book
     * 
     * @return   coverType (as a String)
     */
   public String getCoverType()
     {
         return ( coverType );
     }
}
