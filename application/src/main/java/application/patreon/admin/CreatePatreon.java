package application.patreon.admin;

import backend.models.Patreon;
import backend.models.PatreonName;
import org.hibernate.Session;

import static backend.hibernate.SessionFactoryBuildingClass.builder;

public class CreatePatreon
{
    static Session session;

    public static void Do(String fname, String mname, String lname, String email, String user, String password)  {
        try{
             var patreonnames = new PatreonName();
             patreonnames.setFname(fname);
             patreonnames.setMname(mname);
             patreonnames.setLname(lname);

             var patreon = new Patreon();

             patreon.setPatreonName(patreonnames);
             patreon.setEmail(email);
             patreon.setUsr(user);
             patreon.setPwd(password);

            session = builder(Patreon.class).openSession();
            session.beginTransaction();
            session.save(patreon);
            System.out.println("\n=====SUCCESSFULLY ADDED '"+ patreon+ "' RECORD TO THE DATABASE=====\n");
            session.getTransaction().commit();
        }
        catch(Exception e)
        {
            if(session.getTransaction() != null)
            {
                //roll back the transaction
                System.out.println("Roll back process initiated, saving record to Db failed");
                session.getTransaction().rollback();
            }
            e.getMessage();
        }
        finally {
            if(session.isOpen())
            {
                session.close();
            }
        }
    }
}
