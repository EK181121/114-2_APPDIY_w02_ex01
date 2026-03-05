public class ex02 {
    public static void main(String[] args) {
        int grade = 80;
        char type = 'm';
        if (grade >= 60 && type == 'm') {
            System.out.println("course:"+type+"\nYou passed!\n"+grade);
        } else {
            System.out.println("You failed.\n"+grade);
        }
    }

}
