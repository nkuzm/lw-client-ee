package ru.tsystems.javaschool.kuzmenkov.logiweb.service;


import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import ru.tsystems.javaschool.kuzmenkov.logiweb.ws.DriverWebService;

import javax.ejb.Stateless;

/**
 * @author Nikolay Kuzmenkov.
 */
@Stateless
public class FreightServiceBean {

    private static final String WEB_SERVICE_URL = "http://localhost:8888/lw/services/driver";
    private transient JaxWsProxyFactoryBean factory;
    private transient DriverWebService driverWebService;

    public void setStatusPickedUpForFreight(Integer freightId) {
        factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(DriverWebService.class);
        factory.setAddress(WEB_SERVICE_URL);
        driverWebService = (DriverWebService) factory.create();

        driverWebService.setStatusPickUpForFreight(freightId);
    }

    public void setStatusDeliverForFreightAndEndCurrentOrderIfPossible(Integer freightId) {
        factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(DriverWebService.class);
        factory.setAddress(WEB_SERVICE_URL);
        driverWebService = (DriverWebService) factory.create();

        driverWebService.setStatusDeliverForFreightAndEndCurrentOrderIfPossible(freightId);
    }
}
