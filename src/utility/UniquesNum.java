package utility;

public class UniquesNum {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,2,3,4,5,4};

        for(int j=0; j<= arr.length-1; j++){
            int r = arr[j];
            int count = 0;

            for(int i = 0; i<= arr.length-1; i++){
                int each = arr[i]; // 1,2,2,3,2,3,4,5,4
                if(each == r){ //
                    count++;

                }
            }
            if(count ==1){
                System.out.print(r + " ");
            }

        }


    }
}
