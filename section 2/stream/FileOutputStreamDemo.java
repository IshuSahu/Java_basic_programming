import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String Source = "Now is the time for all good men\n"
        + " to come to the aid of their country\n"
        + " and pay their due taxes.";
        byte buff[] = Source.getBytes();
        OutputStream f0 = new FileOutputStream("F0.txt");
        for (int i = 0; i < buff.length; i+=2  ) {
            f0.write(buff[i]);
        }
        f0.close();
        OutputStream f1 = new FileOutputStream("f1.txt");
        f1.write(buff);
        f1.close();
        OutputStream f2 = new FileOutputStream("f2.txt");
        f2.write(buff, buff.length - buff.length/4 , buff.length/4);
        f2.close();
    }
}
