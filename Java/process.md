- Process to refactor:
    - Unit test
        - [x] Once the sell by date has passed, Quality degrades twice as fast
        - [x] The Quality of an item is never negative
        - [x] "Aged Brie" actually increases in Quality the older it gets
        - [x] The Quality of an item is never more than 50
        - [x] "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
        - [x] "Backstage passes", like aged brie, increases in Quality as its SellIn value approaches;
           - [x] Quality increases by 2 when there are 10 days or less
           - [x] Quality increases by 3 when there are 5 days or less
           - [x] Quality drops to 0 after the concert
        - [ ] an item can never have its Quality increase above 50
        - [ ] however "Sulfuras" is a
             legendary item and as such its Quality is 80 and it never alters
       - [ ]  "Conjured" items degrade in Quality twice as fast as normal items
   