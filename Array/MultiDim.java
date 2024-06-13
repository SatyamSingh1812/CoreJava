package Array;

public class MultiDim {
    public static void main(String[] args) {


    int multi[][]=new int [3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                //assigning random value to multi[][]
                multi[i][j]= (int)(Math.random()* 10);
                System.out.print(multi[i][j]+" ");

            }
            System.out.println();

        }
//    for (int i =0 ;i<3 ; i++){
//        for (int j = 0; j < 4; j++) {
//            System.out.print(multi[i][j]+ " ");
//        }
//        System.out.println();
//    }
    }

}
