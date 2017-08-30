/*
 * In this program we make use of collection framework and insert three objects of HDTV tpe
 * then we print an unsorted and sorted list
 */
package hdtv;

import java.util.ArrayList; // importing array list
import java.util.Collections; // importing collections
import java.util.Comparator; // importing comparator

public class HDTV {                 // HDTV Class 

    String brandname;               // variable holds brandname
    int size;                       // variable holds size

    public int getSize() {          // method to get size variable value
        return size;

    }

    public static void main(String[] args) {                // main section
        Vendor objV = new Vendor();                         //creating object of Vendor class

        objV.setTvAttrib();                                   // calling setTvAttrib
        System.out.println("Unsorted List");                  // printing unsorted list
        System.out.println("--------------");
        objV.getTvAttrib();                                   //calling getTvAttrib
        System.out.println("");
        System.out.println("Sorted List");                  //printing sorted by size values
        System.out.println("--------------");
        objV.comparatorSort();                              // calling comparatorSort method

    }

}

class Vendor extends HDTV {                             // creating Vendor subclass

    ArrayList<HDTV> vendor = new ArrayList<HDTV>();     // creating arraylist of type HDTV with variable vendor
    HDTV obj1 = new HDTV();                             // defining obj1 of HDTV
    HDTV obj2 = new HDTV();                             // defining obj2 of HDTV
    HDTV obj3 = new HDTV();                             // defining obj3 of HDTV

    void setTvAttrib() {
        obj1.brandname = "PANASONIC";                   //setting brandname for obj1
        obj1.size = 65;                                 //setting size for obj1
        vendor.add(obj1);                               //adding to arraylist vendor

        obj2.brandname = "KELVIN";                        //setting brandname for obj2
        obj2.size = 51;                                  //setting size for obj2
        vendor.add(obj2);                               //adding to arraylist vendor

        obj3.brandname = "SONY";                          //setting size for obj2
        obj3.size = 42;                                  //setting size for obj2
        vendor.add(obj3);                               //adding to arraylist vendor

    }

    void getTvAttrib() {                               // method is used to loop array lista nd print values
        for (HDTV item : vendor) {
            System.out.println("Brand: " + item.brandname + " Size: " + item.size);
        }

    }

      void comparatorSort() {                   //method is used to sort list by size and print values
        Collections.sort(vendor, Vendor.sizeVendor);    // calling collection sort method and passing list and comparator variables
        for (HDTV item : vendor) {                      //looping arraylist
            System.out.println("Brand: " + item.brandname + " Size: " + item.size);
        }
    }
    
      
    public static Comparator<HDTV> sizeVendor = new Comparator<HDTV>() {
        @Override
        public int compare(HDTV o1, HDTV o2) {      //overiding compare method from comparator class
            return o1.getSize() - o2.getSize();     // prints object in ascending order

        }

    };

}
