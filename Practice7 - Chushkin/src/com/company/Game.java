package com.company;

/*
 * 1. Создать две структуры данных.
 * 2. Заполнить обе структуры целочисленными значениями.
 * 3. Сравнить два значения.
 * 4. Поменять два значения местами.
 * 5. Проверить закончились ли карты.
 * 5.1 Если да, то вывести наименование заполненногомассива
 * 5.2 Если нет, то проверить равно ли число перестановок 106.
 * 5.2.1 Если да, то заврешить программу.
 * 5.2.2 Если нет, то продолжить.
 * */

/*
1 3 5 7 9
2 4 6 8 0

Ответ: second 5
*/

import java.util.Scanner;

public abstract class Game<T> implements Gameable<T> {
    protected T fT;
    protected T sT;
    private int counter;

    //Создано две струтуры
    //Заполняем структуры значениями
    public Game() {
        Scanner sc = new Scanner(System.in);
        fT = inputVars(sc);
        sT = inputVars(sc);
    }

    //Сравнить два значения
    private boolean compareValue() {
        return (getVar1() == 0 && getVar2() == 9) || (getVar1() > getVar2() && (getVar1() != 9 && getVar2() != 0));
    }

    //Поменять два значения местами
    private void changePlace() {
        if (compareValue()) {
            swapVar(fT, sT);
        } else {
            swapVar(sT, fT);
        }
        counter++;
    }

    private String getResult() {
        if (counter <= 106)
            return isEmpty1() ? "second " + counter : "first " + counter;
        return "botva";
    }

    // 5.1 - 5.2
    public void start() {
        while (!isEmpty1() && !isEmpty2() && counter < 106) {
            changePlace();
        }
        System.out.println(getResult());
    }
}
