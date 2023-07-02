package com.excersise.controlstatements;

public class ControlStatements {

    /* if */
    /* simple if */
    static void ifStatement() {
        int a = 5, b = 10;
        if (a < b) a = 0;
        else b = 0;
        System.out.println("a: " + a + " b: " + b);
    }

    static void ifStatementWithoutConditional() {
        boolean dataAvailable = true;
        if (dataAvailable) System.out.println("Data available!");
        else System.out.println("Data not available!");
    }

    static void ifStatementMultiLine() {
        int bytesAvailable = 10;
        if (bytesAvailable > 0) {
            System.out.println("Bytes: " + bytesAvailable );
            bytesAvailable--;
        } else {
            System.out.println("Bytes not available!");
            bytesAvailable = 10;
        }
    }

    static void nestedIfs() {
        int i = 10;
        int j = 25, k= 0, a, c;
        if (i == 10){
            if (j < 20) a = 5;
            if (k > 100) c = 10;
        } else System.out.println("Inside else statement");
    }

    static void ifElseIfLadder() {
        int month = 4;
        String season;

        if (month ==12 || month == 1 || month == 2)
            season = "Winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "Autumn";
        else
            season = "Bogus month!" ;

        System.out.println("April is in the " + season + ".");
    }

    /* switch statement */
    static void switchStatement() {
        for ( int i = 0; i<6 ; i++ ) {
            switch(i) {
                case 0 :
                    System.out.println("i is zero.");
                    break;
                case 1 :
                    System.out.println("i is one.");
                    break;
                case 2 :
                    System.out.println("i is two.");
                    break;
                case 3 :
                    System.out.println("i is three.");
                    break;
                default :
                    System.out.println("i is greater than three.");
            }
        }
    }

    static void switchStatementOptionalBreak() {
        int month = 4;
        String season;

        switch(month) {
            case 12:
            case 1 :
            case 2 :
                season = "Winter";
                break;
            case 3 :
            case 4 :
            case 5 :
                season = "Spring";
                break;
            case 6 :
            case 7 :
            case 8 :
                season = "Summer";
                break;
            case 9 :
            case 10 :
            case 11 :
                season = "Autumn";
                break;
            default :
                season = "Bogus month!";
        }

        System.out.println("April is in the " + season + ".");

    }

    static void nestedSwitch() {
        int count = 1;
        int target = 0;
        switch(count) {
            case 1:
                switch (target) {
                    case 0:
                        System.out.println("Target is zero");
                        break;
                    case 1:
                        System.out.println("Target is one");
                        break;
                }
                break;
            case 2:
                System.out.println("Outer switch, this will not execute");
        }
    }

    /* iteration statements */
    /* while loop */

    static void whileLoop() {
        int n = 10;

        while (n>0) {
            System.out.println("tick" + n);
            n--;
        }
    }

    /* non-executable while loop */
    static void whileLoopWithFalseCondition(){
        int a = 10, b = 20;
        while (a > b) {
            System.out.println("This will not be displayed");
        }
    }

    static void whileLoopNoBody() {
        int i = 100, j = 200;

        while (++i < --j);
        System.out.println("Midpoint is" + i);
    }

    /* do while loop */
    static void doWhileLoop() {
        int n = 10;

        do {
            System.out.println("tick" + n);
            n--;
        } while (n > 0);
    }

    static void doWhileLoopMenu() {
        char choice = '2';
        do {
            System.out.println("Help on:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for \n");
        } while ( choice < '1' || choice > '5');

        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("The if: \n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch: \n");
                System.out.println("switch(expression) {");
                System.out.println("    case constant:");
                System.out.println("        statement sequence");
                System.out.println("        break;");
                System.out.println("        //");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The while: \n");
                System.out.println("while (condition) statement;");
                break;
            case '4':
                System.out.println("The do-while: \n");
                System.out.println("do {");
                System.out.println("    statement;");
                System.out.println("} while (condition);");
                break;
            case '5':
                System.out.println("The for: \n");
                System.out.println("for(init; condition; iteration");
                System.out.println("statement;");
                break;
        }
    }

    /* for loop */

    static void forLoop(){
        int n;
        for(n=10; n > 0; n--)
            System.out.println("tick" + n);
    }

    static void forLoopDeclarationInside(){
        for(int n=10; n > 0; n--)
            System.out.println("tick" + n);
    }

    static void forLoopTestPrimes(){
        int num;
        boolean isPrime = true;
        num = 14;

        for(int i=2; i <= num/i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Prime");
        else System.out.println(("Not Prime"));
    }

    static void forLoopUsingComma() {
        int a,b;

        for(a=1, b=4; a<b; a++, b--) {
            System.out.println("a= " + a );
            System.out.println("b= " + b );
        }
    }

    static void forLoopVariation() {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ){
            System.out.println("i is " + i);
            if ( i == 10) done = true;
            i++;
        }
    }

    /* for-each loop */

    static void forEachLoop() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int x : nums) {
            System.out.println("Value is " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }

    static void forEachLoopBreak() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int x : nums) {
            System.out.println("Value is " + x);
            sum += x;
            if ( x == 5 ) break;
        }
        System.out.println("Summation: " + sum);
    }

    static void forEachLoopReadOnly() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for( int x: nums) {
            System.out.println(x + " ");
            x = x* 10;
        }

        System.out.println();

        for(int x : nums)
            System.out.println(x + " ");
        System.out.println();
    }

    static void forEachLoop2DArray() {
        int sum = 0;
        int nums[][] = new int[3][5];
        for(int i=0; i <3; i++)
            for(int j=0; j<5; j++)
                nums[i][j] = (i+1)*(j+1);
        for(int x[] : nums) {
            for(int y : x) {
                System.out.println("Value is:" + y);
            }
        }
        System.out.println("Summation is: " + sum);
    }

    static void forEachLoopSearch() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int val = 5;
        boolean found = false;

        for(int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Value found!");
    }

    static void nestedLoops() {
        int i, j;
        for(i=0; i<10; i++){
            for(j=0; j<10; j++)
                System.out.print(".");
            System.out.println();
        }
    }

    /* jump statements */
    /* using break as jump statement */

    static void breakForLoop() {
        for(int i = 0; i<100; i++){
            if (i == 10) break;
            System.out.println("i: " + i);
        }
        System.out.println("Loop complete");
    }

    static void breakWhileLoop() {
        int i = 0;

        while(i<100) {
            if( i == 10) break;
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop complete");
    }

    static void breakNestedLoops() {
        for(int i=0; i<3; i++){
            System.out.print("Pass" + i + ": ");
            for(int j=0; j<100; j++){
                if(j==10) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loop complete");
    }

    static void breakLabel() {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Before the break");
                    if (t) break second;
                    System.out.println("This wont execute!");
                }
                System.out.println("This wont execute!");
            }
            System.out.println("This is after second block");
        }
    }

    static void breakLabelNestedLoops() {
        outer: for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
            for(int j=0; j<100; j++) {
                if(j==10) break outer;
                System.out.print(j + " ");
            }
            System.out.println("This will not print");
        }
        System.out.println("Loop complete");
    }

    /* continue statement */

    static void continueStatement() {
        for ( int i=0; i<10; i++ ) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }
    }

    static void continueStatementLabel() {
        outer: for(int i=0; i<10; i++){
            for(int j=0; j<10; j++) {
                if(j > i){
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i*j));
            }
        }
        System.out.println();
    }

    /* return statement */
    static void returnStatement() {
        boolean t = true;
        System.out.println("Before the return");
        if(t) return;
        System.out.println("This wont execute");
    }

    public static void main(String[] args) {
        System.out.println("***************** JAVA SELECTION STATEMENTS *****************");
        System.out.println("***************** if statement *****************");
        ifStatement();
        System.out.println("***************** if statement without conditional *****************");
        ifStatementWithoutConditional();
        System.out.println("***************** if statement multi line *****************");
        ifStatementMultiLine();
        System.out.println("***************** nested if statement *****************");
        nestedIfs();
        System.out.println("***************** if-else-if ladder *****************");
        ifElseIfLadder();
        System.out.println("***************** switch statement *****************");
        switchStatement();
        System.out.println("***************** switch statement with optional break *****************");
        switchStatementOptionalBreak();
        System.out.println("***************** nested switch statement *****************");
        nestedSwitch();
        System.out.println("***************** JAVA ITERATION STATEMENTS *****************");
        System.out.println("***************** while loop *****************");
        whileLoop();
        System.out.println("***************** while loop with false condition *****************");
        whileLoopWithFalseCondition();
        System.out.println("***************** while loop with no body *****************");
        whileLoopNoBody();
        System.out.println("***************** do-while loop *****************");
        doWhileLoop();
        System.out.println("***************** do-while loop menu selection *****************");
        doWhileLoopMenu();
        System.out.println("***************** for loop *****************");
        forLoop();
        System.out.println("***************** for loop declaration inside *****************");
        forLoopDeclarationInside();
        System.out.println("***************** for loop test for primes *****************");
        forLoopTestPrimes();
        System.out.println("***************** for loop using commas *****************");
        forLoopUsingComma();
        System.out.println("***************** for loop variation *****************");
        forLoopVariation();
        System.out.println("***************** for-each loop *****************");
        forEachLoop();
        System.out.println("***************** for-each loop with break *****************");
        forEachLoopBreak();
        System.out.println("***************** for-each loop read only *****************");
        forEachLoopReadOnly();
        System.out.println("***************** for-each loop 2D array *****************");
        forEachLoop2DArray();
        System.out.println("***************** for-each loop search *****************");
        forEachLoopSearch();
        System.out.println("***************** nested loops *****************");
        nestedLoops();
        System.out.println("***************** JAVA JUMP STATEMENTS *****************");
        System.out.println("***************** break in for loop *****************");
        breakForLoop();
        System.out.println("***************** break in while loop *****************");
        breakWhileLoop();
        System.out.println("***************** break in nested loop *****************");
        breakNestedLoops();
        System.out.println("***************** break with label *****************");
        breakLabel();
        System.out.println("***************** break with label in nested loop *****************");
        breakLabelNestedLoops();
        System.out.println("***************** continue statement *****************");
        continueStatement();
        System.out.println("***************** continue statement with label *****************");
        continueStatementLabel();
        System.out.println("***************** return statement *****************");
        returnStatement();

    }
}
