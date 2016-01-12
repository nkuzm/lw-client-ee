package ru.tsystems.javaschool.kuzmenkov.logiweb.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import ru.tsystems.javaschool.kuzmenkov.logiweb.model.Driver;
import ru.tsystems.javaschool.kuzmenkov.logiweb.model.DriverInfo;
import ru.tsystems.javaschool.kuzmenkov.logiweb.ws.DriverWebService;

import javax.ejb.Stateless;

/**
 * @author Nikolay Kuzmenkov.
 */
@Stateless
public class DriverServiceBean {

    private static final String WEB_SERVICE_URL = "http://localhost:8888/lw/services/driver";
    private transient JaxWsProxyFactoryBean factory;
    private transient DriverWebService driverWebService;

    public Driver authenticateDriver(Integer driverPersonalNumber, String driverPassword) {

        factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(DriverWebService.class);
        factory.setAddress(WEB_SERVICE_URL);
        driverWebService = (DriverWebService) factory.create();

        return driverWebService.authenticateDriver(driverPersonalNumber, driverPassword);
    }

    public void startShiftForDriver(Integer personalNumber) throws IllegalStateException {
        factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(DriverWebService.class);
        factory.setAddress(WEB_SERVICE_URL);
        driverWebService = (DriverWebService) factory.create();

        driverWebService.startShiftForDriver(personalNumber);
    }

    public void endShiftForDriver(Integer personalNumber) throws IllegalStateException {
        factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(DriverWebService.class);
        factory.setAddress(WEB_SERVICE_URL);
        driverWebService = (DriverWebService) factory.create();

        driverWebService.endShiftForDriver(personalNumber);
    }

    public void setStatusDrivingForDriver(Integer personalNumber) {
        factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(DriverWebService.class);
        factory.setAddress(WEB_SERVICE_URL);
        driverWebService = (DriverWebService) factory.create();

        driverWebService.setStatusDrivingForDriver(personalNumber);
    }

    public void setStatusRestingForDriver(Integer personalNumber) {
        factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(DriverWebService.class);
        factory.setAddress(WEB_SERVICE_URL);
        driverWebService = (DriverWebService) factory.create();

        driverWebService.setStatusRestingForDriver(personalNumber);
    }

    public DriverInfo getDriverInfo(Integer personalNumber) {
        factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(DriverWebService.class);
        factory.setAddress(WEB_SERVICE_URL);
        driverWebService = (DriverWebService) factory.create();

        return driverWebService.getDriverInfo(personalNumber);
    }
}
