public class Main {
    public static void main(String[] args) {
        System.out.println("array base:");
        int[][] numeri={{1,2,3},{4,5,6}};
        System.out.println(stampa(numeri));
        System.out.println("\ncolonne invertite (1,2)");
        invertiC(1,2,numeri);
        System.out.println(stampa(numeri));
        numeri=new int[][]{{1,2,3},{4,5,6}};
        System.out.println("\nrighe invertite (0,1)");
        invertiR(0,1,numeri);
        System.out.println(stampa(numeri));
        System.out.println("\ntrasposta:");
        numeri=new int[][]{{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        trasposta(numeri);
        System.out.println(stampa(numeri));
        int[][] testSimmetria={{1,7,3,8},
                                {7,5,4,11},
                                {3,4,9,13},
                                {8,11,13,15}};
        System.out.println("\narray per test simmetria:");
        System.out.println(stampa(testSimmetria));
        System.out.println("\nesito:");
        if(simmetria(testSimmetria))
            System.out.println("simmetrica");
        else
            System.out.println("non simmetrica");
        System.out.println("\narray esmpio somma");
        int[] aSommaR=sommaR(numeri);
        System.out.println(stampa(numeri));
        System.out.println("->righe");
        System.out.println(stampa(aSommaR));
        int[] aSommaC=sommaC(numeri);
        System.out.println("->colonne");
        System.out.println(stampa(aSommaC));
        unoZero(numeri);
        System.out.println("\ndiagonale (1 sotto la diagonale 0 sopra)");
        System.out.println(stampa(numeri));
    }
    public static void unoZero (int[][] x){
        for (int i=0; i<x.length; i++){
            for (int j=0; j<x[i].length; j++){
                x[i][j]=1;
            }
        }
        for(int i=0; i<x.length; i++){
            for (int j=i+1; j< x[i].length; j++){
                x[i][j]=0;
            }
        }
    }
    public static int[] sommaC (int[][] x){
        int[] y=new int[x.length];
        for (int i=0; i<x.length; i++){
            for (int j=0; j<x[i].length; j++){
                y[i]+=x[j][i];
            }
        }
        return y;
    }
    public static int[] sommaR (int[][] x){
        int[] y=new int[x[0].length];
        for (int i=0; i<x.length; i++){
            for (int j=0; j<x[i].length; j++){
                y[i]+=x[i][j];
            }
        }
        return y;
    }

    public static void trasposta(int[][] numeri){
        for(int i=0; i<numeri.length; i++){
            for (int j=i; j< numeri[i].length; j++){
                int temp=numeri[i][j];
                numeri[i][j] = numeri[j][i];
                numeri[j][i] = temp;
            }
        }
    }
    public static boolean simmetria(int[][] matrice){
        boolean simmetrica=true;
        for(int i=0; i<matrice.length; i++){
            for (int j=i; j< matrice[i].length; j++){
                if (matrice[i][j]!=matrice[j][i]){
                    simmetrica=false;
                    break;
                }
            }
        }
        return simmetrica;
    }
    public static void invertiC(int colonna1, int colonna2, int[][] matrice){
        for(int i=0; i<matrice.length; i++){
            for (int j=0; j< matrice[i].length; j++){
                if (j==colonna1){
                    int temp=matrice[i][j];
                    matrice[i][j]=matrice[i][colonna2];
                    matrice[i][colonna2]=temp;
                }
            }
        }
    }
    public static void invertiR(int riga1, int riga2, int[][] matrice){
        for(int i=0; i<matrice.length; i++){
            for (int j=0; j< matrice[i].length; j++){
                if (i==riga1){
                    int temp=matrice[i][j];
                    matrice[i][j]=matrice[riga2][j];
                    matrice[riga2][j]=temp;
                }
            }
        }
    }
    public static String stampa(int [][] matrice){
        String stampa="";
        for(int i=0; i<matrice.length; i++){
            for (int j=0; j< matrice[i].length; j++) {
                if(matrice[i][j]<10&&j!=0)
                    stampa+=" ";
                stampa+=matrice[i][j] + " ";
            }
            stampa+="\n";
        }
        return stampa;
    }
    public static String stampa(int[] matrice){
        String stampa="";
        for(int i=0; i<matrice.length; i++) {
            stampa+=matrice[i]+ " ";
        }
        return stampa;
    }
}