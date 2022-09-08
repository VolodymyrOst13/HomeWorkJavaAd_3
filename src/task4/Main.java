package task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String externalPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "Text2.txt";
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(externalPath)));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(externalPath)))){

            out.writeUTF("Java вплинула на розвиток J++[en], що розроблялась компанією «Microsoft». Роботу над J++ було зупинено через судовий позов «Sun Microsystems», оскільки ця мова програмування була модифікацією Java. Пізніше в новій платформі «Microsoft» .NET випустили J#, щоб полегшити міграцію програмістів J++ або Java на нову платформу. З часом нова мова програмування С# стала основною мовою платформи, перейнявши багато чого з Java. J# востаннє включався в версію Microsoft Visual Studio 2005. Мова сценаріїв JavaScript має схожу із Java назву і синтаксис, але не пов'язана із Java.");
            out.flush();

            System.out.println(in.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
