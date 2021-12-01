public class Frekans {
    static boolean check(int r,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==r){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] dizi={10,20,20,10,10,20,5,20};
        int[] arr=new int[dizi.length];
        int starter=0;
        for(int i=0;i<dizi.length;i++){
            int count=1;
            for(int j=0;j<dizi.length;j++){
                if(i!=j && dizi[i]==dizi[j] && check(dizi[i],arr)){
                    count++;
                }
            }
            if(check(dizi[i],arr)){
                System.out.println(dizi[i] + " sayisi " + count + " kere tekrar edildi.");
            }
            arr[starter]=dizi[i];
            starter++;
        }
    }
}
