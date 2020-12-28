package lab4;

public class Student {
        /* instance variables */
        private String name;
        private int id_no;
        private float marks;

        /* constructor */
        public Student(String name, int id_no, float marks) {
                this.name = name;
                this.id_no = id_no;
                this.marks = marks;
        }
                
        /* getter methods */
        String get_name() {
                return name;
        }

        int get_id_no() {
                return id_no;
        }

        float get_marks() {
                return marks;
        }

        /* setter methods */
        void set_name(String name) {
                this.name = name;
        }

        void set_id_no(int id_no) {
                this.id_no = id_no;
        }

        void set_marks(float marks) {
                this.marks = marks;
        }

        /* User defined method to compare two students*/
        public boolean Higher(Student x, Student y) {
                if(x.get_marks()>y.get_marks())
                        return true;
                else
                        return false;
        }
}
