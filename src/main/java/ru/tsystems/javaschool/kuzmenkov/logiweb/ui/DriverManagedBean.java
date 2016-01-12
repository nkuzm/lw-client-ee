package ru.tsystems.javaschool.kuzmenkov.logiweb.ui;

import org.apache.log4j.Logger;
import ru.tsystems.javaschool.kuzmenkov.logiweb.model.DriverInfo;
import ru.tsystems.javaschool.kuzmenkov.logiweb.model.WayPoint;
import ru.tsystems.javaschool.kuzmenkov.logiweb.model.DriverStatus;
import ru.tsystems.javaschool.kuzmenkov.logiweb.model.FreightStatus;
import ru.tsystems.javaschool.kuzmenkov.logiweb.service.DriverServiceBean;
import ru.tsystems.javaschool.kuzmenkov.logiweb.service.FreightServiceBean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.util.List;

/**
 * A simple managed bean that is used to invoke the StatusEJB and store the status.
 * The status message is obtained by invoking getStatusMessage().
 */
@ManagedBean(name="driverBean")
@SessionScoped
public class DriverManagedBean {

    private static final Logger LOGGER = Logger.getLogger(DriverManagedBean.class);
    private FacesMessage message;

    private DriverInfo driverInfo;

    @Inject
    private DriverServiceBean driverServiceBean;
    @Inject
    private FreightServiceBean freightServiceBean;

    public DriverInfo getDriverInfo() {
        return driverInfo;
    }

    public void setDriverInfo(DriverInfo driverInfo) {
        this.driverInfo = driverInfo;
    }

    public void setStatusDrivingForDriver(Integer personalNumber) {
        driverServiceBean.setStatusDrivingForDriver(personalNumber);
        driverInfo.setCurrentDriverStatus(DriverStatus.DRIVING);
    }

    public String initDriver(Integer personalNumber) {
        driverInfo = driverServiceBean.getDriverInfo(personalNumber);

        return "home";
    }

    public String startDriverShift(Integer personalNumber) {
        LOGGER.info("Start shift for driver with number: " + personalNumber);
        driverServiceBean.startShiftForDriver(personalNumber);
        driverInfo.setCurrentDriverStatus(DriverStatus.REST_IN_SHIFT);

        return "home";
    }

    public String endDriverShift(Integer personalNumber) {
        try {
            LOGGER.info("End shift for current driver.");
            driverServiceBean.endShiftForDriver(personalNumber);
            driverInfo.setCurrentDriverStatus(DriverStatus.FREE);

        } catch (Exception e) {
            message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sorry, the driver is already in that status!", null);
            FacesContext.getCurrentInstance().addMessage("driverStatusForm", message);
        }

        return "home";
    }

    public String setStatusRestingForDriver(Integer personalNumber) {
        driverServiceBean.setStatusRestingForDriver(personalNumber);
        driverInfo.setCurrentDriverStatus(DriverStatus.REST_IN_SHIFT);

        return "home";
    }

    public String setStatusPickedUpForFreight(Integer freightId) {
        setStatusToFreight(freightId, FreightStatus.PICKED_UP);
        freightServiceBean.setStatusPickedUpForFreight(freightId);

        return "home";
    }

    public String setStatusDeliverForFreightAndEndCurrentOrderIfPossible(Integer freightId, Integer driverPersonalNumber) {
        setStatusToFreight(freightId, FreightStatus.DELIVERED);
        freightServiceBean.setStatusDeliverForFreightAndEndCurrentOrderIfPossible(freightId, driverPersonalNumber);

        return "home";
    }

    private void setStatusToFreight(Integer freightId, FreightStatus newStatus) {
        List<WayPoint> waypoints = driverInfo.getOrderWayPoints();

        for (WayPoint w : waypoints) {
            if (w.getFreight().getFreightId() == freightId) {
                w.getFreight().setFreightStatus(newStatus);
            }
        }
    }
}
