import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        Operacion operacion = new Operacion();

        Double[][] matri = new Double[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Ingrese datos de x: ");
                matri[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Ingrese C1:");
        Double c1 = scanner.nextDouble();
        System.out.println("Ingrese C2:");
        Double c2 = scanner.nextDouble();

        operacion.sacax(matri,c1,c2);
        operacion.sacay(matri,c1,c2);

    }
}
