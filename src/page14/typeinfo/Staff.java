package page14.typeinfo;

import java.util.ArrayList;

public class Staff extends ArrayList<Position> {
    public void add(String title, Person person) {
        add(new Position(title, person));
    }

    public void add(String... titles) {
        for (String title : titles) {
            add(new Position(title));
        }
    }

    public Staff(String... titles) {
        add(titles);
    }

    public Boolean positionAvailable(String title) {
        for (Position position : this) {
            if (position.getTitle().equals(title) &&
                    position.getPerson() == Person.Null) {
                return true;
            }
            ;
        }
        return false;
    }

    public void fillPosittion(String title, Person hire) {
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPerson() == Person.Null) {
                position.setPerson(hire);
                return;
            }
            throw new RuntimeException("Position " + title + " not avaliable");
        }
    }

    public static void main(String[] args) {
        Staff staff = new Staff("President", "CTO", "Marketing Manager", "Produt Manager",
                "Software Engineer", "Software Engineer", "Software Engineer", "tmp.Test Engineer", "Technical Writer");
        staff.fillPosittion("President", new Person("Me", "Last", "The Top,lonely At"));
        staff.fillPosittion("Project Lead", new Person("Janet", "Planner", "The Burbs"));
        if (staff.positionAvailable("Software Engineer")) {
            staff.fillPosittion("Software Engineer", new Person("Bob", "Code", "Bright Light City"));
            System.out.println(staff);
        }
    }


}
