package boletin2_02_1;

public class Boletin2_02_1 {

    public static void main(String[] args) {
        float lado = 3f, area;
       //area= lado*lado;
       area= (float) Math.pow(lado, 2);    //Tambien se puede hacer así, usando el metodo Math con el operador pow (Potencia)
        System.out.println("Area cuadrado = "+area);
    }
    
}
