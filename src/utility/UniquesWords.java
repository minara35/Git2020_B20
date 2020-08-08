package utility;

public class UniquesWords {
    public static void main(String[] args) {
        String [] arr = {"C#", "Java", "Github", "C#", "Java"};

for(String a : arr){
    String r = a;
    int count = 0;
    for(String each : arr){
        if (r.equals(each)){
            count++;
        }
    }
    if(count == 1){
        System.out.println(r);
    }

}

    }
}
