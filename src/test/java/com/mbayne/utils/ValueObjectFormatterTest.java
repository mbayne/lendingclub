package com.mbayne.utils;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.test.context.junit4.*;
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 

//import static org.assertj.core.api.Assertions.*;

public class ValueObjectFormatterTest {
  private final static Logger log =
    LoggerFactory.getLogger(ValueObjectFormatterTest.class);
  @Test
  public void formatTest() {
    StringBuilder Tsb = new StringBuilder();
    Tsb.append("TestInstance {\n");
    Tsb.append("  fname=Mike,\n");
    Tsb.append("  mname=Todd,\n");
    Tsb.append("  lname=Bayne,\n");
    Tsb.append("  age=47,\n");
    Tsb.append("  nullField=nullValue\n} /* END OF TestInstance */");
    ValueObjectFormatter formatter =
      new ValueObjectFormatter("TestInstance", 0);
    formatter.append("fname", "Mike");
    formatter.append("mname", "Todd");
    formatter.append("lname", "Bayne");
    formatter.append("age", 47);
    formatter.append("nullField", null);
    //log.info(formatter.format());
    assertEquals(formatter.format(), Tsb.toString());
  }
}
