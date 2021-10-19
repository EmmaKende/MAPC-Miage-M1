public interface Composant {
    
 String getName();
 String getContent();
 Owner getOwner();
 int getSize();
 void appendContent(String content);
 void  setOwner(Owner owner);  
 boolean isComposite();                                                                                                   
}
