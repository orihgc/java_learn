package generics;

import generics.fruit.Apple;
import generics.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public void fun1(String[] args) {
        List list = new ArrayList();
        list.add(1);
        System.out.println(list.get(0));
    }

    public void fun2() {
        List<String> list = new ArrayList<>();

        List<? extends String> objects = list;

        List<? super String> list1 = list;
    }

    //region 上界通配符

    /**
     * 上界通配符
     */
    public void fun3() {
        List<Apple> list = new ArrayList<>();
        list.add(new Apple());
        List<? extends Fruit> fruits = list;
        Apple fruit = (Apple) fruits.get(0);
    }

    public void fun4(List<? extends Fruit> fruits) {

    }
    //endregion

    //region 下界通配符

    /**
     * 下界通配符
     */
    public void fun5() {
        List<Fruit> list = new ArrayList<>();
        List<? super Apple> fruits = list;
        fruits.add(new Apple());
        Object object = fruits.get(0);
        Apple apple = (Apple) object;
    }

    //endregion

    public static void main(String[] args) {
        Main main = new Main();
        main.fun5();
    }

}
