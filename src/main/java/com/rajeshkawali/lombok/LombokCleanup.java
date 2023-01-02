package com.rajeshkawali.lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.Synchronized;

import java.io.*;

/**
 * @author Rajesh_Kawali
 */
public class LombokCleanup {
    public static void main(String[] args) throws IOException {

        @Cleanup // This will close all the connections/opened files before exit
        InputStream in = new FileInputStream(args[0]);

        @Cleanup
        OutputStream out = new FileOutputStream(args[1]);
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }

        sneakyThrowsExample();
    }

    //If we remove this annotation then we forced to handle it or use throws. (Unhandled exception: java.io.FileNotFoundException)
    //You can pass any number of exceptions to the @SneakyThrows annotation. If you pass no exceptions, you may throw any exception sneakily.
    @SneakyThrows // @SneakyThrows - can be used to sneakily throw checked exceptions without actually declaring this in your method's throws clause.
    public static String sneakyThrowsExample(){
        if(true){
            throw new FileNotFoundException("");
        }else {
            return "";
        }
    }

    /*
    @Synchronized is a safer variant of the synchronized method modifier.
    Like synchronized, the annotation can be used on static and instance methods only.
    It operates similarly to the synchronized keyword, but it locks on different objects.
    The keyword locks on this, but the annotation locks on a field named $lock, which is private.
     */
    @Synchronized
    public void foo() {
        System.out.println("bar");
    }
}