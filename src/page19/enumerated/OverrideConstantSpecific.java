package page19.enumerated;

public enum OverrideConstantSpecific {

    NUT, BOLT, WASHER {
        @Override
        void f() {
            System.out.println("Overridden method");
        }

    };

    void f() {
        System.out.println("default behavior");
    }

    public static void main(String[] args) {

        for (OverrideConstantSpecific ocs : OverrideConstantSpecific.values()) {
            ocs.f();

        }

    }

}
