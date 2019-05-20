package service;

import Domain.UserRegistration;

import java.util.*;

public class UserRegistrationServiceImpl implements UserRegistrationService
{
    private static UserRegistrationServiceImpl service = null;
    private Map<String,UserRegistration > registration;

    private UserRegistrationServiceImpl()
    {
        this.registration = new HashMap<>();
    }

    public static UserRegistrationServiceImpl getRepository()
    {
        if(service == null) service = new UserRegistrationServiceImpl();
        return service;

    }


    @Override
    public UserRegistration create(UserRegistration reg)
    {
        this.registration.put(reg.getName(),reg);
        this.registration.put(reg.getSurname(),reg);
        this.registration.put(reg.getStudentNumber(),reg);
        this.registration.put(reg.getEmailAddress(),reg);
        this.registration.put(reg.getPassword(),reg);
        return reg;
    }

    @Override
    public UserRegistration update(UserRegistration reg)
    {
        this.registration.replace(reg.getName(),reg);
        this.registration.replace(reg.getSurname(),reg);
        this.registration.replace(reg.getStudentNumber(),reg);
        this.registration.replace(reg.getEmailAddress(),reg);
        this.registration.replace(reg.getPassword(),reg);
        return reg;
    }

    @Override
    public void delete(UserRegistration reg)
    {
         this.registration.remove(reg);
    }

    @Override
    public UserRegistration read(UserRegistration registration)
    {
        this.registration.get(registration);
        return registration;
    }

    @Override
    public Set<UserRegistration> getAll() {
        Collection<UserRegistration> registrationCollection = this.registration.values();
        Set<UserRegistration> set = new HashSet<>();
        set.addAll(registrationCollection);
        return set;
    }
}
