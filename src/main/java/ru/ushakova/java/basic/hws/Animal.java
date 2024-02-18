package ru.ushakova.java.basic.hws;

public abstract class Animal {

    protected String name;
    protected Integer runningSpeed;
    protected Integer swimmingSpeed;
    protected Integer stamina;

    public Animal(String name, Integer runningSpeed, Integer swimmingSpeed, Integer stamina) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
    }

    public Integer getRunningSpeed() {
        return runningSpeed;
    }

    public Integer getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public Integer getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public Integer run(int distance) {
        stamina = stamina - distance;
        if (stamina > 0) {
            System.out.println("Выносливость животного " + name + " составляет " + stamina + " единиц.");
            return distance / runningSpeed;
        } else {
            System.out.println("У животного " + name + " появилось состояние усталости.");
            return -1;
        }
    }

    public abstract Integer swim(int distance);

    public void info() {
        System.out.println("Имя = '" + name + '\'' +
                ", \nСкорость бега = " + runningSpeed +
                ", \nСкорость плавания = " + swimmingSpeed +
                ", \nВыносливость = " + stamina);
    }

}
