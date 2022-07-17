package com.students.project;

public class App 
{
    public static void main( String[] args )
    {
        System.err.println( "********** Welcome To Lambok Programme***********" );
        Student s = new Student();     
        s.setName("Ashutosh");
        System.out.println(s.getName());
        s.setId("222222");
        System.out.println(s.getId());
        s.setPhone("777777777");
        System.out.println(s.getPhone());
        System.err.println(s);
    }
}
