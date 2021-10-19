public abstract class FileImpl implements Composant {
    final private String name;
    private Owner o;

    public FileImpl(String name, Owner o){
        this.name= name;
        this.o = new Owner(name);
    }

    public Owner getOwner(){
        return this.o;
    }
    public String getName(){
        return this.name;
    }
    public void setOwner(Owner o){
        this.o = o;
    }
    public boolean equals(Object o){
        if(this.o == o) return true;
        return false;
    }
}
