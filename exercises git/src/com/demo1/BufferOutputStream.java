package com.demo1;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BufferOutputStream {
        public static void main(String[] args) {

            String data = "helo maruthi";

            try {
                // Creates a FileOutputStream
                FileOutputStream file = new FileOutputStream("C:/JavaDemo/kranthi/kranth/src/com/demo1/write.txt");

                // Creates a BufferedOutputStream
                BufferedOutputStream output = new BufferedOutputStream(file);

                byte[] array = data.getBytes();

                // Writes data to the output stream
                output.write(array);
                output.close();
            }

            catch (Exception e) {
                e.getStackTrace();
            }
        }
    }


