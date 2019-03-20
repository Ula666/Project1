/**
 * This class represents Building.
 * For the purpose of this Class a Building has five
 * attributes to hold the number of bedrooms, number of bathrooms, price, 
 * property type and address. 
 * 
 * Copyright (c) Bournemouth University
 * 
 * @author Ula Ziolko
 * 
 * @version 1.0 (Task 1)
 */


public class Building
{   
    private int noOfBedrooms;
    private int noOfBathrooms;
    private double price;
    private String propertyType;
    private Address address;
     /**
     * Constructor method
     * In this method the number of bedrooms is set to zero
     * (default), number of bathrooms is set to zero (default),
     * the price is set to zero (default), the property type 
     * is set to null String(default), and the address is set to
     * null String (default).
     */  

    public Building(){ 
     noOfBedrooms = 0;
     noOfBathrooms = 0;
     price = 0;
     propertyType = null;
     address = null;
    }
    /** 
     * Constructor method to set number of bedrooms, price, 
     * type of property and address
     * 
     * @param noOfBedroomsIn   the number of bedrooms in Building (int)
     * @param noOfBathroomsIn the number of bathrooms in Building (int)
     * @param priceIn   the price of the Building (double)
     * @param propertyTypeIn  the type of the Building (String)
     * @param addressIn the address of the Building (String)
     */

    public Building(int noOfBedroomsIn, int noOfBathroomsIn,
                   double priceIn, String propertyTypeIn, Address addressIn)
    {
        noOfBedrooms = noOfBedroomsIn;
        noOfBathrooms = noOfBathroomsIn;
        price = priceIn;
        propertyType = propertyTypeIn;
        address = addressIn;
    }
    /**
     * Set number of bedrooms
     * 
     * @param noOfBedroomsIn  the number of bedrooms for
     * the Building (int)
     */

    public void setNumberOfBedrooms(int noOfBedroomsIn)
    {
        noOfBedrooms = noOfBedroomsIn;
    }
    /**
     * Set number of bathrooms
     * 
     * @param noOfBathroomsIn  the number of bathrooms for
     * the Building (int)
     */

    public void setNumberOfBathrooms(int noOfBathroomsIn)
    {
        noOfBathrooms = noOfBathroomsIn;
    }
    /**
     * Set price
     * 
     * @param priceIn  the price of the Building  (double)
     */
    
    public void setPrice( double priceIn)
    {
        price = priceIn;
    }
    /**
     * Set type of property
     * 
     * @param propertyTypeIn  the type of property of
     * the Building (double)
     */

    public void setPropertyType( String propertyTypeIn)
    {
        propertyType = propertyTypeIn;
    }
    /**
     * Set address
     * 
     * @param addressIn  the address of the Building (double)
     */
 
    public void setAddress( Address addressIn)
    {
       address = addressIn;
    }
    
    /**
     * Get number of bedrooms of Building
     * 
     * @return   number of bedrooms (as a int)
     */

    public int getNumberOfBedrooms()
    {
        return (noOfBedrooms);
    }
    /**
     * Get number of bathrooms of Building
     * 
     * @return   number of bathrooms (as a int)
     */

    public int getNumberOfBathrooms()
    {
        return (noOfBathrooms);
    }
    /**
     * Get a price of Building
     * 
     * @return   price (as a double)
     */
 
    public double getprice()
    {
        return (price);
    }
    /**
     * Get type of a property of Building 
     * 
     * @return   type of property (as a String)
     */

    public String propertyType()
    {
        return (propertyType);
    }
    /**
     * Get an address of Building
     * 
     * @return   address (as a String)
     */
    
    public Address getaddress()
    {
        return (address);
    }
}//End class   

