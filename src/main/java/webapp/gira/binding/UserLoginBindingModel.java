package webapp.gira.binding;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserLoginBindingModel {

    private String email;
    private String password;

    public UserLoginBindingModel() {
    }

    @NotEmpty(message = "Email blank cannot be empty")
    public String getEmail() {
        return email;
    }

    public UserLoginBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    @NotEmpty(message = "Password blank cannot be empty")
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters")
    public String getPassword() {
        return password;
    }

    public UserLoginBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }
}
