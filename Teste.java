public class Teste {

    public static void main(String args []){

        Empregado empregado=new Empregado();

        empregado.setCodigoSetor(1);
        empregado.setSalarioBase(1000);
        empregado.setImposto(100);



        System.out.println(empregado.calcularSalario());
    }
    
}
