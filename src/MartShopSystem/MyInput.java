/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MartShopSystem;

import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class MyInput {
    public static void inputNumber(KeyEvent evt){
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }
    public static void inputNumber(KeyEvent evt,JTextField txt, int len){
        String st=txt.getText().trim();
        if(st.length()>=len)
            evt.consume();
        else if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }
    public static void inputFloating(KeyEvent evt,JTextField txt){
        String st=txt.getText().trim();
        if(evt.getKeyChar()==46){
             if(st.indexOf(46)!=-1) //pel mean . roch hz
                 evt.consume();
        }if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }
    public static void inputFloating(KeyEvent evt, JTextField txt, int len){
        String st=txt.getText().trim();
        if(evt.getKeyChar()==46){
             if(st.indexOf(46)!=-1) //pel mean . roch hz
                 evt.consume();
             else if(st.equals("")){
                 txt.setText("0.");
                 evt.consume();
             }
        } else if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        else{
            if(st.equals(""))
                return;
            double v=Double.valueOf(st);//"45.34"
            long val=(long)v;
            st=""+val;//"45"
            if(st.length()>=len)
                evt.consume();
        }
    }
    public static boolean checkInput(JTextField...txt){
        for (JTextField temp : txt) {
            String st=temp.getText().trim();
            if(st.equals("")){
                Toolkit.getDefaultToolkit().beep();//voice
                temp.grabFocus(); 
                return false;
            }
        }
        return true;
    }
    public static void clearText(JTextField...txt){
        for(JTextField temp: txt)
            temp.setText("");
        txt[0].grabFocus();
    }
    public DefaultTableModel inputvalue(JLabel...lb){
        DefaultTableModel mod=new DefaultTableModel();
        mod.addColumn(lb);
        return mod;
    }
}
