package learn.hfpatterns.iodecorator;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        InputStream in = new ByteArrayInputStream(text.getBytes());
        BufferedReader br = new BufferedReader(new InputStreamReader(new LowerCaseInputStream(in)));

        System.out.println("Result:");
        System.out.println(br.readLine());
    }
}
