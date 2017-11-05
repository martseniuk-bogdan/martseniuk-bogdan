package com.company.lessons11.pckg2;

import com.company.lessons11.pckg1.Class1;

public class Class5  {
    public void method(){
        Class1 class1 = new Class1();
        class1.publicVar = 1;
        //class1.privateVar = 2; //Error
        //class1.defaultVar = 1; //Error
        //class1.protectedVar = 1; //Error
    }
}
