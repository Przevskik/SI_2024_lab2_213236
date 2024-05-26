Kristijan Przevski 213236

2. Control Flow Graph

![Untitled Diagram drawio (3)](https://github.com/Przevskik/SI_2024_lab2_213236/assets/166219188/bd1fb57e-9ef3-451f-8e44-0c0713e694ca)


3. Цикломатската комплексност ја пресметав по формулата бр.ребра - бр.јазли + 2 па се добива 31-23+2=10. Цикломатската комплексност е 10.


4. Тест случаи според Every Branch:
   - Прв кога allitems=null (листата е празна) => Exception (allItems list can't be null!)
   - Втор кога barcode=null (нема бар код) => Exception (unknown)
   - Трет кога има бар код, но е во невалиден формат (пр. 233DA22) => Exception (Invalid character in item barcode!)
   - Четврт кога сумата е помала или еднаква на плаќањето sum<=payment => True
   - Петти кога сумата е поголема од плаќањето sum>payment => False
     
5. Тест случаи според Multiple Condition критериумот за условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0') :

   TTT - ако цената е поголема од 300, има попуст (е поголем од 0) и првиот карактер од баркодот е '0'

   TTF - ако цената е поголема од 300, има попуст (е поголем од 0) и првиот карактер од баркодот не е '0'

   ТFX - ако цената е поголема од 300, но нема попуст

   FXX - ако цената не е поголема од 300
      
