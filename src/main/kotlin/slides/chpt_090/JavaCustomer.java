package slides.chpt_090;

import org.jetbrains.annotations.NotNull;

public class JavaCustomer {

    public String name;

    @NotNull
    public String getId() {
        return "aaa";
    }

    public Address getAddress() {
        return null;
    }
}

class Address {
    public String city;
}
