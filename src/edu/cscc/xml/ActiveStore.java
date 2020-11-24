package edu.cscc.xml;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ActiveStore")
@XmlAccessorType(XmlAccessType.FIELD)
public class ActiveStore {
    @XmlAttribute
    private String storeNumber;
    @XmlElement(name = "AddressLine1")
    private String addressLIne1;
    @XmlElement(name = "City")
    private String city;
    @XmlElement(name = "State")
    private String state;
    @XmlElement(name = "Zip")
    private String zip;


    public ActiveStore(String storeNumber, String addressLIne1, String city, String state, String zip) {
        this.storeNumber = storeNumber;
        this.addressLIne1 = addressLIne1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public ActiveStore() {

    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getAddressLIne1() {
        return addressLIne1;
    }

    public void setAddressLIne1(String addressLIne1) {
        this.addressLIne1 = addressLIne1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


}
