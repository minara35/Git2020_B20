package utility;

public class UniquesWords {
    public static void main(String[] args) {
        String [] arr = {"C#", "Java", "Github", "C#", "Java"};

for(String a : arr){
    // String r = arr[0];  // C#
    String r = a;
    int count = 0;
    for(String each : arr){
        if (r.equals(each)){ // C#  == each words if true count will increase by one
            count++; // C#2, Java2
        }
    }
    if(count == 1){
        System.out.println(r);
    }

}

    }
}
