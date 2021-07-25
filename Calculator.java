class Cpa{
     void cick(){
    int gol=2;
    int gol1=3;
    int sum=gol+gol1;
    System.out.println(" two number addition:  "+ sum);
    }
    void faoul(){
        int yellow=5;
        int red=1;
        int result=yellow-red;
        System.out.println("Two number subtract: "+ result);

    }
    void conar(){
        int rside=3;
        int lside=6;
        int bside=rside*lside;
        System.out.println("Two side conar  multply: " + bside);

    }
    void obsid(){
        int p=10;
        int p1=2;
        int to=p/p1;
        System.out.println(" two trem are divide: " + to);



    }

}
class Calculator{
public static void main(String args[])
{
    Cpa naimar=new Cpa();
    naimar.cick();
    naimar.faoul();
    naimar.conar();
    naimar.obsid();

}
}
