public class Main {
    public static void main(String[] args) {
        System.out.println("array base:");
        int[][] numeri={{1,2,3},{4,5,6}};
        for(int i=0; i<numeri.length; i++){
            for (int j=0; j< numeri[i].length; j++) {
                System.out.print(numeri[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\ncolonne invertite (1,2)");
        int[][] invertitaC=invertiC(1,2,numeri);
        for(int i=0; i<invertitaC.length; i++){
            for (int j=0; j< invertitaC[i].length; j++) {
                System.out.print(invertitaC[i][j] + " ");
            }
            System.out.println("");
        }
        numeri=new int[][]{{1,2,3},{4,5,6}};
        System.out.println("\nrighe invertite (0,1)");
        int[][] invertitaD=invertiD(0,1,numeri);
        for(int i=0; i<invertitaD.length; i++){
            for (int j=0; j< invertitaD[i].length; j++) {
                System.out.print(invertitaD[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\ntrasposta:");
        numeri=new int[][]{{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        int[][] trasposta=trasposta(numeri); // in lavorazione
        for(int i=0; i<trasposta.length; i++){
            for (int j=0; j< trasposta[i].length; j++) {
                System.out.print(trasposta[i][j] + " ");
            }
            System.out.println("");
        }
        int[][] testSimmetria={{1,7,3,8},
                                {7,5,4,11},
                                {3,4,9,13},
                                {8,11,13,15}};
        System.out.println("\narray per test simmetria:");for(int i=0; i<testSimmetria.length; i++){
            for (int j=0; j< testSimmetria[i].length; j++) {
                if(testSimmetria[i][j]<10&&j!=0)
                    System.out.print(" ");
                System.out.print(testSimmetria[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nesito:");
        if(simmetria(testSimmetria))
            System.out.println("simmetrica");
        else
            System.out.println("non simmetrica");
    }

    public static int[][] trasposta(int[][] matrice){
        for(int i=0; i<matrice.length; i++){
            for (int j=0; j< matrice[i].length; j++){
                int temp=matrice[i][j];
                if (matrice[j][i]!=temp) {
                    matrice[i][j] = matrice[j][i];
                    matrice[j][i] = temp;
                }
            }
        }
        return matrice;
    }
    public static boolean simmetria(int[][] matrice){
        boolean simmetrica=true;
        for(int i=0; i<matrice.length; i++){
            for (int j=0; j< matrice[i].length; j++){
                if (matrice[i][j]!=matrice[j][i]){
                    simmetrica=false;
                }
            }
        }
        return simmetrica;
    }
    public static int[][] invertiC(int colonna1, int colonna2, int[][] matrice){
        for(int i=0; i<matrice.length; i++){
            for (int j=0; j< matrice[i].length; j++){
                if (j==colonna1){
                    int temp=matrice[i][j];
                    matrice[i][j]=matrice[i][colonna2];
                    matrice[i][colonna2]=temp;
                }
            }
        }
        return matrice;
    }
    public static int[][] invertiD(int riga1, int riga2, int[][] matrice){
        for(int i=0; i<matrice.length; i++){
            for (int j=0; j< matrice[i].length; j++){
                if (i==riga1){
                    int temp=matrice[i][j];
                    matrice[i][j]=matrice[riga2][j];
                    matrice[riga2][j]=temp;
                }
            }
        }
        return matrice;
    }
}