/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MartShopSystem;

/**
 *
 * @author user
 */
public class DataCollections {

    /**
     * @return the proname
     */
    public String getProname() {
        return proname;
    }

    /**
     * @param proname the proname to set
     */
    public void setProname(String proname) {
        this.proname = proname;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
    private String proname, price,qty,amount;

    public DataCollections() {
    }

    public DataCollections(String proname, String price, String qty, String amount) {
        this.proname = proname;
        this.price = price;
        this.qty = qty;
        this.amount = amount;
    }
    
}
