package repository;

import Domain.UserRegistration;

import java.util.*;

public class UserRegistrationRepositoryImpl implements UserRegistrationRepository
{
    private static UserRegistrationRepositoryImpl repository= null;
    private Map<String,UserRegistration> userReg;

    private UserRegistrationRepositoryImpl() {
        this.userReg = new HashMap<>();
    }



    public static UserRegistrationRepository getRepository()
    {
        if (repository == null) repository = new UserRegistrationRepositoryImpl();
        return repository;

    }

    public UserRegistration create(UserRegistration userRegi)
    {
        this.userReg.put(userRegi.getName(),userRegi);
        this.userReg.put(userRegi.getSurname(),userRegi);
        this.userReg.put(userRegi.getStudentNumber(),userRegi);
        this.userReg.put(userRegi.getEmailAddress(),userRegi);
        this.userReg.put(userRegi.getPassword(),userRegi);
        return userRegi;
    }


    public UserRegistration update(UserRegistration userRegi)
    {
        this.userReg.replace(userRegi.getName(),userRegi);
        this.userReg.replace(userRegi.getSurname(),userRegi);
        this.userReg.replace(userRegi.getStudentNumber(),userRegi);
        this.userReg.replace(userRegi.getEmailAddress(),userRegi);
        this.userReg.replace(userRegi.getPassword(),userRegi);
        return userRegi;
    }

        public void delete(UserRegistration userRegi)
        {
            this.userReg.remove(userRegi.getName(),userRegi);
        }

    public UserRegistration read(UserRegistration userRegi)
        {
            return this.userReg.get(userRegi.getName());

        }

    public Set<UserRegistration> getAll()
    {
        Collection<UserRegistration> userRegistrations = this.userReg.values();
        Set<UserRegistration> set = new HashSet<>();
        set.addAll(userRegistrations);
        return set;
    }


}
