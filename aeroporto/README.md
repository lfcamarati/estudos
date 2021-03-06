# Exercício: Aeroporto

Como operador de um aeroporto, há a necessidade de um sistema para armazenar os dados dos clientes para um vôo, junto com os clientes que ficarão numa fila de espera devido ao vôo possuir um número máximo de clientes por viagem (5 clientes por vôo).

### Crie um sistema que:

- Permita o cadastro de clientes armazenando o nome e cpf de cada um. Sistema não deve permitir cadastrar mais de um cliente com o mesmo CPF.
- Caso o limite de clientes por vôo seja atingido, o sistema irá incluir o cliente numa fila de espera, para poder ingressar no vôo caso algum outro cliente desista de viajar.
- Permita que seja possível aplicar a desistência de um cliente do vôo e, caso haja algum cliente na fila de espera, automaticamente já o inclua no vôo após a desistência. A desistência deverá ser através do CPF do cliente.
- Permita a visualização dos clientes do vôo assim como os que estão na fila de espera, assim:
  ```
  === Passageiros ===
  - Nome do cliente (CPF)
  - Fulano (123)
  - Ciclano (456)
  
  === Fila de espera ===
  - Beltrano (789)
  ```

### Observações:
- Crie uma classe **Voo** que irá manter os clientes do vôo (use um vetor) e terá também a fila de espera.
- Crie uma classe **Cliente** para representar os dados do mesmo (**nome** e **cpf** - ambos como `String`).
- Crie uma classe **FilaEspera** para representar a fila de espera do vôo. Com isso será preciso ter uma classe **Posicao** para poder fazer o controle de quem é o próximo da fila em relação à posição atual.
  - é como na vida real, numa fila vc tem a pessoa da frente que é a próxima em relação à você.
    >   **Ex.:** `<-primeiro<-[1]<-[2]<-[3]<-último`
- Em vez de ler e imprimir usando o `Scanner` e o `console`, para esse exercício, será usado a classe `JOptionPane`:
  - Para ler: `String entrada = JOptionPane.showInputDialog(null, "Texto");`
  - Para imprimir: `JOptionPane.showMessageDialog(null, "Texto que será apresentado na janela");`
- Em resumo, o sistema deverá ter, a princípio, essas opções:
  - 1 - Novo Passageiro
  - 2 - Desistência
  - 3 - Detalhar Vôo
  - 0 - Sair

> Crie uma branch para implementar esse exercício.
