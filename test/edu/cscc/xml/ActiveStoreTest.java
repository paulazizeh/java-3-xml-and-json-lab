package edu.cscc.xml;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class ActiveStoreTest {

    private ActiveStore activeStore;

    @BeforeEach
    void setUp() {
        activeStore = new ActiveStore("39458", "1234 Grove Ave", "Vernon", "KS", "87654");
    }

    @Test
    void getStoreNumber() {
        assertEquals("39458", activeStore.getStoreNumber());
    }

    @Test
    void setStoreNumber() {
        activeStore.setStoreNumber("37854");
        assertEquals("37854", activeStore.getStoreNumber());
    }

    @Test
    void getAddressLIne1() {
        assertEquals("1234 Grove Ave", activeStore.getAddressLIne1());
    }

    @Test
    void setAddressLIne1() {
        activeStore.setAddressLIne1("9876 Grove Ave");
        assertEquals("9876 Grove Ave", activeStore.getAddressLIne1());
    }

    @Test
    void getCity() {
        assertEquals("Vernon", activeStore.getCity());
    }

    @Test
    void setCity() {
        activeStore.setCity("Orlando");
        assertEquals("Orlando", activeStore.getCity());
    }

    @Test
    void getState() {
        assertEquals("KS", activeStore.getState());
    }

    @Test
    void setState() {
        activeStore.setState("OH");
        assertEquals("OH", activeStore.getState());
    }

    @Test
    void getZip() {

        assertEquals("87654", activeStore.getZip());
    }

    @Test
    void setZip() {
        activeStore.setZip("77654");
        assertEquals("77654", activeStore.getZip());
    }
}