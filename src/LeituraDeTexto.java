/*Classe com metodos de Scanner, para não precisar chamar o pacote java.util.scanner
* dentro das classes, assim facilitando manutenção*/
import java.util.Scanner;
public class LeituraDeTexto {
    private Scanner sc = new Scanner(System.in);

    public int lerinteiro(){
        return sc.nextInt();
    }

    public double lerDouble(){
        return sc.nextDouble();
    }
    }


