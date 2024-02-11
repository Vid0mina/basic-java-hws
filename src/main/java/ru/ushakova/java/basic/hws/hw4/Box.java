package ru.ushakova.java.basic.hws.hw4;

public class Box {

    private final Integer size;
    private String color;
    private String stuff;

    public Box(Integer size, String color) {
        this.size = size;
        this.color = color;
        System.out.println("Коробка создана с размером = " + size + " и её цвет " + color + ".");
    }

    public Integer getSize() {
        System.out.println("Размер коробки " + size + ".");
        return size;
    }

    public String getColor() {
        System.out.println("Цвет коробки " + color + ".");
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Теперь коробка имеет цвет " + color + ".");
    }

    public Boolean isOpen(Boolean state) {
        if (state) {
            System.out.println("Коробка открыта.");
        } else {
            System.out.println("Коробка закрыта.");
        }
        return state;
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff, Boolean isOpen) {
        if (isOpen) {
            if (this.stuff != null) {
                System.out.println("Коробка уже занята предметом " + this.stuff + ". Очистите её, чтобы положить новый.");
            } else {
                this.stuff = stuff;
                System.out.println("Вы только что положили в коробку " + stuff + ".");
            }
        } else {
            System.out.println("Коробка закрыта. Откройте её, чтобы положить предмет.");
        }

    }

    public void throwAwayStuff(Boolean isOpen) {
        if (isOpen) {
            if (this.stuff != null) {
                this.stuff = null;
            } else {
                System.out.println("Нечего выкидывать. Коробка уже пуста.");
            }
        }
        System.out.println("Предмет извлечён. Коробка теперь пуста.");
    }

    public String showBoxInfo() {
        return "***Информация о коробке***\nКоробка имеет цвет " + color + ".\n" + "Размер коробки равен " + size + ".\n" + "В коробке лежит " + stuff + ".";
    }

}
