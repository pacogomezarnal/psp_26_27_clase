import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

//Crea un nuevo proyecto Java en el que se ejecute el listado de la carpeta temp
// teniendo en cuenta el sistema operativo en el que nos encontramos:
public class Main {
    public static void main(String[] args) {
        //Detección del Sistema operativo
        String os = System.getProperty("os.name");
        String command = "";
        String directory = "";
        //Crear el comando dependiendo del SO
        if(os.toLowerCase().startsWith("linux")){
            command = "sh -c ls -l";
            directory = "/tmp";
        }else{
            command = "cmd /c dir";
            directory = "c:/temp";
        }
        try{
            //Creamos el proceso a partir del comando generado
            ProcessBuilder pBuilder = new ProcessBuilder(command.split("\\s"));
            //Cambiamos el directorio de trabajo dependiendo del SO en el que estemos
            pBuilder.directory(new File(directory));
            //Creo un nuevo proceso
            Process process = pBuilder.start();
            //Stream del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            reader.lines().forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}