package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class App1SpyTest {

  @Spy
  private App2 app2;

  @InjectMocks
  private App1 app1;

  @Test
  void testMultiply(){
    when(app2.provider2(8, 2)).thenReturn(105);
//    App1 app1 =new App1(app2);
    int actual = this.app1.mulitply(8, 2);
    assertEquals(109, actual);
  }
  
}
