/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MartShopSystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class DataCon {

    /**
     * @return the dataCon
     */
    public static Connection getDataCon() {
        return dataCon;
    }

    /**
     * @param aDataCon the dataCon to set
     */
    public static void setDataCon(Connection aDataCon) {
        dataCon = aDataCon;
    }

    /**
     * @return the userName
     */
    public static String getUserName() {
        return userName;
    }

    /**
     * @param aUserName the userName to set
     */
    public static void setUserName(String aUserName) {
        userName = aUserName;
    }
    private static Connection dataCon;
    private static String userName;
    public static void connectionDB(String server,String db,String user,String pass) throws Exception{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
        setDataCon(DriverManager.getConnection("jdbc:mysql://localhost/dbmart","root","12345"));
        setUserName(user);
    }
}
