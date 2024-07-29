public class Beginner {

    
        public static void main(String[] args) {
            // TODO Auto-generated method stub
        System.out.println("This is a simple Java Program");
        
    //	int a = 1345;
    //	int b = 23445;
    //	
    //	if (a + a < b) {
    //		System.out.println("That shit ain't the same amount mofo!");
    //	} else if (b + a < a){
    //		System.out.println("What are you thinking poopee face!");
    //	} else {
    //		System.out.println("This is your last possible outcome foolio!");
    //	}
    //	
    //	
    //	int marks = 72;
    //	
    //	if (marks < 50) {
    //		System.out.println("You failed and got an F!");
    //	} else if (marks >= 50 && marks < 59){
    //		System.out.println("You are slightly better but got an F again!");
    //	} else if (marks >= 60 && marks <69){
    //		System.out.println("You failed and got an D!");
    //	}else if (marks >= 70 && marks <79){
    //		System.out.println("C, OMG!");
    //	}else if (marks >= 80 && marks <89){
    //		System.out.println("Pretty darn good with a B!");
    //	}else {
    //		System.out.println("YOu are so damn smart!");
    //	}
    //	
        
    //	int number =-13;
    //	if(number>0) {
    //		System.out.println("POSITIVE NUMBER");
    //	} else if(number<0) {
    //		System.out.println("NEGATIVE NUMBER");
    //	} else {
    //		System.out.println("ZERO NUMBER");
    //
    //	}
        
    //	LOOPING STATEMENTS ? Repeat statements
        
    //	int num = 0;
    //	
    //	while (num <= 4) {
    //		System.out.println(num);
    //		
    //		num++;
    //	}
    //	
    //	FOR LOOP
        
    //	for (int i = 0; i < 11; i++) {
    //		System.out.println(i);
    //
    //	}
    //	
    //	for (int i = 10; i > 0; i--) {
    //		System.out.println(i);
    //
    //	}
    //	
    //	pattern problem/ nested for loop
    //	int n =5;
    //	
    //	for (int i = 0; i < n; i++) {
    //		for (int j = 0; j <= i; j++) {
    //		System.out.println("*");
    //		} 
    //		System.out.println();
    //	}
        
    //	operators
    //	arithmetic operators +,-, *, /
        
    //	int r = 10;
    //	int s = 20;
    //	
    //	System.out.println(r * s);
    
        
    //	Relational operators- relationship between 2 <, >, =, ==
        
    //	int f = 10;
    //	int g = 20;
    //	
    //	System.out.println(f <= g);
    //	System.out.println(f != g);
    //	System.out.println(f == g);
    
    //	logical operators AND, OR && ||
        
    //	boolean h = true;
    //	boolean k = false;
    //	
    //	System.out.println(h && k );
    //	System.out.println(h || k );
    //	System.out.println(k || k );
    //
    //	
        
    //	Arrays in Java
    //	Store multiple elements of same value type
        
    //	char[] l = new char[5];
    //	
    //	l[0]='a';
    //	l[1]='b';
    //	l[2]='c';
    //	l[3]='d';
    //	l[4]='e';
    //
    //	for(int m=0;m<5;m++) {
    //		System.out.println(l[m]);
    //	}
    //	
        
    //	new syntax
    //	
    //	int[] t = new int[10];
    //	
    //	for(int u=0;u<10;u++) {
    //		t[u] = u;
    //	}
    //	
    //	for(int u=0;u<10;u++) {
    //		System.out.println(t[u]);
    //	}
        
        
        
        
    //	adding 2 arrays in java
    //	adding values in specific value space
        
    //	int v[] = new int[5];
    //	int w[] = new int[5];
    //	int x[] = new int[5];
    //	
    //	int num = 5;
    //	
    //	for(int p=0;p<5;p++) {
    //		v[p]=p;
    //		
    //	}
    //	
    //	for(int p=0;p<5;p++) {
    //		w[p]=num;
    //		num++;
    //		
    //	}
    //
    //	System.out.print("Values of array 'V':");
    //	for(int p=0;p<5;p++) {
    //		System.out.print(v[p] +  ' ');
    //
    //	}
    //
    //	System.out.print("\nValues of array 'W':");
    //	for(int p=0;p<5;p++) {
    //		System.out.print(w[p] +  ' ');
    //
    //	}
    //	
    //	
    //	for(int p=0;p<5;p++) {
    //		x[p] = v[p] + w[p];
    //		
    //	}
    //	
    //	System.out.print("\nValues of array 'X':");
    //	for(int p=0;p<5;p++) {
    //		System.out.print(x[p] +  ' ');
    //
    //	}
    //	
    //	
    //	
        
    //	MULTI-dimensional Array
        
        int a[][]  = new int[3][3];
        int num=0;
        
        for(int i=0;i<3;i++ ) {
            for(int j=0;j<3;j++) {
                a[i][j]=num;
                ++num;
            }
        }
        
        for(int i=0;i<3;i++ ) {
            for(int j=0;j<3;j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(' ');
    
        }
        
        
        
        }
    
    }
    
    // data types (integer, boolean, floats, strings)
    

