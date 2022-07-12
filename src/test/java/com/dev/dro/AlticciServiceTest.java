package com.dev.dro;

import static org.junit.jupiter.api.Assertions.*;

import io.quarkus.test.junit.QuarkusTest;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
class AlticciServiceTest {

  @Inject
  AlticciService service;

  @Test
  void getAlticciByIndexZero() {
    Integer result = service.getAlticciByIndex(0);
    assertEquals(0, result);
  }

  @Test
  void getAlticciByIndexOne() {
    Integer result = service.getAlticciByIndex(1);
    assertEquals(1, result);
  }

  @Test
  void getAlticciByIndexTwo() {
    Integer result = service.getAlticciByIndex(2);
    assertEquals(1, result);
  }

  @Test
  void getAlticciByIndexEight() {
    Integer result = service.getAlticciByIndex(8);
    assertEquals(5, result);
  }
}
