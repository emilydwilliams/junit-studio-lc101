package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void multipleBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[]]]]]"));
    }

    @Test
    public void multipleUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]]]]"));
    }

    @Test
    public void setOfBracketsWithSpacesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("  [  ]  "));
    }

    @Test
    public void evenBracketsInRandomOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][][[["));
    }

    @Test
    public void returnsTrueWithTextAndBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void returnsTrueWithNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void returnsTrueTheEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void singleSetOfBracketsInWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsInWrongOrderWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void manyEvenBracketsWithTextInBetweenReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[L[a[u[n[c]h]C]o]d]e"));
    }
}
