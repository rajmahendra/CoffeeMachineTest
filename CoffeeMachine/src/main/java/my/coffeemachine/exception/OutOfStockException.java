/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.coffeemachine.exception;

import my.coffeemachine.types.Drink;

/**
 *
 * @author Rajmahendra Hegde
 */
public class OutOfStockException extends RuntimeException {

    public OutOfStockException(Drink drink) {
        super(drink.toString());
    }
}
