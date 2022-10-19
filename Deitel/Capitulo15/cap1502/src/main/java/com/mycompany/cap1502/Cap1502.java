package com.mycompany.cap1502;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Cap1502 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file or directory name:");
        //Cria o objeto Path com base na entrada do usuário
        Path path = Paths.get(input.nextLine());
        if(Files.exists(path)){//Se o caminho existe, gera uma saída de informações sobre ele
            //Exibe informações sobre o arquivo
            System.out.printf("%n%s exists %n",path.getFileName());
            System.out.printf("%s a directory%n",Files.isDirectory(path)? "Is":"Is not");
            System.out.printf("%s an absolute path%n",path.isAbsolute()? "Is":"Is not");
            System.out.printf("Last modify: %s%n",Files.getLastModifiedTime(path));
            System.out.printf("Size: %s%n",Files.size(path));
            System.out.printf("Path: %s%n",path);
            System.out.printf("Absolute Path: %s%n",path.toAbsolutePath());
            if(Files.isDirectory(path)){
                System.out.printf("%nDirectory contents: %n");
                //Objeto para iteração pelo conteúdo de um diretório
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                for(Path p: directoryStream){
                    System.out.println(p);
                }
            }
        }else{//Se não for arquivo ou diretório, gera saída da mensagem de erro
            System.out.printf("path: %s does not exist",path);
        }
    }//Fim de main
}//Fim da classe
