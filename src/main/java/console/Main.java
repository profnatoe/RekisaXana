package console;

import application.patreon.admin.CreatePatreon;

public class Main
{

    public static void main(String...args)
    {
        create();
    }

    public static void create()
    {
        String fname="nando", mname="chris", lname="femi", email="a@example.co.za", user="e2pass", pwd="password";

        CreatePatreon.Do(fname,mname,lname,email,user,pwd);
    }
}
