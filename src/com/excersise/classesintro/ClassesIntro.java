package com.excersise.classesintro;

public class ClassesIntro {
    public static void main(String[] args) {
        System.out.println("************* Simple Class *************");
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);

        System.out.println("************* Simple Class Multiple Objects *************");
        Box mybox1 = new Box();
        Box mybox2 = new Box();


        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume is " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);

        System.out.println("************* Class With Methods *************");

        BoxWithMethods mybox3 = new BoxWithMethods();
        BoxWithMethods mybox4 = new BoxWithMethods();


        mybox3.width = 10;
        mybox3.height = 20;
        mybox3.depth = 15;

        mybox4.width = 3;
        mybox4.height = 6;
        mybox4.depth = 9;

        mybox3.volume();
        mybox4.volume();

        System.out.println("************* Class With Method Returns Value *************");
        BoxWithReturn mybox5 = new BoxWithReturn();
        BoxWithReturn mybox6 = new BoxWithReturn();


        mybox5.width = 10;
        mybox5.height = 20;
        mybox5.depth = 15;

        mybox6.width = 3;
        mybox6.height = 6;
        mybox6.depth = 9;

        vol = mybox5.volume();
        System.out.println("Volume is " + vol);

        vol = mybox6.volume();
        System.out.println("Volume is " + vol);

        System.out.println("************* Class With Method Takes Parameter *************");
        BoxWithParameter mybox7 = new BoxWithParameter();
        BoxWithParameter mybox8 = new BoxWithParameter();

        mybox7.setDim(10,20,15);
        mybox8.setDim(3,6,9);

        vol = mybox7.volume();
        System.out.println("Volume is " + vol);
        vol = mybox8.volume();
        System.out.println("Volume is " + vol);


        System.out.println("************* Class With Constructor *************");
        BoxWithConstructor mybox9 = new BoxWithConstructor();
        BoxWithConstructor mybox10 = new BoxWithConstructor();

        vol = mybox9.volume();
        System.out.println("Volume is " + vol);
        vol = mybox10.volume();
        System.out.println("Volume is " + vol);

        System.out.println("************* Class With Parameterized Constructor *************");
        BoxWithParameterizedConstructor mybox11 = new BoxWithParameterizedConstructor(10,20,15);
        BoxWithParameterizedConstructor mybox12 = new BoxWithParameterizedConstructor(3,6,9);

        vol = mybox11.volume();
        System.out.println("Volume is " + vol);
        vol = mybox12.volume();
        System.out.println("Volume is " + vol);

        System.out.println("************* Stack using Class *************");
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for ( int i=0; i < 10 ; i++)
            mystack1.push(i);
        for (int i=10; i <20; i++)
            mystack2.push(i);

        System.out.println("Stack in mystack1: ");
        for(int i=0; i<10; i++){
            System.out.println(mystack1.pop());
        }

        System.out.println("Stack in mystack2");
        for(int i=0; i<10; i++){
            System.out.println(mystack2.pop());
        }
    }
}

class Box {
    double width;
    double height;
    double depth;
}

class BoxWithMethods {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Volume is");
        System.out.println(width * height * depth);
    }
}

class BoxWithReturn {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}

class BoxWithParameter {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxWithConstructor {
    double width;
    double height;
    double depth;

    BoxWithConstructor() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWithParameterizedConstructor {
    double width;
    double height;
    double depth;

    BoxWithParameterizedConstructor(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push( int item) {
        if ( tos == -9)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    int pop(){
        if( tos < 0 ) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}
