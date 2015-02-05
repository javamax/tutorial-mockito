package ru.max.mockito.tutorial1;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MockitoTestSetup {

    private Foo foo;
    private Bar bar;

    @Before
    public void init() {
        foo = Mockito.mock(Foo.class);
        bar = new Bar(foo);
    }

    @Test
    public void test() {
        bar.bar("qwe");
        Mockito.verify(foo).foo("qwe");
    }
}
