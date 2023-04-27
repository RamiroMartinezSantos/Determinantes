public class Operacion {
    public void sacax(Double [][]matri,Double c1,Double c2){
        Double Multi01 = c1 * matri[1][1];
        Double Multi02 = c2 * matri[0][1];
        Double res = Multi01 - Multi02;

        Double Multi11 = matri[0][0] * matri[1][1];
        Double Multi12 = matri[1][0] * matri[0][1];
        Double res2 = Multi11 - Multi12;

        double div = res/res2;

        System.out.println("Resultado de X ="+div);
    }
    public void sacay(Double [][]matri,Double c1,Double c2){
        Double Multi01 = matri[0][0] * c2;
        Double Multi02 = matri[1][0] * c1;
        Double res = Multi01 - Multi02;

        Double Multi11 = matri[0][0] * matri[1][1];
        Double Multi12 = matri[1][0] * matri[0][1];
        Double res2 = Multi11 - Multi12;

        double div = res/res2;

        System.out.println("Resultado de Y ="+div);
    }
}
