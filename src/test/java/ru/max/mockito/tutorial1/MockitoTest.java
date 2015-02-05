package ru.max.mockito.tutorial1;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MockitoTest {

    @Test
    public void verifyCallMethods() {
        Foo foo = mock(Foo.class);
        Bar bar = new Bar(foo);
        bar.bar("qwe");
        verify(foo).foo("qwe");
    }

    @Test
    public void ignoreParameter() {
        Foo foo = mock(Foo.class);
        Bar bar = new Bar(foo);
        bar.bar("trala");
        verify(foo).foo(anyString());
    }
}
