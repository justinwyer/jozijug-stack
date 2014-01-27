package jozijug;

import jozijug.JoziStack;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    @Test
    public void shouldReturnTrueWhenPushingAnItemToTheStack() throws Exception {
        JoziStack joziStack = new JoziStack();
        Assert.assertTrue(joziStack.push("A Value"));
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowIllegalStateExceptionWhenAnEmptyStackIsPopped() throws Exception {
        new JoziStack().pop();
    }

    @Test
    public void shouldGetAValueWhenANonEmptyStackIsPopped() throws Exception {
        JoziStack joziStack = new JoziStack();
        joziStack.push("A Value");
        Assert.assertEquals("A Value", joziStack.pop());
    }
}
