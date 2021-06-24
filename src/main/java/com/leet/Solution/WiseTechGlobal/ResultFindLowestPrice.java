package com.leet.Solution.WiseTechGlobal;

import java.util.List;
import java.util.Optional;

public class ResultFindLowestPrice {
    private static final String TYPE0="0";
    private static final String TYPE1="1";
    private static final String TYPE2="2";
    private static final String EMPTY="EMPTY";
    public static int findLowestPrice(List<List<String>> products, List<List<String>> discounts) {
        // Write your code here
        int maxPrice = 0;
        for (List<String> product : products) {
            int minProdPrice=Integer.parseInt(product.get(0));
            for (int ctr = 1; ctr < product.size(); ctr++) {
                if (EMPTY.equalsIgnoreCase(product.get(ctr))) {
                    continue;
                }
                final int salePrice = getSalePrice(Integer.parseInt(product.get(0)), product.get(ctr), discounts);
                if(salePrice < minProdPrice){
                    minProdPrice = salePrice;
                }
            }
            maxPrice=maxPrice+minProdPrice;
        }
        return maxPrice;
    }

    private static int getSalePrice(int price, String discountType,List<List<String>> discounts){
        final Optional<List<String>> any = discounts.stream().filter(discount -> discount.get(0).equals(discountType)).findAny();
        if(!any.isPresent()){
            return price;
        }
        final List<String> discount = any.get();
/*        if(TYPE0.equals(discount.get(1))){
            return price;
        }
        if(TYPE1.equals(discount.get(1))){

        }*/
        switch (discount.get(1)){
            case TYPE0:
                return price;
            case TYPE1:
                return price - price/100 * Integer.parseInt(discount.get(2));
            case TYPE2:
                return price - Integer.parseInt(discount.get(2));
        }
        return price;
    }
}

