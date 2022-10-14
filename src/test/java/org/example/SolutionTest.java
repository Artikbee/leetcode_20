package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

//    @Test
//    public void SolutionTest(){
//        Assertions.assertEquals(true,solution.isValid("()[]{}"));
//    }

    @Test
    public void SolutionTest2(){
        Assertions.assertEquals(true,solution.isValid("{[]}"));
    }

}