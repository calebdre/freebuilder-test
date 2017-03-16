package com.freebuildertest;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public interface User {
    String firstName();
    String lastName();
    String email();
    String employer();
    String jobTitle();

    class Builder extends User_Builder {}
}
