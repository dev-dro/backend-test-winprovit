package com.dev.dro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.quarkus.test.junit.QuarkusTest;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
class AlticciServiceTest {

  @Inject
  AlticciService service;

  @Test
  void getAlticciByIndexZero() {
    Long result = service.getAlticciByIndex(0);
    assertEquals(0, result);
  }

  @Test
  void getAlticciByIndexOne() {
    Long result = service.getAlticciByIndex(1);
    assertEquals(1, result);
  }

  @Test
  void getAlticciByIndexTwo() {
    Long result = service.getAlticciByIndex(2);
    assertEquals(1, result);
  }

  @Test
  void getAlticciByIndexEight() {
    Long result = service.getAlticciByIndex(8);
    assertEquals(5, result);
  }
}
