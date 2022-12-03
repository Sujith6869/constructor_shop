/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor_shop;

/**
 *
 * @author Win0
 */
public class Constructor_shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               Shop shop = new Shop(100);
               shop.addmoney(10);
               shop.addmoney(15);
               shop.addmoney(100);
               shop.addmoney(50);
 
        
        
        System.out.println(shop.getMoney());
        
        
    }
    
}
