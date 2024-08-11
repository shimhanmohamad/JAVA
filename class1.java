class computer{
    public void playmusic(){
        System.out.println("Palying music");
    }
    public String price(int cost){
        if(cost >=10){
            return "rate is correct";
        }
        else{
            return "Rate is note suitable";
        }
    }
}

class class1{
   public static void main(String args[]){
    computer obj = new computer();
    obj.playmusic();
    String a = obj.price(12); 
    System.out.println(a);
   } 
}