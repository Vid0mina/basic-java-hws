package ru.ushakova.java.basic.hws;

import lombok.Getter;

public enum Position {

    MANAGER(1), DIRECTOR(1), DRIVER(0), ENGINEER(0), SENIOR_MANAGER(1),
    DEVELOPER(0), QA(0), JANITOR(0), PLUMBER(0), BRANCH_DIRECTOR(1), JUNIOR_DEVELOPER(0);

    @Getter
    private final int levelCode;

    Position(int levelCode) {
        this.levelCode = levelCode;
    }

}