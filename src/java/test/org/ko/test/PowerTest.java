package org.ko.test;

import org.junit.Test;

/**
 * description: PowerTest <br>
 * date: 2020/4/25 23:19 <br>
 *
 * @author K.O <br>
 * @version 1.0 <br>
 */
public class PowerTest {

    @Test
    public void method1() {
        System.out.println(1);
        {
            int a = 1;
            System.out.println(2);
            System.out.println(3);
        }
//        System.out.println(a);
        System.out.println(4);
    }
}
