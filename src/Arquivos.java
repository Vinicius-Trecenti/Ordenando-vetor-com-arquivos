
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Arquivos {
    JFileChooser chooser = new JFileChooser();
    int returnValue;

    public void gerar_vetor(int retorno) {
        int num[] = {1000, 5000, 10000, 30000};
        for(int cont : num){
            int vetor[] = new int [cont];

            switch(retorno) { 
                case 0:
                   for(int i=0; i<cont; i++) {     
                       //vetor totalmente ordenado
                       vetor[i] = i;
                   }
                   break;

                case 1:
                    for(int i=0; i<cont; i++) {

                        //vetor totalmente desordenado
                        vetor[i] = cont-i;
                    }
                    break;

                case 2:
                    for (int i = 0; i < cont; i++) {
                        //vetor aleatorio
                        vetor[i] = (int) (Math.random() * (cont * 2));
                    }
                    break;
            }
        Write(vetor);
        }
         
    }

    public void Write(int vector[]) {
        try {
            String pathFileWriter = "";

            returnValue = chooser.showSaveDialog(chooser);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                pathFileWriter = chooser.getSelectedFile().getAbsolutePath();
            }

            System.out.println("Escrevendo no arquivo " + pathFileWriter);

            FileWriter writer = new FileWriter(pathFileWriter, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);

            for (int number : vector) {
                bufferWriter.append(number + ",");
            }

            bufferWriter.close();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String[] fileRead() {
        try {
            String line;
            String fileRead = "";
            String readNumbers = "";

            FileNameExtensionFilter filter = new FileNameExtensionFilter("txt ou doc", "txt");

            chooser.addChoosableFileFilter(filter);

            returnValue = chooser.showOpenDialog(chooser);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                fileRead = chooser.getSelectedFile().getAbsolutePath();
            }

            BufferedReader bufferReader = new BufferedReader(new FileReader(fileRead));
            System.out.println("Lendo o arquivo " + fileRead);

            while ((line = bufferReader.readLine()) != null) {
                readNumbers += line;
            }

            bufferReader.close();

            //separa cada posição do vetor 
            String vetor[] = readNumbers.split(",");

            return vetor;

        } catch (Exception e) {
            System.out.println(e);

        }

        String vetor[] = {};
        return vetor;

    }

}