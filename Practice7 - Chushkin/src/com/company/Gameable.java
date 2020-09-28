package com.company;

import java.util.Scanner;

public interface Gameable<T> {
    T inputVars(Scanner sc);
    int getVar1();
    int getVar2();
    boolean isEmpty1();
    boolean isEmpty2();
    void swapVar(T t1, T t2);
}
