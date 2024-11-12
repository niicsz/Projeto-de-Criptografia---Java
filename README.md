# Projeto-de-Criptografia-Java
Este projeto implementa um algoritmo simples de criptografia baseado em uma cifra de deslocamento (ou cifra de César). O programa permite ao usuário cifrar e decifrar mensagens através de uma interface gráfica simples, utilizando a biblioteca JOptionPane do Java.

Funcionalidade
O programa oferece duas opções principais:

Cifrar uma mensagem - O usuário insere uma frase e a quantidade de saltos (chave) para deslocar os caracteres da mensagem.
Decifrar uma mensagem - O usuário insere uma mensagem cifrada e a chave utilizada para realizar o deslocamento reverso e obter o texto original.
Como Usar
Passo 1: Compilar e Executar o Código
Se você está utilizando um ambiente de desenvolvimento integrado (IDE), como o IntelliJ IDEA ou o Eclipse, basta importar o projeto e executar a classe Criptografia.

Se você estiver utilizando o terminal, siga os seguintes passos:

Compile o código com o comando:

bash
Copiar código
javac Criptografia.java
Execute o código com o comando:

bash
Copiar código
java Criptografia
Passo 2: Interação com o Usuário
Ao executar o programa, ele solicitará ao usuário as seguintes entradas:

Chave (número de saltos): O valor que define o número de posições a ser deslocado para cifrar ou decifrar os caracteres.
Escolha: O usuário deve escolher entre 1 para cifrar ou 2 para decifrar.
Mensagem: O usuário insere a mensagem que deseja cifrar ou decifrar.
O resultado será mostrado tanto em uma caixa de diálogo quanto no console.

Exemplo de Execução
O programa pede para o usuário digitar a quantidade de saltos (chave) e a escolha (1 para cifrar ou 2 para decifrar).

Se o usuário escolher cifrar, o programa solicita a mensagem a ser cifrada.
Se o usuário escolher decifrar, o programa solicita a mensagem cifrada e a chave utilizada.
O resultado será mostrado em uma janela de diálogo e também impresso no console.

Exemplo de Cifrar:
plaintext
Copiar código
Digite a quantidade de saltos = 3
Digite 1 para Cifrar ou 2 para Decifrar = 1
Digite a frase que deseja Cifrar: Olá Mundo
Mensagem CRIPTOGRADA: Rqj Pxqgr
Exemplo de Decifrar:
plaintext
Copiar código
Digite a quantidade de saltos = 3
Digite 1 para Cifrar ou 2 para Decifrar = 2
Digite a frase que deseja Decifrar: Rqj Pxqgr
Mensagem DESCRIPTOGRADA: Olá Mundo
Funcionalidade do Código
O código é composto pelas seguintes partes principais:

Método criptografar(String msg, int chave): Este método desloca os caracteres da mensagem para frente, conforme a chave fornecida.
Método descriptografar(String msgCript, int chave): Este método desloca os caracteres da mensagem para trás, revertendo a cifragem e retornando o texto original.
Estrutura de Pastas
O projeto segue a seguinte estrutura de pastas:

bash
Copiar código
/src
    /com/mycompany/criptografia
        Criptografia.java
Dependências
Este projeto não possui dependências externas além da biblioteca padrão do Java.

Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorar o projeto.

Licença
Este projeto é de uso livre sob a licença MIT.
