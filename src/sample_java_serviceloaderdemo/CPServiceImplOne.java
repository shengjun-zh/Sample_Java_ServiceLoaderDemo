/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample_java_serviceloaderdemo;

/**
 *
 * @author shenzhu
 */
public class CPServiceImplOne implements CPService {
    @Override
    public void show(){
        System.out.println("CPServiceImplOne has been loaded....");
    }
}