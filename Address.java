
/**
 * This class represents Address object.
 * For the purpose of this Class a Address has five
 * attributes to hold the number of building number, street name, name of 
 * a city, name of a county and post code.
 * 
 * Copyright (c) Bournemouth University
 * 
 * @author Ula Ziolko
 * 
 * @version 1.0
 */
public class Address
{
 
    private int buildingNo;
    private String street;
    private String city;
    private String county;
    private String postCode;
    /**
     * Constructor method
     * In this method the building number is set to zero
     * (default), the street name is set to null String (default),
     * the city name is set to null Strig (default), the county name
     * is set to null String(default), and the postcode is set to
     * null String (default).
     */      
   
    public Address(){   
     buildingNo = 0;
     street = null;
     city = null;
     county = null;
     postCode = null;
    }
    /** 
     * Constructor method to set building number, street name, city name,
     * county name and post code.
     * 
     * @param buildingNoIn   the building number in the Address (int)
     * @param streetIn the street name in the Address (String)
     * @param cityIn   the name of the city in the Address (String)
     * @param countyIn  the county in the Address (String)
     * @param postCodeIn the post code of the Address (String)
     */
    public Address( int buildingNoIn, String streetIn, 
                   String cityIn, String countyIn, String postCodeIn)
    {
        buildingNo = buildingNoIn;
        street = streetIn;
        city = cityIn;
        county = countyIn;
        postCode = postCodeIn;
    }
    
     /**
     * Set building number
     * 
     * @param buildingNoIn  the building number for
     * the Address (double)
     */
    public void setBuildingNumber( int buildingNoIn)
    {
       buildingNo = buildingNoIn;
    }
     /**
     * Set street name
     * 
     * @param streetIn  the street name for
     * the Address (String)
     */
    public void setStreet( String streetIn)
    {
       street = streetIn;
    }
     /**
     * Set name of a city
     * 
     * @param cityIn  the name of a city for
     * the Address (String)
     */
    public void setCity( String cityIn)
    {
       city = cityIn;
    }
     /**
     * Set name of a county
     * 
     * @param countyIn  the name of a county for
     * the Address (String)
     */
    public void setCounty( String countyIn)
    {
       county = countyIn;
    }
     /**
     * Set post code
     * 
     * @param postCodeIn  the post code for
     * the Address (String)
     */
    public void setpostCode( String postCodeIn)
    {
       postCode = postCodeIn;
    }
    
    /**
     * Get building number for Address
     * 
     * @return   building number (as a int)
     */
    public int getBuildingNumber()
    {
       return (buildingNo);
    }  
    /**
     * Get street name for Address
     * 
     * @return   street name (as a String)
     */
    public String  getStreet()
    {
        return (street); 
    }
    /**
     * Get name of a city for Address
     * 
     * @return   name of a city (as a String)
     */
    public String getCity()
    {
        return (city);
    }
    
    /**
     * Get name of a county for Address
     * 
     * @return   name of a county (as a String)
     */
    public String getCounty()
    {
        return (county);
    }
    
    /**
     * Get post code for Address
     * 
     * @return   post code (as a double)
     */
    public String getPostCode()
    {
        return (postCode);
    }
    /** 
     * This method allows a format character to be passed
     * into the method itself and returns the address (in a
     * suitable format - including the format character).
     * The formatted address is returned as a String
     */
    public String formatAddress(char formatCharacter)
    {
        return ( buildingNo + "" + formatCharacter + 
        street + formatCharacter + city + formatCharacter + 
        county + formatCharacter + postCode + formatCharacter );
    } 
} //End Class
