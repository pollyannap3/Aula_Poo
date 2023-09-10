package EmpregoFaculdade;

public class MainEmpregado {
    public static void main(String[] args) {

        EmpregadoDaFaculdade empregado;

        empregado = new EmpregadoDaFaculdade("Alexandre", 2000, 20, 2800);
        System.out.println(empregado.getInfo());

    }

}
