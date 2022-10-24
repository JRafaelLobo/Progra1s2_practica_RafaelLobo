package com.mycompany.s2practicasemanal_joselobo;

import java.util.Scanner;
/**
 *
 * @author JoseLobo
 */
public class S2PracticaSemanal_JoseLobo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("1-->Division con restas");
        System.out.println("2-->Primeros 10 multiplos");
        System.out.println("3-->Practica If,Or");
        System.out.println("4-->Sumatoria");
        System.out.println("5-->Sumar dijitos");
        System.out.println("6-->salir");
        System.out.println("Ingrese su opcion: ");
        int opcion = leer.nextInt();
        
        do{
        if (opcion==1){
            int c=0;
            System.out.println("Ingrese  el numero a: ");
            int a = leer.nextInt();
            System.out.println("Ingrese  el numero b: ");
            int b = leer.nextInt();
            
            //proceso opcion 1
            while(a>=b){
                a=a-b;
                c++;
            }//while opcion 1
            System.out.println("Cociente: "+c);
            System.out.println("Reciduo: "+a);
        }//opcion 1
        else if (opcion==2){
            int i=1;
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            int resultado=num;
            System.out.print("0");
            while (i<10){
                System.out.print(", "+resultado);
                resultado=resultado+num;
                i++;
            }//while opcion 2
            System.out.println(" ");
        }//opcion 2
        else if (opcion==3){
            System.out.println("Ingrese su dato a: ");
            int a = leer.nextInt();
            while(a>1||a<0){
                System.out.println("Dato invalido");
                System.out.println("Ingrese otro dato para a: ");
                a = leer.nextInt();
            }//a test
            System.out.println("Ingrese su dato b: ");
            int b = leer.nextInt();
            while(b>1||b<0){
                System.out.println("Dato invalido");
                System.out.println("Ingrese otro dato para a: ");
                b = leer.nextInt();
            }//a test
            if(a==0||b==0){
                System.out.print("[0][1]");
            }else{
                System.out.print("[1][0]");
            }//if and
            if(a==1||b==1){
                System.out.println("[1][0]");
            }else{
                System.out.println("[0][1]");
            }//if or
        }//opcion 3
        else if(opcion==4){
            double b,powerb,poderd,x,m,n=0,done1=0,done;
            int c;
            System.out.println("Ingrese su numero de x: ");
            x = leer.nextDouble();
            System.out.println("Ingrese su numero de n: ");
            m = leer.nextDouble();
            b =(x-1)/(x+1);
            while(n<=m){
                powerb=2*n+1;
                c = 1;
                poderd=1;
                while(c<=powerb){
                    poderd=poderd*b;
                    c++;
                }//poder
                done =(1/powerb)*poderd;
                done1=done1+done;
                n++;
                //poder=0;
            }//while opcion 4
            done1=done1*2;
            System.out.println("Su resultado es: " + done1);
            }//opcion 4
        else if(opcion==5){
            System.out.println("Ingrese su numero a sumar: ");
            int num = leer.nextInt();
            int rem,total=0;
            while (num>=1){
            rem=num%10;
            num=num/10;
            total=total+rem;
            }//while
            System.out.println("Su numero es: "+total);
        }//opcion 5
        System.out.println("Menu");
        System.out.println("1-->Division con restas");
        System.out.println("2-->Primeros 10 multiplos");
        System.out.println("3-->Practica If,Or");
        System.out.println("4-->Sumatoria");
        System.out.println("5-->Sumar dijitos");
        System.out.println("6-->salir");
        System.out.println("Ingrese su opcion: ");
        opcion = leer.nextInt();
        
    }while(opcion!=6);//do
        System.out.println("Saliendo..");
    }//puclic class void main
}//public class
