package javabasico;

public class JavaBasico {

    public static void main(String[] args) {
        //ejercicio5();
        //ejercicio6();
        ejercicioMatriz();
        
        
        
    }
    
    public static void ejercicioMatriz()
    {
        int[] matrizNum = new int[4];
        matrizNum[0] = 123;
        matrizNum[1] = 23;
        matrizNum[2] = 777;
        matrizNum[3] = 888;
        
        for (int a = 0; a < matrizNum.length; a++) {
            //System.out.println(matrizNum[a]);
        }
        
        int[][] matrizBidimensional=new int[4][2];

        matrizBidimensional[0][0] = 11;
        matrizBidimensional[0][1] = 22;
        
        matrizBidimensional[1][0] = 33;
        matrizBidimensional[1][1] = 44;
        
        matrizBidimensional[2][0] = 55;
        matrizBidimensional[2][1] = 66;
        
        matrizBidimensional[3][0] = 77;
        matrizBidimensional[3][1] = 88;
        
        for (int i = 0; i < matrizBidimensional.length; i++) {
            for (int j = 0; j < matrizBidimensional[i].length; j++) {
                System.out.println(matrizBidimensional[i][j]);
            }
        }
    }
    
    
    
    public static void ejercicio8(int edad)
    {        
        double dscto = 0;
        
        if(edad < 18){            
            dscto = 0.15;            
        }else if(edad >60)
        {
            dscto = 0.3;           
        }
        
        System.out.println(dscto);        
    }
    
    public static void ejercicioWhile() {
        int contador = 0;
        
        while(contador < 10){
            System.out.println(contador);
            ++contador;
        }
        
        do{
            System.out.println(contador);
            ++contador;            
        }while(contador < 10);
        
    }

    public static void ejercicio5() {
        int x = 5;
        int y = 8;
        int z = 6;
        int solucion = x + y - 3 * z;
        
        System.out.println("Solucion (5): " + solucion);        
    }

    public static void ejercicio6() {
        System.out.println("Solucion (6): ----------");
        double a = 7 * (15 + 1) * 2 % 2;
        System.out.println(a);

        boolean b = (0.0 / 0.0 == 0.0 / 0.0);
        System.out.println(b);

        boolean c = (!true && false);
        System.out.println(c);

        boolean d = ((3 * 4 >= 12) && (3.5 > (1 + 2f)) || (4 < 8));
        System.out.println(d);

        boolean e = !(true == false);
        System.out.println(e);

        System.out.println(f);
        System.out.println("-");
        boolean f = (!true == false);        
        
        System.out.println("-");        
    }

    public static void ejercicio7() {
        double valorRopa = 20;
        int ropa = 10;
        //double dsctoPorcentaje = (ropa / 100)
        
    }
}
