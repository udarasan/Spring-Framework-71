package org.example.dto;

public class UserDTO {
    private String uId;
    private String uName;
    private String uAddress;
    private UCity uCity;

    public UserDTO(String uId, String uName, String uAddress, UCity uCity) {
        this.uId = uId;
        this.uName = uName;
        this.uAddress = uAddress;
        this.uCity = uCity;
    }

    public UserDTO() {
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public UCity getuCity() {
        return uCity;
    }

    public void setuCity(UCity uCity) {
        this.uCity = uCity;
    }
    @Override
    public String toString() {
        return "UserDTO{" +
                "uId='" + uId + '\'' +
                ", uName='" + uName + '\'' +
                ", uAddress='" + uAddress + '\'' +
                ", uCity=" + uCity +
                '}';
    }
}
