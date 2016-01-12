package ru.tsystems.javaschool.kuzmenkov.logiweb.ws;

import ru.tsystems.javaschool.kuzmenkov.logiweb.model.Driver;
import ru.tsystems.javaschool.kuzmenkov.logiweb.model.DriverInfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Service Endpoint Interface (SEI).
 */
@WebService
public interface DriverWebService {

    /**
     * Start new shift for driver.
     *
     * @param driverPersonalNumber
     */
    void startShiftForDriver(@WebParam(name = "DriverPersonalNumber") Integer driverPersonalNumber);

    /**
     * End shift for driver.
     *
     * @param driverPersonalNumber
     *
     */
    void endShiftForDriver(@WebParam(name = "DriverPersonalNumber") Integer driverPersonalNumber);

    void setStatusRestingForDriver(@WebParam(name = "DriverPersonalNumber") Integer driverPersonalNumber);

    void setStatusDrivingForDriver(@WebParam(name = "DriverPersonalNumber") Integer driverPersonalNumber);

    /**
     * Takes a driver credentials and processes authentication using SOAP webservice.
     */
    @WebMethod
    Driver authenticateDriver(@WebParam(name = "driverPersonalNumber") Integer driverPersonalNumber,
                              @WebParam(name = "driverPassword") String driverPassword);

    @WebMethod
    DriverInfo getDriverInfo(@WebParam(name = "driverPersonalNumber") Integer driverPersonalNumber);

    @WebMethod
    void setStatusPickUpForFreight(@WebParam(name = "freightId") Integer freightId);

    @WebMethod
    void setStatusDeliverForFreightAndEndCurrentOrderIfPossible(
            @WebParam(name = "freightId") Integer freightId,
            @WebParam(name = "driverPersonalNumber") Integer driverPersonalNumber);
}
