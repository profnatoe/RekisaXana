package backend.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryBuildingClass
{

    public static SessionFactory builder(Class class_name)
    {
        var config = new Configuration();
        config.configure().addAnnotatedClass(class_name);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(config.getProperties())
                .build();

        return config.buildSessionFactory(serviceRegistry);
    }
}
