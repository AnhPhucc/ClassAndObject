package basic.dev;

import java.util.Iterator;
import java.util.Scanner;

public class MainApp {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Person arr[] = new Person[10];
    Scanner sc = new Scanner(System.in);
    System.out.println("add 10 persons");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Nhap vao nguoi thu: " + (i + 1));
      String name = sc.nextLine();
      int age = sc.nextInt();
      String address = sc.nextLine();
      int phone = sc.nextInt();
      float mark = sc.nextInt();
      
      arr[i] = new Person(name, age, address , phone, mark);
      sc.nextLine();

    }
    // in danh sach vua nhap
    for (int i = 0; i < arr.length; i++) {
      Person p = arr[i];
      System.out.format("Ten: %S - Tuoi: %d  - Diachi: %d - Sdt: %d - Dtb: %d ", p.name, p.old , p.address , p.sdt , p.dtb);
    }

    Person max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (max.old < arr[i].old)
        max = arr[i];
    }
    System.out.format("Ten: %S - Tuoi: %d - Diahchi: %S - Std: %d - Dtb : %d ", max.name, max.old , max.address , max.sdt , max.dtb);
    System.out.println("Nguoi lon tuoi nhat la: " + max.old);
    System.out.println("Ten nguoi lon tuoi nhat la :" + max.name);

  }

}