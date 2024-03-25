public class Main {

    public static void main(String[] args) {


    int [] arr  = {1,2,7,5,0};

    //BUBBLE SORT istifadesi

        for (int i = 0; i < arr.length-1; i++){
            for (int k= 0; k< arr.length-i-1; k++){
                if (arr[k] > arr[k+1]){
                    int T = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = T;
                }
            }
        }

        for (int i =0; i< arr.length; i ++){
            System.out.println(arr[i]);
        }


//    //SELECTION SORT istifadesi
//
//        for (int i =0; i< arr.length-1; i ++){
//            int min = i;
//
//            for (int k= i+1; k <arr.length;k++){
//                if (arr[k] < arr[min]){
//                    min=k;
//                }
//            }
//
//            int T = arr[min];
//            arr[min] = arr[i];
//            arr[i] = T;
//        }
//
//        for (int i =0; i< arr.length; i ++){
//            System.out.println(arr[i]);
//        }




    }}



        /*

            *
           ***
          *****
         *******
        *********

         */


//        for ( int i = 1; i<=5 ; i++){
//            for (int k = i; k <=4 ;k++){
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < i*2-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//
//
//
//
//
//    }}







