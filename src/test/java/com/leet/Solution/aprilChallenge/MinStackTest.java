package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MinStackTest {

    @Test
    public void top() {
        MinStack minStack = new MinStack();
/*        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertThat(minStack.getMin()).isEqualTo(-3);//   --> Returns -3.
        minStack.pop();
        assertThat(minStack.top()).isEqualTo(0);//   --> Returns 0.
        assertThat(minStack.getMin()).isEqualTo(-2);//   --> Returns -2.

        minStack = new MinStack();*/
/*        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        assertThat(minStack.getMin()).isEqualTo(0);//   --> Returns -3.
        minStack.pop();
        assertThat(minStack.top()).isEqualTo(1);//   --> Returns 0.
        assertThat(minStack.getMin()).isEqualTo(0);//   --> Returns -2. */
        // minStack.push(0);
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        assertThat(minStack.top()).isEqualTo(2147483647);
        minStack.pop();
        assertThat(minStack.getMin()).isEqualTo(2147483646);//   --> Returns -3.
        minStack.pop();
        assertThat(minStack.getMin()).isEqualTo(2147483646);
        minStack.pop();
        minStack.push(2147483647);
        assertThat(minStack.top()).isEqualTo(2147483647);//   --> Returns 0.
        assertThat(minStack.getMin()).isEqualTo(2147483647);//   --> Returns -2.
        minStack.push(-2147483648);
        assertThat(minStack.top()).isEqualTo(-2147483648);
        assertThat(minStack.getMin()).isEqualTo(-2147483648);
        minStack.pop();
        assertThat(minStack.getMin()).isEqualTo(2147483647);
    }
}