package JavaBasic.Test.Test08;

public class Group {
    private String groupName;
    private Student[]studentsForGroup;

    public Group(String groupName, Student[] studentsForGroup) {
        this.groupName = groupName;
        this.studentsForGroup = studentsForGroup;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudentsForGroup() {
        return studentsForGroup;
    }

    public void setStudentsForGroup(Student[] studentsForGroup) {
        this.studentsForGroup = studentsForGroup;
    }

    @Override
    public String toString() {
        String result = "Группа " + groupName + "\n";
        for (Student student : studentsForGroup){
            if (student != null){
                result += "Студент : " + student + "\n";
            }
        }
        return result;

    }
}
