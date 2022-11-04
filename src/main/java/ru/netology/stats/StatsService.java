package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {                                    //номер месяца с минимальными продажами
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getAllYearSales(long[] sales) {                             //общая сумма продаж  в год
        int allYearSales = 0;
        for (long sale : sales) {
            allYearSales += sale;
        }
        return allYearSales;
    }

    public int getMediumSalePerMonth(long[] sales) {                       //средняя сумма продаж в месяц
        int mediumSalePerMonth = getAllYearSales(sales) / sales.length;
        return mediumSalePerMonth;
    }

    public int getmaxSales(long[] sales) {                                 //номер месяца с максимальными продажами
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int getUnderMiddleSales(long[] sales) {                          //колличество месяцев с низкой продажей
        int underMiddleSales = 0;
        for (long sale : sales) {
            if (sale < getMediumSalePerMonth(sales))
                underMiddleSales = underMiddleSales + 1;
        }
        return underMiddleSales;
    }

    public int getAboveMiddleSales(long[] sales) {                          //колличество месяцев с высокой продажей
        int aboveMiddleSales = 0;
        for (long sale : sales) {
            if (sale > getMediumSalePerMonth(sales))
                aboveMiddleSales = aboveMiddleSales + 1;
        }
        return aboveMiddleSales;
    }
}