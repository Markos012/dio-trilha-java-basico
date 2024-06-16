public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Markos";
        String segundoNome = "Jhonathas";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        int anoNascimento  = 1990;
        boolean diaTrabalho = false;
        double salario = 2300.0;
    System.out.println ("Meu nome e " + nomeCompleto + ", meu ano de nascimento e " + anoNascimento + " e meu salario atual e de " + salario + " Reais");
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
