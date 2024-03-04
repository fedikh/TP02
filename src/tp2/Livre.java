package tp2;


public class Livre {
    private String title ;
    private String auteur;
    private int anne;
    public int ISBN ;
        
      public String getTitle(){
 return this.title ;
}
      public String getAuteur(){
 return this.auteur ;
}
  public int getAnne(){
 return this.anne  ;
}
  public void setTitle(String title){
      this.title=title  ;
      }
    public void setAuteur(String auteur ){
      this.auteur=auteur;
      }
    public void setAnne(int anne ){
      this.anne=anne;
      }
    
    public Livre(){
        this.title="book" ;
        this.auteur="fedi";
        this.anne=2021;
        this.ISBN=11 ;
        
    }
    public Livre(String title,String auteur){
     this.title=title ;
     this.auteur=auteur ;
    }
    public Livre(String title , String auteur ,int anne ,int ISBN){
        this.title=title ;
        this.auteur=auteur;
        this.anne=anne;
        this.ISBN=ISBN ;
    
    }
    public void afficherLivre(){
       System.out.println(this.title+" "+this.auteur+" "+this.anne+" "+this.ISBN);
   }
  
    
    
    
      
    
    
    
}
