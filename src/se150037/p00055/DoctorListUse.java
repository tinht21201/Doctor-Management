/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se150037.p00055;

/**
 *
 * @author Huynh Trung Tin - SE150037
 */
public class DoctorListUse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        I_Menu menu = new Menu();
        System.out.println("========= Doctor Management ==========");
        menu.addItem("1. Add Doctor");
        menu.addItem("2. Update Doctor");
        menu.addItem("3. Delete Doctor");
        menu.addItem("4. Search Doctor");
        menu.addItem("5. Exit");
        int choice;
        I_List list = new DoctorList();
        
        do {
            menu.showMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    System.out.println("--------- Add Doctor ----------");
                    list.add();
                    break;
                case 2:
                    System.out.println("--------- Update Doctor -------");
                    list.update();
                    break;
                case 3:
                    System.out.println("--------- Delete Doctor -------");
                    list.delete();
                    break;
                case 4:
                    System.out.println("---------- Search Doctor --------");
                    String name = name = Utils.getString("Enter name: ");
                    list.searchName(name);
                    break;
            }
        } while (choice >= 0 && choice <= 4);
    }
    
}
