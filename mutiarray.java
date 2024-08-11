public class mutiarray {
    public static void main(String[] args) {
        int num[][] = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                num[i][j] = (int)(Math.random() * 100);
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println();
        for(int n[] : num){
            for(int m : n){
                System.out.print(m + " " );
            }
            System.out.println();
        }
    }
}
