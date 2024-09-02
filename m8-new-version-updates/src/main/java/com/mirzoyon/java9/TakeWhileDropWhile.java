package com.mirzoyon.java9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileDropWhile {

    public static void main(String[] args) {

        List<Stock> stocks = getStocks();
        System.out.println("Stocks sorted: \n" + stocks);
        System.out.println("__________________________________________________");
        List<Stock> stocks2 = getStocks2();
        System.out.println("Stocks unsorted: \n" + stocks2);

        System.out.println("__________________________________________________");

        //Using Filter
        List<String> stockBelow500Filter = getStocksBelowFiveHundredFilter(stocks);
        System.out.println("Filter output:" + stockBelow500Filter);
        System.out.println("__________________________________________________");
        List<String> stockBelow500Filter2 = getStocksBelowFiveHundredFilter2(stocks2);
        System.out.println("Filter output:" + stockBelow500Filter2);

        System.out.println("__________________________________________________");

        //Using takeWhile
        List<String> stockBelow500 = getStocksBelowFiveHundred(stocks);
        System.out.println("Filter output:" + stockBelow500);
        System.out.println("__________________________________________________");
        List<String> stockBelow5002 = getStocksBelowFiveHundred2(stocks2);
        System.out.println("Filter output:" + stockBelow5002);

        System.out.println("__________________________________________________");

        //Using dropWhile
        List<String> stockAbove500 = getStocksAboveFiveHundred(stocks);
        System.out.println("Filter output:" + stockAbove500);
        System.out.println("__________________________________________________");
        List<String> stockAbove5002 = getStocksAboveFiveHundred(stocks2);
        System.out.println("Filter output:" + stockAbove5002);
    }


    public static List<String> getStocksBelowFiveHundredFilter(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("Filter proccessing : " + stock))
                .filter(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }
    public static List<String> getStocksBelowFiveHundredFilter2(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("Filter Unordered proccessing : " + stock))
                .filter(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getStocksBelowFiveHundred(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("takeWhile proccessing : " + stock))
                .takeWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }
    public static List<String> getStocksBelowFiveHundred2(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("takeWhile Unordered proccessing : " + stock))
                .takeWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getStocksAboveFiveHundred(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("dropWhile proccessing : " + stock))
                .dropWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }
    public static List<String> getStocksAboveFiveHundred2(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("dropWhile unordered proccessing : " + stock))
                .dropWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static boolean isStockLessThanFiveHundred(Stock stock){
        return stock.getValue().compareTo(BigDecimal.valueOf(500))<=0;
    }

    private static List<Stock> getStocks(){

        List<Stock> stocks =  new ArrayList<>();
        stocks.add(new Stock("Apple", BigDecimal.valueOf(1000)));
        stocks.add(new Stock("Amazon", BigDecimal.valueOf(800)));
        stocks.add(new Stock("Tesla", BigDecimal.valueOf(400)));
        stocks.add(new Stock("Netflix", BigDecimal.valueOf(2000)));
        stocks.add(new Stock("Facebook", BigDecimal.valueOf(500)));
        stocks.add(new Stock("Instagram", BigDecimal.valueOf(100)));

        return stocks.stream()
                .sorted(Comparator.comparing(Stock::getValue))
                .collect(Collectors.toList());
    }

    private static List<Stock> getStocks2(){

        List<Stock> stocks1 =  new ArrayList<>();
        stocks1.add(new Stock("Apple", BigDecimal.valueOf(1000)));
        stocks1.add(new Stock("Amazon", BigDecimal.valueOf(800)));
        stocks1.add(new Stock("Tesla", BigDecimal.valueOf(400)));
        stocks1.add(new Stock("Netflix", BigDecimal.valueOf(2000)));
        stocks1.add(new Stock("Facebook", BigDecimal.valueOf(500)));
        stocks1.add(new Stock("Instagram", BigDecimal.valueOf(100)));


        return stocks1;
    }
}