/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package c.atividadederevisao;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class AtividadeDeRevisao {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        fila fila = new fila();
        
         System.out.println("Inserindo caminhoneiros na fila...");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do caminhoneiro:");
            String nome = scanner.nextLine();
            System.out.println("Digite a placa do caminhao:");
            String placa = scanner.nextLine();
            System.out.println("Digite o horario de chegada:");
            String horarioChegada = scanner.nextLine();

            DadosCaminhoneiro caminhoneiro = new DadosCaminhoneiro(nome, placa, horarioChegada);
            fila.enqueue(caminhoneiro);
        }

        // Exemplo de remoção de caminhoneiros da fila
        System.out.println("Removendo caminhoneiros da fila");
        while (!fila.isEmpty()) {
            DadosCaminhoneiro caminhoneiro = fila.dequeue();
            System.out.println("Atendendo caminhoneiro: " + caminhoneiro.getNome() + " com placa " + caminhoneiro.getPlaca() + " que chegou as " + caminhoneiro.getHorarioChegada());
        }

        scanner.close();
    }
}
