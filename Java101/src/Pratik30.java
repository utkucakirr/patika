public class Pratik30 {
    static boolean check(int i,int[] arr){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==i){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={3,7,3,3,2,9,2,10,21,10,33,9,1};
        int[] duplicates=new int[list.length];
        int starter=0;
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if(i!=j && list[i]==list[j] && list[i]%2==0){
                    if(!check(list[i],duplicates)){
                        duplicates[starter]=list[i];
                        starter++;
                        break;
                    }
                }
            }
        }

        for(int i : duplicates){
            if(i!=0){
                System.out.println(i);
            }
        }
    }
}
