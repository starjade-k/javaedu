package net.kkm.util;
import java.io.*;
public class Print {
	public static void print(Object obj) {
	    System.out.println(obj);
	  }

	  public static void print() {
	    System.out.println();
	  }		

	  public static void printmb(Object obj) {
	    System.out.print(obj);
	  }	

	  // java se5 버전부터 printf() 관련된게 추가됨
	  public static PrintStream printf(String format, Object... args) {
	    return System.out.printf(format, args);
	  }	
}
