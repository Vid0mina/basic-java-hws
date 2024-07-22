package ru.ushakova.java.basic.hws;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(includeFieldNames = true)
@AllArgsConstructor
@EqualsAndHashCode
public class Person {

    private String name;
    private Position position;
    private Long id;

}
