/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import xadrex.Bispo;
import xadrex.Peao;
import xadrex.Rainha;
import xadrex.Cavalo;
import xadrex.Rei;
import xadrex.Torre;


/**
 *
 * @author Admin
 */
public class JogarXadrex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Peao p1 = new Peao();
        p1.mover();
        
        System.out.println();
        
        Bispo b1 = new Bispo();
        b1.mover();
        
        System.out.println();
        
        Torre t1 = new Torre();
        t1.mover();
        
        System.out.println();
        
        Rei r1 = new Rei();
        r1.mover();
        
        System.out.println();
        
        Rainha ra1 = new Rainha();
        ra1.mover();
        
        System.out.println();
        
        Cavalo c1 = new Cavalo();
        c1.mover();        
    }
    
}
