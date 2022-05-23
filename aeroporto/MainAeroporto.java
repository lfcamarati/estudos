/**
 * Como operador de um aeroporto, há a necessidade de um sistema para armazenar os dados dos clientes para um vôo,
 * junto com os clientes que ficarão numa fila de espera devido ao vôo possuir um número máximo de clientes por viagem (5 clientes por vôo).
 * 
 * Com isso, crie um sistema que:
 * 
 * - Permita o cadastro de clientes armazenando o nome e cpf de cada um.
 * - Caso o limite de clientes por vôo seja atingido, o sistema irá incluir o cliente numa fila de espera, para poder ingressar no vôo caso algum outro cliente desista de viajar.
 * - Permita que seja possível aplicar a desistência de um cliente do vôo e, caso haja algum cliente na fila de espera, automaticamente já o inclua no vôo após a desistência.
 * - Permita a visualização dos clientes do vôo assim como os que estão na fila de espera.
 *
 * Observações:
 * 
 * - Crie uma classe "Voo" que irá manter os clientes do vôo e terá também a fila de espera.
 * - Crie uma classe "Cliente" para representar os dados do mesmo (nome e cpf - ambos como String).
 * - Crie uma classe "FilaEspera" para representar a fila de espera do vôo.
 *   - é como na vida real, numa fila vc tem a pessoa da frente que é a próxima em relação à vc
 *     Ex.: <-inicio<-[1]<-[2]<-[3]<-fim
 * - Em vez de ler e imprimir usando o Scanner e o console, para esse exercício, será usado a classe JOptionPane:
 *   - Para ler: 
 *      String entrada = JOptionPane.showInputDialog(null, "Texto");
 *   - Para imprimir: 
 *      JOptionPane.showMessageDialog(null, "Texto que será apresentado na janela");
 */
public class MainMedia {

    public static void main(String[] args) {
        
    }
}
