package com.company.lessons12.clothes;

/**
 * a) Создать перечисление, содержащее размеры одежды (XXS,XS,S,M,L). Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
 * Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
 * Также перечисление должно содержать числовое значение euroSize, соответствующее каждому размеру. Создать конструктор, принимающий на вход euroSize.
 */
public enum ClothesSize {
    XXS(10) {
        public String getDescription() {
            return "kinder size";
        }
    }, XS(15), S(20), M(30), L(40);

    ClothesSize() {
    }

    ClothesSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "kinder size";
    }

    private int euroSize;
}
