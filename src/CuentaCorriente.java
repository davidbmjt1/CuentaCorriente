public class CuentaCorriente {
    String nombreTitular;
    double saldo;
    String numCuenta;

    public CuentaCorriente (String nombreTitular, double saldo, String numCuenta){
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }


    public void retirarFondos(double cantidad) {
        saldo = saldo - cantidad;
    }

    public void ingregresarFondos(double cantidad) {
        saldo += cantidad;
    }


    /*
    public void mostrarSaldo() {
    }
    */


    @Override
    public String toString(){
        return STR."\{numCuenta} | \{nombreTitular} | \{saldo}";
    }

}
