package Criminals.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date birth;

    private String office;

    private String login;

    private String password;


    public User(String name, String cpf, Date birth, String office) {
        this.name = name;
        this.cpf = cpf;
        this.birth = birth;
        this.office = office;
        this.login = login;
        this.password = password;

    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) { this.office = office; }

    public String getLogin() { return login; }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword (){ return password; }

    public void setPassword(String password) { this.password = password; }
}
