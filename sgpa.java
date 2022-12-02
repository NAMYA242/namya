
import java.lang.*;
import java.util.*;
class sgpa{
    Scanner sc = new Scanner(System.in);
    int marks[]=new int[3];
    int credits[]=new int[3];
int gradepoints[]=new int[3];

    public void entermarks() {
        System.out.println("Enter each subject marks and credits");
        for(int i=0;i<marks.length;i++) {
            System.out.println("enter the subject"+ (i+1) +"'s marks");
            marks[i]=sc.nextInt();

            System.out.println("enter the subject" +(i+1) +"'s credits");
            credits[i]=sc.nextInt();
        }
    }

    float calculateSGPA(){
        float sgpa;
 int sumofcredits=0;
int numerator=0;

for(int i=0;i<credits.length;i++){
if(marks[i]>=90){
gradepoints[i]=10;
}else if (marks[i]<90 && marks[i]>=80){
gradepoints[i]=9;
}else if(marks[i]<80 && marks[i]>=70){
gradepoints[i]=8;
}else if(marks[i]<70 && marks[i]>=60){
gradepoints[i]=7;
}else if(marks[i]<60 && marks[i]>=50){
gradepoints[i]=6;
}else if(marks[i]<50 && marks[i]>=40){
gradepoints[i]=5;
}else{
gradepoints[i]=0;
}
sumofcredits += credits[i];
  numerator +=(credits[i]*gradepoints[i]);
        }
sgpa=(float) (numerator/sumofcredits);
return sgpa;
}
public static void main(String args[]){
sgpa ob= new sgpa();
ob.entermarks();
float result=ob.calculateSGPA();
System.out.println("The SGPA of the student is " + result);
}
}

