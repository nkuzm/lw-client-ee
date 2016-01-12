
package ru.tsystems.javaschool.kuzmenkov.logiweb.authorization;

import org.apache.log4j.Logger;
import org.picketlink.annotations.PicketLink;
import org.picketlink.authentication.BaseAuthenticator;
import org.picketlink.credential.DefaultLoginCredentials;
import org.picketlink.idm.model.basic.User;
import ru.tsystems.javaschool.kuzmenkov.logiweb.model.Driver;

import ru.tsystems.javaschool.kuzmenkov.logiweb.service.DriverServiceBean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 * A simple PicketLink authenticator that will accept a hard coded username/password value. The
 * @PicketLink annotation is required to indicate to PicketLink that this is the default Authenticator
 * to be used.
 * 
 * @author Nikolay Kuzmenkov.
 *
 */
@PicketLink
public class SimpleAuthenticator extends BaseAuthenticator {

    private static final Logger logger = Logger.getLogger(SimpleAuthenticator.class);

    @Inject 
    private DefaultLoginCredentials credentials;
    @Inject
    private FacesContext facesContext;
    @Inject
    private DriverServiceBean driverServiceBean;

    @Override
    public void authenticate() {
        Integer driverPersonalNumber = Integer.parseInt(credentials.getUserId());
        String driverPassword = credentials.getPassword();

        Driver driver = driverServiceBean.authenticateDriver(driverPersonalNumber, driverPassword);

        if (driver != null) {
            setStatus(AuthenticationStatus.SUCCESS);
            String userId = String.valueOf(driverPersonalNumber);
            User user = new User(userId);

            user.setFirstName(driver.getFirstName());
            user.setLastName(driver.getLastName());
            setAccount(user);



        } else {
            setStatus(AuthenticationStatus.FAILURE);
            facesContext.addMessage(null, new FacesMessage(
                    "Authentication Failure - Invalid email address or password"));
        }
    }
}
