package chpt_090;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class JavaCustomer {

    public String name;

    @Nullable
    public String nullableStr;

    @NonNull
    public String getId() {
        return "aaa";
    }

    public Address getAddress() {
        return null;
    }

    public void format(@NonNull String s) {
    }


    public static class Address {
        public String city;
    }
}


