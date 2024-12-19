package com.example.helloservice;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

//@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
class HelloServiceApplicationTests {
    @Mock HelloService helloService;
    // unit test against this class
    @InjectMocks HelloController classUnderTest;
    //@InjectMocks HelloController1 helloController1;

    @Test
    void contextLoads() {
        String expected = "Hello XYZ";
        //stub
        Mockito.when(helloService.wishByName(Mockito.anyString())).thenReturn(expected);
        String actual = classUnderTest.wishByName("XYZ");
        Assert.assertEquals(expected, actual);
    }

}
