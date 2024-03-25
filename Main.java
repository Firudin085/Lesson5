public class Main {

    public static void main(String[] args) {

        /*

            *
           ***
          *****
         *******
        *********

         */


        for ( int i = 1; i<=5 ; i++){
            for (int k = i; k <=4 ;k++){
                System.out.print(" ");
            }

            for (int j = 0; j < i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }





    }}





















// BUBBLE SORT
//        int n = arr.length;
//        for (int i = 0 ; i < n - 1;i++ ){
//            for (int k = 0;k <n-i-1;k++){
//                if (arr[k] > arr[k+1]){
//                    int temp = arr[k];
//                    arr[k]  = arr[k+1];
//                    arr[k+1] = temp;
//                }
//            }
//
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
//
//
//



// SELECTION SORT
//        int[] arr = {64, 34, 25, 12, 22, 11, 90};
//        int i,k;
//        for (i = 0 ; i <arr.length-1 ; i ++){
//            int min = i;
//            for (k = i + 1; k < arr.length; k++){
//                if (arr[k] < arr[min]){
//                    min = k;
//                }
//            }
//            int temp = arr[min];
//            arr[min] = arr[i];
//             arr[i] = temp;
//
//            System.out.println(arr[i]);
//        }
//

