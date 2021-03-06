package compiladorcefetiny;

import java.util.HashSet;

/**
 *
 * @author Aline, Eduardo Cotta, Luiz, Pedro Lucas e Ruan
 */

public class Memoria {
    private static HashSet<Variavel> pilhaMem = new HashSet<Variavel>();
    
    public static Boolean searchVariableExists (String nomeVariavel){
        
        Variavel[] vetorPilhaMem = new Variavel[pilhaMem.size()];
        pilhaMem.toArray(vetorPilhaMem);
        
        for( int i = 0; i < vetorPilhaMem.length; i++ ){
            if(vetorPilhaMem[i].getName().equals(nomeVariavel)){
                return true;
            }
        }
        
        return false;
    }
    
    public static Variavel searchVariable (String nomeVariavel){
        
        Variavel[] vetorPilhaMem = new Variavel[pilhaMem.size()];
        pilhaMem.toArray(vetorPilhaMem);
        Variavel var = new Variavel();
        
        for( int i = 0; i < vetorPilhaMem.length; i++ ){
            if(vetorPilhaMem[i].getName().equals(nomeVariavel)){
                var.setValue( vetorPilhaMem[i].getValue() );
                var.setType( vetorPilhaMem[i].getType() );
                var.setName( vetorPilhaMem[i].getName() );
            }
        }
        
        return var; 
    }
    
    public static void insert (Variavel variavel){
        pilhaMem.add(variavel);
    }
    
    public static void update (Variavel variavel){
        Variavel[] vetorPilhaMem = new Variavel[pilhaMem.size()];
        pilhaMem.toArray(vetorPilhaMem);
        
        for( int i = 0; i < vetorPilhaMem.length; i++ ){
            if(vetorPilhaMem[i].getName().equals(variavel.getName())){
                vetorPilhaMem[i].setType(variavel.getType());
                vetorPilhaMem[i].setValue(variavel.getValue());
            }
        }
        
    }
    
    public static void delete (String nomeVariavel){
        Variavel[] vetorPilhaMem = new Variavel[pilhaMem.size()];
        pilhaMem.toArray(vetorPilhaMem);
        
        for( int i = 0; i < vetorPilhaMem.length; i++ ){
            if(vetorPilhaMem[i].getName().equals(nomeVariavel)){
                pilhaMem.remove(vetorPilhaMem[i]);
            }
        }
    }
        
}
