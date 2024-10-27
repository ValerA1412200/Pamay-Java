package  memory;

import java.util.Arrays;

public class Main {

    public static void main(String[]args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);

        Integer value1 = 33;
        changeValue(value1);
        System.out.println(value1);

        Integer[] arr = new Integer[] {3,4};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));

        changeParametr(arr);
        System.out.println(Arrays.toString(arr));

        memory.Person person = new Person ("Сталин", "Ленин");
        changePerson(person);
        System.out.println(person);

        changePersonName(person);
        System.out.println(person);

    }

    public static void changeValue(int value1) {
        value1 = 22;
    }

    public static void changeValue(Integer value) {
        value = 22;
        value = Integer.valueOf(22);
    }

    public static void changeValue(Integer[] value) {
        value = new Integer[] {1,2};
    }

    public static void changeParametr(Integer[] value) {
        value[0] = 99;
    }

    public static void  changePerson(Person person) {
        person = new Person ("Коба", "Владимир");
    }

    public static void changePersonName(Person person) {
        person.name = "Коба";
        person.surname = "Владимир";
    }
}