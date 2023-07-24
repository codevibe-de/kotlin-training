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

    public void format(@NotNull String s) {}
}

class Address {
    public String city;
}
