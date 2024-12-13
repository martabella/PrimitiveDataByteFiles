import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.inicio();
    }

    public void inicio() {
        write();
        read();
    }

    public void write(){
        try(FileOutputStream fileOut = new FileOutputStream("numbers.data");
        DataOutputStream output = new DataOutputStream(fileOut);) {
            for (int i = 0; i < 5; i++) {
                output.writeInt(i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void read(){
        try(FileInputStream fileIn = new FileInputStream("numbers.data");
        DataInputStream input = new DataInputStream(fileIn);) {
            while (true) {
                int value = input.readInt();
                System.out.println("Valor: " + value);
            }
        }catch(Exception e){
            //System.out.println(e);
        }
        
    }
}