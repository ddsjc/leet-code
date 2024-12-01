package searchInsertPosition;

import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class TestInsertPosition {
    InsertPosition insertPosition = new InsertPosition();
    @Test
    public void insertPositionTest(){
        int[] nums = {1,3,5,6};
        int target = 5;
        int correct = 2;
        int result = insertPosition.searchInsert(nums, target);
        assertEquals(result, correct);
    }

    @Test
    public void insertPositionTestNotFound() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int correct = 1;
        int result = insertPosition.searchInsert(nums, target);
        assertEquals(correct, result);
    }

    @Test
    public void insertPositionTestInsertEnd() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int correct = 4;
        int result = insertPosition.searchInsert(nums, target);
        assertEquals(correct, result);
    }

    @Test
    public void insertPositionTestInsertBeginning() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int correct = 0;
        int result = insertPosition.searchInsert(nums, target);
        assertEquals(correct, result);
    }

    @Test
    public void insertPositionTestEmptyArray() {
        int[] nums = {};
        int target = 1;
        int correct = 0;
        int result = insertPosition.searchInsert(nums, target);
        assertEquals(correct, result);
    }
}
