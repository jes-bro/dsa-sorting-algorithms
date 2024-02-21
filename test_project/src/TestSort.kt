/**
 * A class to test MyQueue, a class
 * that represents a simple queue
 * with enqueueing, dequeueing, and empty checking
 * functionalities
 */

import org.junit.Test
import org.junit.Assert.*

class TestSort {

    /**
     * Test that enqueue puts keeps the first element in at the top
     * and grows downward.
     */
    @Test
    // Test that enqueue queues top down
    fun testRadixOneElement() {
        val listOfNumbers = mutableListOf<Int>()
        listOfNumbers.add(409)
        val sort = Sort()
        val sortedNumbersRadix = sort.radixSort(listOfNumbers)
        assertEquals("Check enqueue queues top down", mutableListOf(mutableListOf(4, 0, 9)), sortedNumbersRadix)
    }
}