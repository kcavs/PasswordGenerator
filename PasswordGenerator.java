public class PasswordGenerator{
    private String prefix;
    private int rand;
    private static int numPass=0;
    public PasswordGenerator(String p, int r){
        prefix=p;
        rand=r;
    }
    public PasswordGenerator(int r){
        rand=r;
        prefix="a";
    }
    public int pwCount(){
        return numPass;
    }
    public String pwGen(){
        String genPW=prefix+".";
        numPass+=1;
        for(int i=rand;i>0;i--){
            int x=(int)(Math.random()*10);
            genPW=genPW+x;
        }
        return genPW;
    }
    public static void main(String[]args){
        PasswordGenerator password= new PasswordGenerator("hi",8);
        PasswordGenerator pass2= new PasswordGenerator(10);
        System.out.println(password.pwGen());
        System.out.println(pass2.pwGen());
        System.out.println(password.pwCount());
        System.out.println(pass2.pwCount());
    }

}