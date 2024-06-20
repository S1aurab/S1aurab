package Methods;

public class Students {
    int sid;
    String sname;
    char grade;
     void printStuData(){
         System.out.println(sid+"    "+sname+"  "+grade);
     }
     void stedata(int id,String name, char g){

        sid=id;
        sname=name;
        grade=g;

    }
    Students(int id,String name, char g){
        sid=id;
        sname=name;
        grade=g;

}
    }

