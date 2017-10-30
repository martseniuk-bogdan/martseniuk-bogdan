package com.company.lessons10;

import com.company.lessons10.flowers.Carnations;
import com.company.lessons10.flowers.Flower;
import com.company.lessons10.flowers.Roses;
import com.company.lessons10.flowers.Tulips;

public class FlowersMain {
    public static void main(String[] args) {
        Flower flower[]=new Flower[3];
        flower[0]=new Roses("Holland",10,50);
        flower[1]=new Carnations("Russia",15,22);
        flower[2]=new Tulips("Ukraine",10, 15);
        int allCost=0;
        for (Flower tmp:flower){
            allCost+=tmp.costFlowers();
        }
        System.out.println("Стоимость первого букета= "+allCost);
        System.out.println("Всего цветов в букете= "+(Roses.count+Carnations.count+Tulips.count));
        clear();

        Flower flower2[]=new Flower[4];
        flower2[0]=new Roses("Holland",10,77);
        flower2[1]=new Carnations("Russia",15,77);
        flower2[2]=new Tulips("Ukraine",10, 77);
        flower2[3]=new Tulips("Ukraine",1, 55);

        allCost=0;
        for (Flower tmp:flower2){
            allCost+=tmp.costFlowers();
        }
        System.out.println("Стоимость второго букета= "+allCost);
        System.out.println("Всего цветов в букете= "+(Roses.count+Carnations.count+Tulips.count));
        clear();

        Flower flower3[]=new Flower[5];
        flower3[0]=new Roses("Holland",10,77);
        flower3[1]=new Carnations("Russia",15,77);
        flower3[2]=new Tulips("Ukraine",10, 77);
        flower3[3]=new Tulips("Ukraine",1, 55);
        flower3[4]=new Tulips("Russia",15,1265);

        allCost=0;
        for (Flower tmp:flower3){
            allCost+=tmp.costFlowers();
        }
        System.out.println("Стоимость третьего букета= "+allCost);
        System.out.println("Всего цветов в букете= "+(Roses.count+Carnations.count+Tulips.count));
        clear();
    }
    public static void clear(){
        Roses.count=0;
        Tulips.count=0;
        Carnations.count=0;
    }
}
