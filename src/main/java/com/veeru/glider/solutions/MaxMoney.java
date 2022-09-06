package com.veeru.glider.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*Problem statement : In between his coding assignments, john is visting a neighborhoodgarage sale
to purchase some item for his home
However, some items are junk and have a negavtive price- Their owners are happy to pay someone
        to take them away.john has a big truck and can take up to M items. He can only make one trip
        and needs your help to maximize the money he can take.*/
 /*Input : the first line of input contains an integer M,representing the maximum no of items that john
 * can carry  in his truck.
 * The second line of input contains an integer N , representing the no of items for sale.
 * the third line of input contains N space seperated integers, representing the array elements
 * as prices for each items  */

public class MaxMoney {

    public static void main(String[] args) {
        System.out.println(getAmountOfMoney(3, Arrays.asList(2,3,5,10,14)));
    }

    private static int getAmountOfMoney(int M, List<Integer> asList) {
        return asList.stream().filter(val -> {
            int result = Integer.signum(val);
            return result!=0 && result!=1;
        }).sorted(Comparator.naturalOrder()).limit(M).mapToInt(Integer::intValue).sum();
    }
}
