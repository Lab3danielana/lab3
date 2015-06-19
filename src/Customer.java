/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana Torres
 */
public class Customer extends User{
    
    private long creditCard;
    private String[] interest;
    private String postalAddress;
    
     public void addInterest (String interest1){
        
        for(int i=0;i<getInterest().length;i++){
            if(getInterest()[i]==""){
                getInterest()[i]=interest1;
        }            
        }
    }
    
    public void removeInterest(String interest1){
        for(int i=0;i<getInterest().length;i++){
            if(getInterest()[i]==interest1){
                getInterest()[i]="";
        }            
        }
        
    }

    /**
     * @return the creditCard
     */
    public long getCreditCard() {
        return creditCard;
    }

    /**
     * @param creditCard the creditCard to set
     */
    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * @return the interest
     */
    public String[] getInterest() {
        return interest;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(String[] interest) {
        this.interest = interest;
    }

    /**
     * @return the postalAddress
     */
    public String getPostalAddress() {
        return postalAddress;
    }

    /**
     * @param postalAddress the postalAddress to set
     */
    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
    
    
    
    
    
}
