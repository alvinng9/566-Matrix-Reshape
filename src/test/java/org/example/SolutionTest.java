package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void matrixReshapeTest() {
        Solution solution = new Solution();
        assertArrayEquals(new int[][]{{1, 2, 3, 4}},
                solution.matrixReshape(new int[][]{{1,2},{3,4}},1,4));
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}},
                solution.matrixReshape(new int[][]{{1,2},{3,4}},2,4));
    }
}