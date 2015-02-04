package ru.max.mockito.tutorial1;

public class BarVoid {
    private FooVoid foo;

    public BarVoid(FooVoid foo) {
        this.foo = foo;
    }
    
    public void bar(String param) {
        foo.foo(param);
    }
}
