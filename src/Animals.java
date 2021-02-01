public class Animals {
    String Name;
    int RunLimit;
    int SmimLimit;

  Animals (int RunLimit, int SmimLimit){
         this.RunLimit = RunLimit;
         this.SmimLimit = SmimLimit;
    }
    //abstract void Swim(int dist);
    public void Swim(int dist){
        if (dist < SmimLimit || dist == SmimLimit) {
            System.out.println(Name + " swim " + dist);
        }
        else {
            System.out.println(Name + " swim " + SmimLimit+" and can`t go on" );
        }
    }
    //abstract void Run(int dist);
    public void Run(int dist){
        if (dist < RunLimit || dist == RunLimit) {
            System.out.println(Name + " run " + dist);
        }
        else {
            System.out.println(Name + " run " + RunLimit+" and can`t go on" );
        }
    }
    void SetName(String Name){
      this.Name = Name;
    }
}
