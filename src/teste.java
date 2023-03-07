import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class teste{
    public static void main(String[] args) throws Exception {
        // Ordenando dados de arquivos
        // Considerando seus conhecimentos sobre trabalhar com arquivos, crie uma estrutura 
        // que permite a importação de arquivos com os valores a serem ordenados. 

        // Esses arquivos devem conter 1.000, 5.000, 10.000 e 30.000 valores que deverão ser 
        // importados, ordenados e exportados com a adição do texto "_ord" no nome do arquivo. 

        // Exemplo: 
        // - Arquivo de entrada 5000.txt, após ordenação, arquivo de saída 5000_ord.txt

        Arquivos arquivo = new Arquivos();

        String escolha[] = {"Ordenado", "Não ordenado", "Aleatória"};

        int retorno = JOptionPane.showOptionDialog(null, "Escolha qual o tipo deseja escrever", "Escolha", JOptionPane.DEFAULT_OPTION, 
                                                  JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
   
        System.out.println(retorno);

        arquivo.gerar_vetor(retorno);

    }
}
