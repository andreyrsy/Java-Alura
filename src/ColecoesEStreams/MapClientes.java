package ColecoesEStreams;

import java.util.HashMap;
import java.util.Map;

public class MapClientes {
    public static void main(String[] args) {
/*
Você foi encarregado de desenvolver um sistema para gerenciar os clientes de uma livraria. Para
garantir um controle preciso dos registros, cada cliente deve possuir um ID único associado ao seu
nome.

Para resolver essa tarefa você deve:
Armazenar os clientes através de uma chave e valor: (id, nome)
Cadastrar três clientes
Recuperar o nome do cliente de ID igual a 2
*/
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Júlia");
        clientes.put(2, "Marcos");
        clientes.put(3, "Pedro");
        clientes.put(4, "Gabriel");
        clientes.put(5, "Joaquim");

        int ID = 2;

        System.out.println("O nome do cliente com ID 2 é: " + clientes.get(ID));;
    }
}
