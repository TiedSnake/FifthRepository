/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class Std
{
    int id;
    String name;
//parameterized constructor
    Std(int i, String n)
    {
        id =i;
        name=n;
    }
    public void display()
    {
        System.out.println(id+" "+name);
    }
}
