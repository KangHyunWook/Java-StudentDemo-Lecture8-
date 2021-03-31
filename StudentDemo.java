import java.util.*;

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of students: ");
        num = sc.nextInt();
        int flag=0;
        for(int i=0; i<num; i++) {
            if(flag==0){
                System.out.println("Enter the name of a student: ");
                String name= sc.next();
                flag=1;
            }   
            while(flag==1) {
                try {
                    System.out.println("Enter the score: ");
                    int score= sc.nextInt();
                    
                } catch(InputMismatchException e ) {
                    sc = new Scanner(System.in);
                    continue;
                }
                flag=0;
            }
        }
    }
}
