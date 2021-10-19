public class Owner {

    private String name;

    public Owner(String n){
        this.name=n;
    }
    public boolean equals(Object o){
        if(this.name == o )return true ;
        return false;
    }

    public String toString(){
        return "Owner :" + this.name;
    }

    //hashcode

}
