package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {
    public static void main(String[] args) throws IOException {
        File fl = new File("C:\\Users\\ASUS\\index.txt");

//        File commands
        System.out.println(fl.createNewFile());
//
//        directoryCommand
//        System.out.println(fl.mkdir());

        System.out.println(fl.exists());
        System.out.println(fl.isFile());
        System.out.println(fl.isDirectory());
        System.out.println(fl.getAbsolutePath());
        System.out.println(fl.getName());

//       for writing file
        FileWriter fw = new FileWriter(fl);
        fw.write("bhaiy kya baat h");
        fw.close();

//        for reading file
//        FileReader fr = new FileReader(fl);
//        int i;
//        while ((i=fr.read())!=-1){
//            System.out.print((char)(i));
//        }
//        System.out.println();
//        System.out.println("hogya");


//        reading file by scanner
//        Scanner sc = new Scanner(fl);
//        while (sc.hasNext()) System.out.println(sc.nextLine());


//        for deleting
//        System.out.println(fl.delete());

    }
}
