package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Person person = new Person("Мария", "Иванова", 22);

        Gson gson = new Gson();

        // Сериализация объекта — преобразование объекта `Person` в строку JSON
        String jsonString = gson.toJson(person);

        System.out.println("Конвертировали Person  в json\n" + jsonString);

        // Десериализовать объект — преобразовать строку JSON обратно в объект `Person`
        Person p = gson.fromJson(jsonString, Person.class);

        System.out.println("\nКонвертировали json в персон:\n"
                + p.toString());

    }
}