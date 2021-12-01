public class HarmonikSeri2 {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        double sum=0.0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+(1/(double)numbers[i]);
        }
        System.out.println(sum);
    }
}
