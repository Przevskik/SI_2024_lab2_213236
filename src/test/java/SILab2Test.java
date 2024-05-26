import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private List<Item> createItems(Item... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    public void EveryBranchTest(){
        RuntimeException x;

        //prv
        x=assertThrows(RuntimeException.class, ()->SILab2.checkCart(null,100));
        assertTrue(x.getMessage().contains("allItems list can't be null!"));

        //vtor
        x=assertThrows(RuntimeException.class, ()->SILab2.checkCart(createItems(new Item("Item 1",null,10,0)),100));
        assertTrue(x.getMessage().contains("No barcode!"));

        //tret
        x=assertThrows(RuntimeException.class, ()->SILab2.checkCart(createItems(new Item("Item 1","2z4",100,0)),100));
        assertTrue(x.getMessage().contains("Invalid character in item barcode!"));

        //cet
        assertTrue(SILab2.checkCart(createItems(new Item("Item 1","2222343",450,0.05F)),500));

        //pet
        assertFalse(SILab2.checkCart(createItems(new Item("Item 1", "123456", 350, 0.5F)),100));
    }

    @Test
    public void MultipleConditionTest(){

        //TTT
        assertFalse(SILab2.checkCart(createItems(new Item("Item 1", "012", 350, 0.5f)),100));

        //TTF
        assertFalse(SILab2.checkCart(createItems(new Item("Item 1", "232", 350, 0.5f)),100));

        //TFX
        assertFalse(SILab2.checkCart(createItems(new Item("Item 1", "676", 500, 0)),100));

        //FXX
        assertFalse(SILab2.checkCart(createItems(new Item("Item 1", "878", 200, 0)),100));

    }
}