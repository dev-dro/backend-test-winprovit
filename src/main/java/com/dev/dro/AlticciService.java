package com.dev.dro;

import io.quarkus.cache.CacheResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciService {

  private static final List<Long> sequence = new ArrayList<>(Arrays.asList(0L, 1L, 1L));

  @CacheResult(cacheName = "alticci-cache")
  public Long getAlticciByIndex(Integer index) {
    if (sequence.size() - 1 < index) {
      calculateAlticciTillIndex(index);
    }
    return sequence.get(index);
  }

  public void calculateAlticciTillIndex(Integer index) {
    for (int i = sequence.size() - 1; i < index; i++) {
        sequence.add(sequence.get(sequence.size() - 3) + sequence.get(sequence.size() - 2));
    }
  }
}
