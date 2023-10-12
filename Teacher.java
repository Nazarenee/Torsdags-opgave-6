import java.util.ArrayList;

 class Teacher extends Person {

    ArrayList<String> canteach = new ArrayList<>();
    ArrayList<String> currentcourses = new ArrayList<>();


    Teacher(String name, ArrayList<String> canteach) {
        super(name);
        this.canteach = canteach;
    }



    @Override
    public boolean addCourse(String course) {
        if (canteach.contains(course)) {
            currentcourses.add(course);
            return true;
        } else {
            return false;
        }

    }
}