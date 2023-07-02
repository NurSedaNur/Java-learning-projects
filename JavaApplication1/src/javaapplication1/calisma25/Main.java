/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma25;

/**
 *
 * @author sedan
 */
public class Main {
    public static void main(String[] args) {
        
//        EmailLogger logger = new EmailLogger();
//        logger.log("log mesajı");
//        
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//
//        for(BaseLogger logger:loggers){
//            logger.log("log mesajı");
//        }

          CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
          customerManager.add();
    }
}
