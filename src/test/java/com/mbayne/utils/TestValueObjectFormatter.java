package com.mbayne.utils;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.test.context.junit4.*;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(SpringRunner.class)
public class TestValueObjectFormatter {
  @Test
  public void formatTest() {
    ValueObjectFormatter formatter =
      new ValueObjectFormatter("TestInstance", 0);
    formatter.append("fname", "Mike");
    formatter.append("mname", "Todd");
    formatter.append("lname", "Bayne");
    formatter.append("age", 47);
    System.out.println(formatter.toString());
  }
}
