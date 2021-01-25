package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertTrue(true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void bracketTest() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][["));
    }

    @Test
    public void bracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void bracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{[}"));
    }
    @Test
    public void returnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[}"));
    }
    @Test
    public void bracketReturn() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{]"));
    }
    @Test
    public void falseReturn() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{]{"));
    }

}
//", , , "]["