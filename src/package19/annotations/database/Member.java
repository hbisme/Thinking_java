package package19.annotations.database;

@DBTable(name = "MEMBER")
public class Member {

    @SQLString(30)
    String firstName;

    @SQLString(50)
    String lastName;

    @SQLInteger
    Integer age;

    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;

    @SQLInteger
    static int memberCount;


    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return handle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public static int getMemberCount() {
        return memberCount;
    }

    public static void setMemberCount(int memberCount) {
        Member.memberCount = memberCount;
    }
}
