/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma17;

/**
 *
 * @author sedan
 */

class Turk extends Insan{
    public Turk(String pad){
      
        super(pad);
          String memleket;
    }

//    Turk() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public String merhaba(){
        return "Merhaba";
    }
}

class Ingiliz extends Insan {
    public Ingiliz (String pad){
        super(pad);
        String eyalet;
    }
    public String merhaba(){
        return  "hello";
    }
}
