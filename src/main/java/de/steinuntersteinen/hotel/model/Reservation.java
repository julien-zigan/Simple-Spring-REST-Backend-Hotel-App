package de.steinuntersteinen.hotel.model;

import java.util.Date;
import java.util.Objects;

public class Reservation {

    private String id;
    private Date checkInDate;
    private Date checkOutDate;
    private String guestName;
    private String guestEmail;
    private int roomNumber;

    public Reservation(String id,
                       Date checkInDate,
                       Date checkOutDate,
                       String guestName,
                       String guestEmail,
                       int roomNumber) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guestName = guestName;
        this.guestEmail = guestEmail;
        this.roomNumber = roomNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return roomNumber == that.roomNumber && Objects.equals(id, that.id) && Objects.equals(checkInDate, that.checkInDate) && Objects.equals(checkOutDate, that.checkOutDate) && Objects.equals(guestName, that.guestName) && Objects.equals(guestEmail, that.guestEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, checkInDate, checkOutDate, guestName, guestEmail, roomNumber);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id='" + id + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", guestName='" + guestName + '\'' +
                ", guestEmail='" + guestEmail + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
