package JavaProgrammes;

public class TaskFive{
        int a = 10;
        int b = 20;
        static int c = 30;
        static int d = 40;

        public static void main(String[] args) {

            myAdds();
            mySubtract();
            myMultiplication();
            myDivision();


        }

        public static void myAdds() {

            JavaProgrammes.TaskFive task5Five = new JavaProgrammes.TaskFive();
            String s = (task5Five.a) + (task5Five.b) + c + d + " Addition";
            System.out.println(s);

        }

        public static void mySubtract() {

            JavaProgrammes.TaskFive task5Five = new JavaProgrammes.TaskFive();
            String s = (task5Five.a) - (task5Five.b) - c - d + " Subtraction";
            System.out.println(s);
        }

        public static void myMultiplication() {

            JavaProgrammes.TaskFive task5Five = new JavaProgrammes.TaskFive();
            String s = (task5Five.a) * (task5Five.b) * c * d + " Multiplication";
            System.out.println(s);
        }

        public static void myDivision() {

            JavaProgrammes.TaskFive task5Five = new JavaProgrammes.TaskFive();
            String s = (task5Five.a) / (task5Five.b) / c / d + "  Division";
            System.out.println(s);
        }
    }

