package backend.models;

import javax.persistence.*;

@Entity
@Table(name = "patreons")
public class Patreon
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="patreon ")
    private PatreonName patreonName;

    @Column(name="username")
    private String usr;

    @Column(name="password")
    private String pwd;

    @Column(name="email_Address")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PatreonName getPatreonName() {
        return patreonName;
    }

    public void setPatreonName(PatreonName patreonName) {
        this.patreonName = patreonName;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Patreon{" +
                "id=" + id +
                ", patreonName=" + patreonName +
                ", usr='" + usr + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
