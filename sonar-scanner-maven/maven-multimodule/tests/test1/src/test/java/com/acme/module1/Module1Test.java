package com.acme.module1;

import org.junit.Test;

public class Module1Test {

  @Test
  public void coveredByUnitTest() {
    Module1 module1 = new Module1();
    module1.coveredByUnitTest();
  }

  @Test
  public void integrationTest1() {
    new Module1().coveredByIntegrationTest();
  }
}
