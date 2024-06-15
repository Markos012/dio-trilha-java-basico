public class SistemaMedida {
  public static void main(String[] args){//TER CUIDADO AO USAR - NAO É NAO PERFORMATICO EM SINTAXE
    String sigla = "Y";
    switch (sigla) {
        case "P":{
            System.out.println("PEQUENO");
            break;
        }
        case "M":{
            System.out.println("MEDIO");
            break;
        }
        case "G":{
            System.out.println("GRANDE");
            break;
        }
        default:
        System.out.println("INDEFINIDO");
    }
  }
}
