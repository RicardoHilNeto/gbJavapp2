/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author netoh
 */

public class dbBeaches {
    public static Object beaches;
        public String name;
        public String contaminants;
        public double pH;

        public dbBeaches(String name, String contaminants, double pH) {
            this.name = name;
            this.contaminants = contaminants;
            this.pH = pH;
        }        
        
        public double getPH() {
            return pH;
        }

    public String getName() {
        return name;
    }
    public String getContaminants() {
        return contaminants;
    }

       
    }