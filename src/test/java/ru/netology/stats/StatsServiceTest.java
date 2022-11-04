package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void minSalesMonth() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMinSalesMonth = 9;
        int actualMonth = service.minSales(month);

        Assertions.assertEquals(expectMinSalesMonth, actualMonth);
    }

    @Test
    public void allYearSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectAllYearSales = 180;
        int actualAllYearSales = service.getAllYearSales(month);

        Assertions.assertEquals(expectAllYearSales, actualAllYearSales);
    }

    @Test
    public void mediumSalePerMonth() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMediumSalePerMonth = 15;
        int actualMediumSalePerMonth = service.getMediumSalePerMonth(month);

        Assertions.assertEquals(expectMediumSalePerMonth, actualMediumSalePerMonth);
    }

    @Test
    public void maxSalesMonth() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMaxSalesMonth = 8;
        int actualMaxSalesMonth = service.getmaxSales(month);

        Assertions.assertEquals(expectMaxSalesMonth, actualMaxSalesMonth);
    }

    @Test
    public void underMiddleSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectUnderMiddleSales = 5;
        int actualUnderMiddleSales = service.getUnderMiddleSales(month);

        Assertions.assertEquals(expectUnderMiddleSales, actualUnderMiddleSales);
    }

    @Test
    public void aboveMiddleSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectAboveMiddleSales = 5;
        int actualAboveMiddleSales = service.getUnderMiddleSales(month);

        Assertions.assertEquals(expectAboveMiddleSales, actualAboveMiddleSales);
    }
}
