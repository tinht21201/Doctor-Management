/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se150037.p00055;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huynh Trung Tin - SE150037
 */
public class DoctorList extends ArrayList<Doctor> implements I_List {
    
    @Override
    public void add() {
        String code = "";
        String name = "";
        String specialization = "";
        int availability = 0;
        boolean check = true;

        do {
            code = Utils.getString("Enter Code: ");
            if (findCode(code) != -1) {
                break;
            }
            name = Utils.getString("Enter Name: ");
            specialization = Utils.getString("Enter Specialization: ");
            availability = Utils.getPositiveInt("Enter Availability: ");
            check = false;
        } while (check);
        if (findCode(code) != -1) {
            System.out.println("Dulicate Code!");
        } else {
            add(new Doctor(code, name, specialization, availability));
            System.out.println("Added success!");
        }

    }

    @Override
    public void update() {
        String code = "";
        String name = "";
        int index = 0;
        String specialization = "";
        int availability = 0;
        boolean check = true;
        
        code = Utils.getString("Input Code that you want update: ");
        index = findCode(code);
        if (index != -1) {
                do {
                    code = Utils.updateString(get(index).getCode(), "Update Code: ");
                    name = Utils.updateString(get(index).getName(), "Update Name: ");
                    specialization = Utils.updateString(get(index).getSpecialization(), "Update Specialization: ");
                    availability = Utils.getInt("Update Availability: ");
                    check = false;
                } while (check);
                get(index).setCode(code);
                get(index).setName(name);
                get(index).setSpecialization(specialization);
                get(index).setAvailabiity(availability);
                System.out.println("Updated!");  
        } else {
            System.out.println("Not Found!");
        }
    }

    @Override
    public void delete() {
        String name = "";
        name = Utils.getString("Input Code that you want delete: ");
        if (findCode(name) != -1) {
            remove(get(findCode(name)));
            System.out.println("Removed!");
        } else {
            System.out.println("Not Found!");
        }
    }

    @Override
    public int findCode(String code) {
        for (int i = 0; i < size(); i++) {
            if (get(i).getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    public void searchName(String name) {
        for (int i = 0; i < size(); i++) {
            if (get(i).getName().equals(name)) {
                System.out.println("Doctor { " + "Code: " + get(i).getCode()
                        + ", " + "Name: " + get(i).getName()
                        + ", " + "Specialization: " + get(i).getSpecialization()
                        + ", " + "Availabiity: " + get(i).getAvailabiity() + " }");
            }
        }
    }

    @Override
    public void output() {
        for (int i = 0; i < size(); i++) {
            System.out.println("Doctor { " + "Code: " + get(i).getCode()
                    + ", " + "Name: " + get(i).getName()
                    + ", " + "Specialization: " + get(i).getSpecialization()
                    + ", " + "Availabiity: " + get(i).getAvailabiity() + " }");
        }
    }

}
