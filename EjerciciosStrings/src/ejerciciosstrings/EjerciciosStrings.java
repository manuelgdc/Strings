/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosstrings;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class EjerciciosStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ejercicios introduccion String I, enunciados en la carpeta del proyecto
        Scanner leer=new Scanner(System.in);
        String cadena1="Relacion de ejercicios "; char c='l'; int n=5; char b='m';
        
        System.out.println("elige un ejercicio");
        int op=leer.nextInt();
        System.out.println("******************************");
        switch(op){
            case 1:
                System.out.println("numero de espacios: "+NumeroEspacios(cadena1));
                break;
            case 2:
                System.out.println("numero de vocales: "+NumeroVocales(cadena1));
                break;
            case 3:
                System.out.println(EsPalindromo(cadena1));
                break;
            case 4:
                System.out.println(Contiene(cadena1,c));
                break;
            case 5:
                System.out.println(RepiteCaracter(c,n));
                break;
            case 6:
                System.out.println(QuitaEspacios(cadena1));
                break;
            case 7:
                System.out.println(SustituyeCaracter(cadena1,c,b));
                break;
            case 8:
                System.out.println(CuentaPalabras(cadena1));
                break;
            case 9:
                System.out.println(EsNumero(cadena1));
                break;
      
        }
        
    }
    
    public static int NumeroEspacios(String cadena){
       
        int cont=0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==' '){
                cont++;
            }
        }
        return cont;
    }
    
    public static int NumeroVocales(String cadena){
        int cont=0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==('a') || cadena.charAt(i)==('e') || cadena.charAt(i)==('i') || cadena.charAt(i)==('o') || cadena.charAt(i)==('u')){
                cont++;
            }
        }
        return cont;
    }
    
    public static boolean EsPalindromo(String cadena){
        cadena=cadena.replace(" ", "");
        cadena=cadena.toLowerCase();
        String cadena2="";
        for(int i=cadena.length()-1;i>=0;i--){
            cadena2=cadena2+cadena.charAt(i);
        }
        if(cadena2.equals(cadena)){
            return true;
        }
        else{
            return false;
        }    
    }
    
    public static boolean Contiene(String cadena, char caracter){
        int cont=0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==caracter){
                cont++;
            }
        }
        if(cont>=1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static String RepiteCaracter(char caracter, int entero){
        String cadena="";
        for(int i=0;i<entero;i++){
            cadena=cadena+caracter;
        }
        return cadena;
    }
    
    public static String QuitaEspacios(String cadena){
        while(cadena.contains(" ")){
            cadena=cadena.replace(" ", "");
        }
        return cadena;
    }
    
    public static String SustituyeCaracter(String cadena, char caracter, char caracter2){
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==caracter){
                cadena=cadena.replace(caracter, caracter2);
            }
        }
        return cadena;
    }
    
    public static int CuentaPalabras(String cadena){
        cadena=cadena.trim();
        int cont=1;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==' ' && cadena.charAt(i+1)!= ' '){
                cont++;
            }
        }
        return cont;
    }
    
    public static boolean EsNumero(String cadena){
        int cont=0;
        for(int i=0;i<cadena.length();i++){
            if(Character.isLetter(cadena.charAt(i))){
                cont++;
            }
            else{
                if(cadena.charAt(i)==' ' || cadena.charAt(i)==';' || cadena.charAt(i)=='.' || cadena.charAt(i)==',' || cadena.charAt(i)==':' || cadena.charAt(i)=='-' || cadena.charAt(i)=='?' || cadena.charAt(i)=='!')
                    cont++;
            }
        }
        if(cont>0){
            return false;
        }
        else{
            return true;
        }
    }
    
}
