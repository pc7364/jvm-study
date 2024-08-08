package cn.pc.jvmstudy;

import javax.crypto.spec.DESedeKeySpec;
import java.net.URL;

public class TestJDKClassLoader {

    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(DESedeKeySpec.class.getClassLoader());
        System.out.println(TestJDKClassLoader.class.getClassLoader().getClass().getName());

        System.out.println();

        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassLoader = appClassLoader.getParent();
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();

        System.out.println("appClassLoader:" + appClassLoader);
        System.out.println("extClassLoader:" + extClassLoader);
        System.out.println("bootstrapClassLoader:" + bootstrapClassLoader);


        System.out.println();
        System.out.println("bootstrapLoader加载以下文件：");


        System.out.println();
        System.out.println("extClassloader加载以下文件：");
        System.out.println(System.getProperty("java.ext.dirs"));

        System.out.println();
        System.out.println("appClassLoader加载以下文件：");
        System.out.println(System.getProperty("java.class.path"));

    }

}
