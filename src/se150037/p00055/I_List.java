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
public interface I_List {

    //add new Doctor
    void add();

    //input code want to update.
    void update();

    //input code want to delete
    void delete();

    //search and returns the list for users.
    int findCode(String code);

    void searchName(String code);

    //output
    void output();
    
}
