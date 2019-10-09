package ru.mar.ejb;

import javax.ejb.Stateless;
import java.util.UUID;

@Stateless
public class TestEjb {

    public String getUuid() {
        return UUID.randomUUID().toString();
    }


}
