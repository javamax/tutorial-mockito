package ru.max.mockito.tutorial1;

public class Bar {
    private Foo foo;

    public Bar(Foo foo) {
        this.foo = foo;
    }
    
    public String bar(String param) {
        return foo.foo(param);
    }
}
