public class occurences_count {
    public static void main(String[] args) {
        int num=13393;
        int count=0;
        while (num>0){
            int rem = num%10;
            if (rem==3){
                count++;
            }
            num=num/10;
        }
        System.out.println("Occurence of 3 = "+count);
    }
}
