package XI.Project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        int item = 5;
        int limit = 100;

        System.out.println("1.Add item");
        System.out.println("2.Remove item");
        System.out.println("3.Check item");
        System.out.println("เลือกโกดังสินค้า 1/2/3");

        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();

        
        if (menu == 1){
            if (item < limit) 
          {System.out.println("ใส่จำนวนที่ต้องการจะเพิ่ม:");
                int amount = input.nextInt();
                if (item + amount > limit)
                {System.out.println("item เกิน limit");} 
                else {
                    item = item + amount;
                    System.out.println(item);
                    System.out.println("out of");
                     System.out.println(limit);
                }
          }
            
            else {System.out.println("item เต็มแล้วจ้า");}}

        if (menu == 2) {
            if (item > 0) 
            {System.out.println("ใส่จำนวนที่ต้องการจะลด:");
                int amount = input.nextInt();
                if (item - amount <= 0)
                {System.out.println("item ไม่พอ remove");} 
                else {
                    item = item - amount;
                    System.out.println(item);
                    System.out.println("out of");
                     System.out.println(limit);
                }
                          
            } 
            else { System.out.println("ไม่มี item จ้า");}}

        
        if (menu == 3) {
            System.out.println(item);
            System.out.println("out of");
            System.out.println(limit);

  }
        if(menu>3)
        {System.out.println("menu ไม่ถูกต้อง");}
    
    }}
