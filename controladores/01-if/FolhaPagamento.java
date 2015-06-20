
/**
 * Devemos pagar hora extra para o funcionario que trabalhou mais
 * que 160h no mes.
 *
 */
class FolhaPagamento {

    public static void main(String[] args) {

        String nomeFuncionario = "Joao ";

        double valorHora = 35.00;

        double salarioAReceber = 0.0;

        double taxaExtra = 0.75;

        int horasNomais = 160;

        float horasTrabalhadas = 220;

        if ( horasTrabalhadas > horasNomais ) {

            double totalHorasExtras =  horasTrabalhadas - horasNomais;

            double valorExtra =  ( totalHorasExtras *  valorHora  ) ;

            double valorExtraAPagar =  valorExtra *  taxaExtra;

            salarioAReceber = ( horasNomais *  valorHora ) + valorExtraAPagar;

            System.out.println ("Caraca ele vai ganhar uma grana extra de " + valorExtraAPagar);

        } else {

            salarioAReceber =  horasNomais *  valorHora ;
        }

        System.out.println ("Salario a Receber : " + salarioAReceber);



    }

}
