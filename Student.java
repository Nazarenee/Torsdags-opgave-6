import java.util.ArrayList;
 class Student extends Person{

    ArrayList<String> passedcourses = new ArrayList<>();
    ArrayList<String> currentcourses = new ArrayList<>();


    Student(String name, ArrayList<String> passedcourses) {
        super(name);
        this.passedcourses=passedcourses;
    }



    @Override
    public boolean addCourse(String course){
        if (!passedcourses.contains(course)) {
            currentcourses.add(course);
            return true;
        } else {
            return false;
        }

    }

}
