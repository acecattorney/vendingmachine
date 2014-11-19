/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 * THIS CODE IS YINGLI'S VERSION (~ o x o)~
 */

public class Vendor
{
  int stock, price, deposit;

  /**
   * Constructs a Vendor
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
  public Vendor (int aPrice, int aStock)
  {
    if (aPrice >= 0 && aStock >= 0){
    	price = aPrice; // if the price is a positive integer and there is available stock, the price is aPrice
    	setStock(aStock); 
    }
  }

  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */
  public void setStock(int qty)
  {
    if (qty>=0){
    	stock = qty; // sets the total stock of each product
    }
  }

  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */
  public int getStock()
  {
    return stock; // returns the total remaining stock
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */
  public void addMoney(int cents)
  {
    deposit = deposit + cents; // adds money to the deposit when buttons referring to a certain amount of cents are pressed
  }

  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit()
  {
    return deposit; // returns the total money deposited into the vending machine
  }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock
   * and calculates and sets change and returns true;
   * otherwise refunds the whole deposit (moves it into
   * change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */
  public boolean makeSale()
  {
    if ((stock > 0) && (deposit >= price)){ // if there is available stock and the person has enough money to pay the price, they can make a sale
    	deposit-=price; // if the user chooses to make a sale, the deposit has the price subtracted from it
    	return true;
    }else{
    	return false; // if the user doesn't have enough money, makeSale returns false
    }
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change (int)
   */
  public int getChange()
  {
    return deposit; // returns the remaining money after deposit has the price subtracted from it
  }
}
