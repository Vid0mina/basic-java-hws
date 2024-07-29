package ru.ushakova.java.basic.hws;

import lombok.*;

@Getter
@ToString(includeFieldNames = true)
@AllArgsConstructor
@EqualsAndHashCode
@RequiredArgsConstructor
public class Person {

    private final String name;
    private final Position position;
    private Long id;

}
