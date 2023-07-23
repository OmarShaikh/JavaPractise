package com.excersise.methodsandclasses;

public class MethodsAndClasses {
    public static void main(String[] args) {

        System.out.println("*************** Method Overloading ***************");
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);

        System.out.println("*************** Automatic Type Conversion ***************");
        OverloadDemo1 ob1 = new OverloadDemo1();
        int i = 88;

        ob1.test();
        ob1.test(10,20);
        ob1.test(i);
        ob1.test(123.2);

        System.out.println("*************** Overloading Constructors ***************");
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);

        System.out.println("*************** Using Objects as Parameters ***************");
        Box mybox4 = new Box(10,20,15);
        Box mybox5 = new Box();
        Box mybox6 = new Box(7);
        Box myclone = new Box(mybox4);

        vol = mybox4.volume();
        System.out.println("Volume of mybox4 is " + vol);
        vol = mybox5.volume();
        System.out.println("Volume of mybox5 is " + vol);
        vol = mybox6.volume();
        System.out.println("Volume of mybox6 is " + vol);
        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);

        System.out.println("*************** Argument Passing ***************");
        System.out.println("*************** Call by value ***************");
        ArgumentPassing obj = new ArgumentPassing();
        int a = 15, b = 20;
        System.out.println("a and b before call " + a + " " + b);
        obj.meth(a,b);
        System.out.println("a and b after call " + a + " " + b);

        System.out.println("*************** Call by reference ***************");
        ArgumentPassingByReference obj1 = new ArgumentPassingByReference(15,20);
        System.out.println("obj.a and obj.b before call : " + obj1.a + " " + obj1.b);
        obj1.meth(obj1);
        System.out.println("obj.a and obj.b after call : " + obj1.a + " " + obj1.b);

        System.out.println("*************** Returning Objects ***************");
        ReturningObjects roob1 = new ReturningObjects(2);
        ReturningObjects roob2;

        roob2 = roob1.incrByTen();
        System.out.println("ob1.a : " + roob1.a);
        System.out.println("ob2.a : " + roob2.a);

        roob2 = roob2.incrByTen();
        System.out.println("ob2.a after second increase: " + roob2.a);

        System.out.println("*************** Recursion ***************");
        System.out.println("*************** Factorial ***************");
        Factorial f = new Factorial();

        System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 4 is " + f.fact(4));
        System.out.println("Factorial of 5 is " + f.fact(5));
        System.out.println("*************** Another example using recursion ***************");
        RecTest obj3 = new RecTest(10);
        for(int p=0; p<10; p++) obj3.values[p] = p;
        obj3.printArray(10);

        System.out.println("*************** Stack using Access Control ***************");
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for(i = 0; i < 10; i++) mystack1.push(i);
        for(i =10; i < 20; i++) mystack2.push(i);

        System.out.println("Stack in mystack1: ");
        for(i=0; i<10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2: ");
        for (i=0; i<10; i++)
            System.out.println(mystack2.pop());


        System.out.println("*************** Static variables, methods and blocks ***************");
        UseStatic obj4 = new UseStatic();
        UseStatic.meth(42);

        System.out.println("*************** Array Revisited ***************");
        System.out.println("*************** Improved Stack ***************");
        ImprovedStack stk1 = new ImprovedStack(5);
        ImprovedStack stk2 = new ImprovedStack(8);
        for(i=0; i<5; i++) stk1.push(i);
        for(i=0; i<8; i++) stk2.push(i);

        System.out.println("Stack in stack1: ");
        for(i = 0; i<5; i++)
            System.out.println(stk1.pop());

        System.out.println("Stack in stack2: ");
        for(i = 0; i<8; i++)
            System.out.println(stk2.pop());

        System.out.println("*************** Nested and Inner Classes ***************");
        Outer outer = new Outer();
        outer.test();

        System.out.println("*************** Exploring String Class ***************");
        System.out.println("*************** Simple Methods ***************");
        String strOb1 = "First String";
        String strOb2 = "Second String";
        String strOb3 = strOb1 + "and" + strOb2;

        System.out.println(strOb1);
        System.out.println(strOb2);
        System.out.println(strOb3);

        System.out.println("*************** More String Methods ***************");

        System.out.println("Length of strOb1: " + strOb1.length());
        System.out.println("Char at index 3 in strOb1: " + strOb1.charAt(3));

        if(strOb1.equals(strOb2))
            System.out.println("strOb1==strOb2");
        else
            System.out.println("strOb1 != strOb2");

        if(strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");

        System.out.println("*************** Variable Length Arguments ***************");
        VarArgs.vaTest(10);
        VarArgs.vaTest(1,2,3);
        VarArgs.vaTest();
        System.out.println("*************** Variable Length Arguments with Normal Arguments ***************");
        VarArgs.vaTest2("One vararg", 10);
        VarArgs.vaTest2("Three varargs", 1,2,3);
        VarArgs.vaTest2("No Varargs");

        System.out.println("*************** Overloading Variable Length Arguments ***************");
        VarArgsOverloading.vaTest(1,2,3);
        VarArgsOverloading.vaTest("Testing", 10,20);
        VarArgsOverloading.vaTest(true,false,false);

    }
}


class OverloadDemo {
    public void test() {
        System.out.println("No parameters");
    }

    public void test(int a) {
        System.out.println("a: " + a);
    }

    public void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    public double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}

class OverloadDemo1 {
    public void test() {
        System.out.println("No parameters");
    }

    public void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    public void test(double a) {
        System.out.println("Inside test (double) a: " + a);
    }
}
class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    public double volume() {
        return width*height*depth;
    }
}
class ArgumentPassing {
    public void meth(int i, int j) {
        i *= 2;
        j /=2;
    }

}

class ArgumentPassingByReference {
    int a, b;

    ArgumentPassingByReference(int i, int j) {
        a = i;
        b = j;
    }
    public void meth(ArgumentPassingByReference o) {
        o.a *= 2;
        o.b /=2;
    }
}

class ReturningObjects {
    int a;
    ReturningObjects(int i) {
        a = i;
    }

    public ReturningObjects incrByTen() {
        ReturningObjects temp = new ReturningObjects(a+10);
        return temp;
    }
}
class Factorial {
    public int fact (int n) {
        int result;
        if(n==1) return 1;
        result = fact(n-1) * n ;
        return result;
    }
}
class RecTest {
    int values[];
    RecTest(int i){
        values = new int[i];
    }
    public void printArray(int i) {
        if (i ==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "]" + values[i-1]);
    }
}

class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    public void push(int item) {
        if(tos==9){
            System.out.println("Stack is full");
        } else
            stck[++tos] = item;

    }
    public int pop() {
        if(tos < 0 ) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return stck[tos--];
    }
}
class UseStatic {
    static int a = 3;
    static int b;

     static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }


}
class ImprovedStack {
    private int stck[];
    private int tos;

    ImprovedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push( int item ) {
        if (tos == stck.length-1)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;

    }

    public int pop() {
        if( tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class Outer {
    int outer_x = 100;
    public void test() {
        for(int i=0; i<10; i++){
            class Inner {
                void display(){
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
class VarArgs {
    public static void vaTest(int ...v){
        System.out.print("Number of args: " + v.length + "Contents: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void vaTest2(String msg, int ...v){
        System.out.print(msg + v.length + "Contents: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
}
class VarArgsOverloading {
    public static void vaTest(int ... v) {
        System.out.print("vaTest(int...): " + "Number of args: " + v.length + " Contents: ");
        for(int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ..." + "Number of args: " + v.length + " Contents: ");
        for(boolean x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void vaTest(String msg, int ... v) {
        System.out.print("vaTest(String msg, int ...): " + msg + v.length + " Contents: ");
        for(int x: v)
            System.out.print(x + " ");
        System.out.println();
    }
}