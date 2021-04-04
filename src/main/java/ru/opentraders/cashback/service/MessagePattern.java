package ru.opentraders.cashback.service;

public enum MessagePattern {
    CHOICE ("Ваш наилучший выбор: карта \"%s\""),
    ECONOMY (", экономия за год составит примерно: %d рублей.");

    private final String name;

    MessagePattern(String s) {
        this.name = s;
    }

    public String getValue() {
        return name;
    }

}
