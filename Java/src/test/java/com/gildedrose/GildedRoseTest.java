package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void qualityDegradesPositiveSellIn() {
        Item[] items = new Item[] { new Item("Tanjia", 1, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }

    @Test
    public void qualityDegradesNegativeSellIn() {
        Item[] items = new Item[] { new Item("Tanjia", -1, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }

    @Test(expected = IllegalArgumentException.class)
    public void qualityOfAnItemIsNeverNegative() {
        Item[] items = new Item[] { new Item("Tanjia", 2, -1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
    }

    @Test
    public void AgedBrieQualityIncreaseWhenItGetOldWithSelinPositive() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }

    @Test
    public void AgedBrieQualityIncreaseWhenItGetOldWithSelinNegative() {
        Item[] items = new Item[] { new Item("Aged Brie", -2, 2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.items[0].quality);
    }

    @Test(expected = IllegalArgumentException.class)
    public void qualityOfAnItemIsNeverMoreThan50() {
        Item[] items = new Item[] { new Item("Tanjia", 2, 51) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
    }
}
