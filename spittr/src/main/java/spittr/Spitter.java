package spittr;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Arrays;

/**
 * Created by Fedor on 10/9/2016.
 */
public class Spitter {
    @NotNull
    @Size(min=5, max=16, message="{username.size}")
    private String username;
    @NotNull
    @Size(min=5, max=25, message="{password.size}")
    private String password;
    @NotNull
    @Size(min=2, max=30, message="{firstName.size}")
    private String firstName;
    @NotNull
    @Size(min=2, max=30, message="{lastName.size}")
    private String lastName;
    @NotNull
    @Email(message="{email.valid}")
    private String email;

    public Spitter() {}

    public Spitter(String username, String password, String firstName, String lastName, String email) {
        this(null, username, password, firstName, lastName, email);
    }

//                    .param("firstName", "Jack")
//                .param("lastName", "Bauer")
//                .param("username", "jbauer")
//                .param("password", "24hours"))

    public Spitter(Long id, String username, String password, String firstName, String lastName, String email) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, Arrays.asList("id"));
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, Arrays.asList("id"));
    }
}