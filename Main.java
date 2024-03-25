public class Main{
    public static void main(String[] args){


        int[] arr = {1,2,7,5,0};


        //Bubble Sort istifadesi

        for ( int i = 0 ; i <arr.length - 1; i ++){
            for (int k = 0; k < arr.length - i - 1; k++){
                if (arr[k] > arr[k+1]){
                    int T = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = T;
                }
            }
        }
        for (int i = 0 ; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }


//        // verilen Arrayimizi men selection sort ve bubble alqoritmasiynan etmeye calisacam
//
//        //Selection Sort
//
//        for (int i = 0 ; i<arr.length-1 ; i++){
//            int min =i;
//
//            for (int k = i +1 ; k < arr.length; k++){
//                if (arr[k] < arr[min]){
//                    min = k;
//                }
//            }
//            int T = arr[min];
//            arr[min] = arr[i];
//            arr[i] = T;
//        }
//
//        for (int i = 0 ; i<arr.length; i++){
//            System.out.print(" "+ arr[i]);
//        }
    }
}