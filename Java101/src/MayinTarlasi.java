import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    public static int findMines(int row, int column,String[][] board){
        int rowMax=row+1,rowMin=row-1,columnMax=column+1,columnMin=column-1,mineAround=0;
        if(rowMin<0){
            rowMin++;
        }
        if(columnMin<0){
            columnMin++;
        }
        if(rowMax>board[0].length-1){
            rowMax--;
        }
        if(columnMax>board.length-1){
            columnMax--;
        }
        for(int i=rowMin;i<=rowMax;i++){
            for(int j=columnMin;j<=columnMax;j++){
                if(board[i][j].equals("*")){
                    mineAround++;
                }
            }
        }
        return mineAround;
    }
    public static void showBoard(String[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static String[][] creator(int a,int b){
        String[][] matrix=new String[a][b];
        int mayinSayisi=(a*b)/4,mayinCheck=0,filled=0;
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                Random rd=new Random();
                boolean check=rd.nextBoolean();
                if(check && mayinCheck<mayinSayisi){
                    matrix[i][j]="*";
                    mayinCheck++;
                }else if(!check && (a*b)-filled==(mayinSayisi-mayinCheck)){
                    matrix[i][j]="*";
                    mayinCheck++;
                }else{
                    matrix[i][j] = "-";
                }
                filled++;
            }
        }
        return matrix;
    }
    public static void run(String[][] mineBoard, String[][] answerBoard){
        Scanner input=new Scanner(System.in);
        int correctAnswer=0;
        while(correctAnswer<=(mineBoard.length*mineBoard[0].length)-((mineBoard.length*mineBoard[0].length)/4)){
            if(correctAnswer==(mineBoard.length*mineBoard[0].length)-((mineBoard.length*mineBoard[0].length)/4)){
                System.out.println("Oyunu kazandiniz. Tebrikler.");
                showBoard(answerBoard);
                break;
            }
            showBoard(answerBoard);
            System.out.print("Satir giriniz: ");
            int a=input.nextInt();
            System.out.print("Sutun giriniz: ");
            int b=input.nextInt();
            if(a<0 || b<0 || a>=mineBoard[0].length || b>=mineBoard[0].length){
                System.out.println("Hatali secim. Tekrar deneyiniz.");
            }else{
                if(!mineBoard[a][b].equals("*")){
                    int mineAround=findMines(a,b,mineBoard);
                    answerBoard[a][b]=String.valueOf(mineAround);
                }else{
                    System.out.println("Mayina bastiniz. Oyun bitti. ");
                    showBoard(mineBoard);
                    break;
                }
                correctAnswer++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Satır boyutu: ");
        int str=input.nextInt();
        System.out.print("Sutun boyutu: ");
        int stn=input.nextInt();
        String[][] matrix=creator(str,stn);
        String[][] matrix2=new String[str][stn];
        for(int i=0;i< matrix2.length;i++){
            Arrays.fill(matrix2[i], "-");
        }
        run(matrix,matrix2);
    }
}
