import java.util.Scanner;

public class patternquestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
////      rectungular pattern.
//
////        for (int i = 1; i <= r; i++) {
////            for (int j = 1; j <= c  ; j++) {
////                System.out.print("*");
////
////            }
////            System.out.println();
////        }
//
////        hollow rectungular pattern
//
////        for (int i = 1; i <=r ; i++) {
////            for (int j = 1; j <=c ; j++) {
////                if(i == 1 || i == r || j == 1 || j == c)
////                    System.out.print("*");
////                else
////                    System.out.print(" ");
////            }
////            System.out.println();
////
////        }
//
////   right triangle pattren.
////        for (int i = 0; i <= r ; i++) {
////            for (int j = 0; j <= i; j++) {
////                System.out.print("*");
////
////            }
////            System.out.println();
////
////        }
//
////    reverse right triangle pattren.
////        for (int i = 1; i <=r ; i++) {
////            for (int j = 1; j <= (r + 1 - i) ; j++) {
////                System.out.print("*");
////
////            }
////            System.out.println();
////
////        }
////        Method two
////        for (int i = r; i >= 1  ; i--) {
////            for (int j = 1; j <= i  ; j++) {
////                System.out.print("*");
////
////            }
////            System.out.println();
////
////        }
////        piramind pattern.
//
////
////    for (int i=1; i<=r; i++){
////
////        for (int j=1; j<= (r-i); j++){
////            System.out.print(" ");
////        }
////        for(int k=1; k<= (2*i - 1); k++){
////            System.out.print("*");
////        }
////
////        System.out.println();
////    }
//
//
////  Numerical rectungular
//
//
////        for (int i =1 ; i <=r; i++) {
////            for (int j=i; j<=r; j++){
////                System.out.print(j);
////            }
////            for(int k=1; k<= i-1; k++){
////                System.out.print(k);
////            }
////            System.out.println();
////
////        }
//
//////        rectungular number pattern
//
////        for (int i = 1; i <=r ; i++) {
////            for (int j=1; j<=c; j++){
////                System.out.print(j);
////            }
////            System.out.println();
////        }
//
////        for (int i = 0; i <=r ; i++) {
////            for (int j = 1; j <=c ; j++) {
////                if((i+j) % 2 == 0){
////                    System.out.print(2);
////                } else {
////                    System.out.print(1);
////                }
////
////            }
////            System.out.println();
////       }
////
//
////        for (int i = 1; i <=r ; i++) {
////
////            for (int j=1; j<=i ; j++ ){
////                System.out.print(j);
////            }
////
////            System.out.println();
////
////        }
//
////
////        for (int i = 1; i <=r ; i++) {
////
////            for (int j = 1; j <= (r-i) ; j++) {
////                System.out.print(" ");
////            }
////            for(int k=1; k<= i; k++){
////                System.out.print(k);
////            }
////            for (int l = i-1; l >=1 ; l--) {
////                System.out.print(l);
////
////            }
////            System.out.println();
////        }
//
//
////        for (int i = 1; i <=r ; i++) {
////            for (int j = 1; j <=i ; j++) {
////                System.out.print("*");
////
////            }
////            System.out.println();
////        }
////        for (int i = r; i >=1 ; i--) {
////            for (int j = 1; j <=i ; j++) {
////                System.out.print("*");
////
////            }
////            System.out.println();
////        }
////
////
//
////
////        for (int i = 1; i <=r ; i++) {
////
//////            print spaces
////            for (int j = 1; j <=(r-i) ; j++) {
////                System.out.print(" ");
////
////            }
//////            print stars
////            for (int k = 1; k <=i ; k++) {
////                System.out.print("*");
////
////            }
////            System.out.println();
////        }
////
////
//
//
////        for (int i = 1; i <=r; i++) {
////
////            for (int j = 1; j <= i ; j++) {
////                System.out.print(" ");
////
////            }
////            for (int k =r; k >=i ; k--) {
////                System.out.print("*");
////
////            }
////
////            System.out.println();
////        }
//
//
////        for (int i = 1; i <=r ; i++) {
////
////            for (int j = 1; j <= i ; j++) {
////                System.out.print(i);
////
////            }
////            System.out.println();
////        }
//
//
////
////        for (int i = 1; i <=r ; i++) {
////
////            int  a = i - 1;
////
////            for (int j = 1; j <=i ; j++) {
////                System.out.print(j);
////            }
////            for (int j = 1; j <=(i-1) ; j++) {
////                System.out.print(a);
////                a--;
////
////            }
////
////            System.out.println();
////        }
//
//
////        for (int i = 1; i <=r ; i++) {
////
////
////            for (int j = i; j <=r; j++) {
////                System.out.print(" ");
////            }
////
////            for (int j = 1; j <= (2*i - 1) ; j++) {
////                if(i == r || j==1 || j==(2*i -1)){
////                    System.out.print(i);
////                } else {
////                    System.out.print(" ");
////                }
////
////            }
////
////            System.out.println();
////        }
//
//
////        for (int i = 1; i <=r ; i++) {
////            int  a = 1;
////            for (int j = 1; j <=i ; j++) {
////                System.out.print(a);
////                a = a+2;
////
////
////            }
////            System.out.println();
////
////        }
//
//
////        for (int i = 1; i <=r ; i++) {
////            int a = 1;
////            for (int j = 1; j <=r ; j++) {
////                int d = a+64; //a = 96 , A=64;(ASCII Value)
////                char ch = (char)d;
////                System.out.print(ch);
////                a++;
////
////            }
////            System.out.println();
////
////        }
//
//
////        for (int i = 1; i <=r ; i++) {
////            int a = 1;
////            int   d = a+64;
////            char ch = (char)d;
////
////            for (int j = 1; j <=i ; j++) {
////                System.out.print(ch);
////                ch++;
////            }
////
////            System.out.println();
////
////        }
////
//
//        for (int i = 1; i <=r ; i++) {
////            int a = 1;
////            int   d = a+64;
////            char ch = (char)d;
////
////            for (int j = 1; j <=i ; j++) {
////                if(i % 2 == 0){
////                    System.out.print(ch);
////                    ch++;
////                } else {
////                    System.out.print(j);
////                }
////            }
////
////            System.out.println();
////
////        }
//
//
//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = 1; j <=r ; j++) {
//                if(i==3 || j== 3){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//            }
//
//            System.out.println();
//        }

//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = 1; j <=c ; j++) {
//                if(i==1 || j==1 || i==r || j== c){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//
//            System.out.println();
//        }


//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = 1; j <=r ; j++) {
//                if(i == j || i+j == (r+1)){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//
//
//
//            System.out.println();
//        }

//        int a = 1;
//        for (int i = 1; i <=r ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print( " " + a);
//                a = a+2;
//
//            }
//
//
//            System.out.println();
//        }


//        int a = 1;
//        for (int i = 1; i <=r ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print( " " + a);
//                a++;
//
//            }
//
//
//            System.out.println();
//        }

//        int  a ;
//        for (int i = 1; i<= r ; i++) {
//
//                if(i % 2 != 0){
//                    a = 1;
//                } else {
//                    a = 0;
//                }
//
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(a);
//                if(a == 0){
//                   a= 1;
//                } else {
//                    a =0;
//                }
//            }
//
//            System.out.println();
//        }

//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = 1; j <=i ; j++) {
//
//                if((i+j) % 2 ==0){
//                    System.out.print(1);
//                } else {
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }
//

//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j<=i ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//

//        for (int i = 1; i <=r ; i++) {
//
//
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=r ; j++) {
//                System.out.print("*");
//
//            }
//
//            System.out.println();
//        }


//        for (int i = 1; i <=r ; i++) {
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//
//            }
//            int a = 1;
//            int d = a+64;
//            char ch = (char)d;
//
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(ch);
//                ch++;
//
//            }
//
//            System.out.println();
//        }


//        for (int i = 1; i <=r ; i++) {
//
//
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//
//            }
//
//            for (int j = 1; j <=(2*i-1) ; j++) {
//                System.out.print("*");
//
//            }
//
//            System.out.println();
//        }


//
//        int nst = 1;
//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = 1; j <= nst ; j++) {
//                System.out.print("*");
//
//            }
//            nst = nst+2;
//
//
//            System.out.println();
//        }



//
//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=(2*i-1) ; j++) {
//                System.out.print(j);
//
//            }
//
//
//            System.out.println();
//        }
//

//

//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=(2*i-1) ; j++) {
//                System.out.print(j);
//
//            }
//
//
//            System.out.println();
//        }






//        for (int i = 1; i <=r ; i++) {
//            int a = i-1;
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            for (int j = 1; j <=i-1 ; j++) {
//                System.out.print(a);
//                a--;
//            }
//            System.out.println();
//        }


//
//        for (int i = 1; i <=r ; i++) {
//            int a = i-1;
//            for (int j = 1; j <=(r-i) ; j++) {
//
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                char ch = (char)(j+64);
//                System.out.print(ch);
//            }
//            for (int j = 1; j <=i-1 ; j++) {
//                char ch = (char)(a+64);
//                System.out.print(ch);
//                a--;
//            }
//            System.out.println();
//        }
//



//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=(2*i-1) ; j++) {
//                System.out.print("*");
//
//            }
//
//            System.out.println();
//        }
//        for (int i = (r-1); i >=1 ; i--) {
//
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=(2*i-1) ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }


//        for (int i = r; i >=1 ; i--) {
//
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <=(2*i-1) ; k++) {
//                if(k==1 || i==r || k==(2*i-1)){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.println();
//        }
//


//        for (int i = 1; i <=r ; i++) {
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=(2*i-1) ; j++) {
//                if(j==1 || j==(2*i-1)){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//        for (int i = r; i >=1 ; i--) {
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=(2*i-1) ; j++) {
//                if(j==1 || j==(2*i-1)){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//

//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = 1; j <i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j <=r ; j++) {
//                System.out.print("*");
//
//            }
//
//            System.out.println();
//        }


//
//        int nsp = 0;
//
//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = i; j <=r ; j++) {
//                System.out.print("*");
//            }
//
//            for (int j = 1; j <=nsp; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j <=r ; j++) {
//                System.out.print("*");
//            }
//            nsp = nsp + 2;
//            System.out.println();
//        }

//
//        int nsp = 1;
//        for (int i = 1; i <=(2*r-1) ; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//        for (int i = 1; i <=r ; i++) {
//
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <=nsp ; j++) {
//
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print("*");
//            }
//            nsp = nsp + 2;
//            System.out.println();
//        }
//
//

//        for (int i = 1; i <=(2*r-1) ; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
//        int nsp = 1;
//        for (int i = 1; i <=r ; i++) {
//            int  a= 1;
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(a);
//                a++;
//            }
//            for (int j = 1; j <=nsp ; j++) {
//                System.out.print(" ");
//                a++;
//            }
//
//            nsp = nsp + 2;
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(a);
//                a++;
//            }
//
//            System.out.println();
//        }

//
//        int a = 1;
//        int d = a+64;
//        int nsp = 1;
//        char ch = (char)d;
//        for (int i = 1; i <=(2*r-1) ; i++) {
//            System.out.print(ch);
//            ch++;
//        }
//        System.out.println();
//        for (int i = 1; i <=r ; i++) {
//            ch = 65;
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            for (int j = 1; j <=nsp ; j++) {
//                System.out.print(" ");
//                ch++;
//            }
//            nsp = nsp + 2;
//            for (int j = 1; j <=(r-i) ; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//
//            System.out.println();
//        }

//        for (int i = r; i >=r ; i--) {
//            for (int j = 1; j <=r ; j++) {
//                System.out.print(j);
//            }
//            for (int j = r-1; j >=1 ; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        int nsp = 1;
//        for (int i = r; i >=1 ; i--) {
//            for (int j = 1; j <=i-1 ; j++) {
//                System.out.print(j);
//            }
//            for (int j = 1; j <=nsp ; j++) {
//                System.out.print(" ");
//            }
//            nsp = nsp + 2 ;
//            for (int j = i-1; j >=1 ; j--) {
//                System.out.print(j);
//            }
//
//            System.out.println();
//
//        }
//
//        int min = 0;
//        for (int i = 1; i <=(2*r-1); i++) {
//
//            for (int j = 1; j <=(2*r-1) ; j++) {
//                int a = i;
//                int b = j;
//
//                if(a>r){
//                    a = (2*r-i);
//                }
//                if(b > r){
//                    b = (2*r-j);
//                }
//                if(a<b) min = a;
//                else min = b;
//                min = (r+1-min);
//                System.out.print(min);
//            }
//            System.out.println();
//        }

    }

}
