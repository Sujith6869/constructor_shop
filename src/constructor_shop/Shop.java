/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor_shop;

/**
 *
 * @author Win0
 */
public class Shop {
    private int money;
    public Shop( int initialMoney) {
        money = initialMoney;
    }
    public void addmoney(int Money) {
        this.money += money;
    }
    public int getMoney(){
        return money;
        
    }
            
    
}
