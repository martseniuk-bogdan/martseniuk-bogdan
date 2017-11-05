package com.company.lessons12;

import com.company.lessons12.clothes.*;

public class ClothesMain {
    public static void main(String[] args) {
        Clothes[] clothes=new Clothes[5];
        clothes[0]=new Tshirt(ClothesSize.M,200,"red");
        clothes[1]=new Tie(ClothesSize.L,300,"black");
        clothes[2]=new Pants(ClothesSize.XXS,300,"blue");
        clothes[3]=new Skirt(ClothesSize.XS,255,"yellow");
        clothes[4]=new Tshirt(ClothesSize.S,500,"black");
        System.out.println("Одеваем М");
        Atelier.dressMen(clothes);
        System.out.println("Одеваем Ж");
        Atelier.dressWomen(clothes);
    }
}
