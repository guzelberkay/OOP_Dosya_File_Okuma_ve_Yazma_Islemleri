package com.berkay;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        File file = new File("kod.txt");
        if(!file.exists()){  // eğer dosya yoksa yeni dosya yarat
            file.createNewFile();
        }

        String val = "Kodlama Vakti !";
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);  // işlem hızlandırmak amacı ile kullandık
        bufferedWriter.write(val);
        bufferedWriter.write("\nJava Dersleri");
        bufferedWriter.close();

        // Simdide dosyayi okuyalım

        FileReader fileReader = new FileReader(file); // okumak istediğimiz dosyayı içerisine attık
        String line;  // sayır satır okuması için
// BufferReade byte şeklinde okumasın işlemimiz hızlansın diye tampon olarak tanımadık

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();







    }
}
