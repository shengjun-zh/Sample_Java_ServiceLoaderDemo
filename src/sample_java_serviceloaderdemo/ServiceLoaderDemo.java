/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample_java_serviceloaderdemo;

import java.util.ServiceLoader;
/**
 *
 * @author shenzhu
 */
public class ServiceLoaderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("ServiceLoaderDemo started!");
        
        ServiceLoader<CPService> services =
                (ServiceLoader.load(CPService.class));
        
        System.out.println(services);
        
        for (CPService cpService : services) {
            cpService.show();
        }
        
        System.out.println("ServiceLoaderDemo ended!");
    }
    
}
