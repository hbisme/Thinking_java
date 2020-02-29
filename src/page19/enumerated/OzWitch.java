package page19.enumerated;

public enum  OzWitch {
    // 枚举实例必须写在开头, 并以 ';'结尾.
    WEST("Miss Gulch"),
    NORTH("is NORTH"),
    EAST("is EAST"),
    SOUTH("is SOUTH");

    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public static void main(String[] args) {

        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch + ":" + witch.getDescription());
        }
    }

}
