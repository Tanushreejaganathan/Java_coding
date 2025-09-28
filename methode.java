class comp{
    public void playmusic()
    {
        System.out.println("Playing music...");
    }
    public String getmepen(int cost)
    {
        if(cost<5)
        {
            return "yes";
        }
        else{
            return "no";
        }
    }
    
}

public class methode {
    public static void main(String[] args) {
        comp co=new comp();
        co.playmusic();
        String res=co.getmepen(2);
        System.err.println(res);
    }
    
}
