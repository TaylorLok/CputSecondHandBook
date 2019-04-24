package Domain.User;

public class UserLogin
{
    private String emailAddress,password;

    private UserLogin()
    {

    }

    public UserLogin(Builder builder)
    {
        this.password = builder.password;
        this.emailAddress = builder.emailAddress;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getPassword()
    {
        return password;
    }

    public static class Builder
    {
        private String emailAddress,password;

        public Builder emailAddress(String emailAddress)
        {
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder password(String password)
        {
            this.password = password;
            return this;
        }
        public Builder copy(UserLogin login)
        {
            this.password = login.password;
            this.emailAddress = login.emailAddress;
            return this;
        }
        public UserLogin build()
        {
            return new UserLogin(this);
        }
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
