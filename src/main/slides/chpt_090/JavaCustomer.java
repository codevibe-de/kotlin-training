package chpt_090;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaCustomer {

    public String name;

    @Nullable
    public String nullableStr;

    @NotNull
    public String getId() {
        return "aaa";
    }

    public Address getAddress() {
        return null;
    }

    public void format(@NotNull String s) {
    }
}

class Address {
    public String city;
}
