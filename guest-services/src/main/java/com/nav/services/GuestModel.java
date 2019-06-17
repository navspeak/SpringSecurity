package com.nav.services;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuestModel {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private String country;
    private String state;
    private String phoneNumber;


    Guest translateModelToGuest() {
        Guest guest = new Guest();
        guest.setFirstName(this.firstName);
        guest.setLastName(this.lastName);
        guest.setEmailAddress(this.emailAddress);
        guest.setAddress(this.address);
        guest.setCountry(this.country);
        guest.setState(this.state);
        guest.setPhoneNumber(this.phoneNumber);
        return guest;
    }
}
