package br.estacio.lpr.exercicios.robot;
public class ProgramaRobot 
{
    public static void main(String args[])
    {
        System.out.println("Programa de Robots");
        System.out.println("Programa de Robots");
        
        ClassRobot r1,r2,r3,r4,r5;
        r1 = new ClassRobot();
        r1.setName("RobotTeste01");
        r2 = new ClassRobot("MyRobot");
        r3 = new ClassRobot("Robot01",100);
        r4 = new ClassRobot("TesteRobot",500);
        r5 = new ClassRobot("ExRobot",200);
        
        r1.show();
        r2.show();
        r3.show();
        r4.show();
        r5.show();
        
        
    }

}
