package ru.max.mockito.tutorial1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTestRunner {
    
    @Mock
    private Foo foo;
    
    @InjectMocks
    private Bar bar = new Bar(null);
    
    @Test
    public void test() {
        bar.bar("qwe");
        Mockito.verify(foo).foo("qwe");
    }
}
