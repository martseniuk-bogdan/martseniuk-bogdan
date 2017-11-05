package com.company.lessons12.clothes;

public class Atelier {
    public static void dressMen(Clothes[] clothes) {
        for (Clothes clothing : clothes) {
            if (clothing instanceof MensClothing) {
                ((MensClothing) clothing).dressMen();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        for (Clothes clothing : clothes) {
            if (clothing instanceof WomensClothing) {
                ((WomensClothing) clothing).dressWomen();
            }
        }
    }
}
