package task2;

import java.io.*;

public class InputOutput {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("test.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("test.txt")))){
            out.writeShort(120);
            out.writeInt(111);
            out.writeLong(10L);
            out.writeUTF("Test");

            out.flush();

            System.out.println("Short " + in.readShort());
            System.out.println("Int " + in.readInt());
            System.out.println("Long " + in.readLong());
            System.out.println("UTF " + in.readUTF());


        } catch (FileNotFoundException e){
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
