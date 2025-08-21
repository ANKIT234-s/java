public class MyMainn {
    public static void main(String[] args) {
        Student st=new Student(roll_no:1,name:"Ankit",grade:"F");
        System.out.println(st.grade);
        st.setGrade("Pass");
        System.out.println(st.getGrade());
    }
}
