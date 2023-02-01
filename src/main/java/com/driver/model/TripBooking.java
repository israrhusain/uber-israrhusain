package com.driver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class TripBooking{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int tripBookingId;

private String fromLocation;
private String toLocation;
private int distanceInKm;
private TripStatus status;
private int bill;

public int getTripBookingId() {
    return tripBookingId;
}

public void setTripBookingId(int tripBookingId) {
    this.tripBookingId = tripBookingId;
}

public TripBooking(int tripBookingId, String fromLocation, String toLocation, int distanceInKm, TripStatus status, int bill) {
    this.tripBookingId = tripBookingId;
    this.fromLocation = fromLocation;
    this.toLocation = toLocation;
    this.distanceInKm = distanceInKm;
    this.status = status;
    this.bill = bill;

}

public TripBooking() {
}
// mapping
@ManyToOne
@JoinColumn
private Driver driver;

@ManyToOne
@JoinColumn
private Customer customer;

public Customer getCustomer() {
    return customer;
}

public void setCustomer(Customer customer) {
    this.customer = customer;
}




public String getFromLocation() {
    return fromLocation;
}

public void setFromLocation(String fromLocation) {
    this.fromLocation = fromLocation;
}

public String getToLocation() {
    return toLocation;
}

public void setToLocation(String toLocation) {
    this.toLocation = toLocation;
}

public int getDistanceInKm() {
    return distanceInKm;
}

public void setDistanceInKm(int distanceInKm) {
    this.distanceInKm = distanceInKm;
}

public TripStatus getStatus() {
    return status;
}

public void setStatus(TripStatus status) {
    this.status = status;
}

public int getBill() {
    return bill;
}

public void setBill(int bill) {
    this.bill = bill;
}

public Driver getDriver() {
    return driver;
}

public void setDriver(Driver driver) {
    this.driver = driver;
}
}
