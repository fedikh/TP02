
package tp2;
public class Etudiant {
    
private String nom ;
private String prename;
private int num ;
private String email;         

public Etudiant(String nom,String prename,int num,String email){
      this.nom=nom ;
      this.prename=prename;
      this.num=num ;
      this.email=email;
   
}
public String getNom(){
 return this.nom ;
}
public String getPrename(){
 return this.prename ;
}
public int getNum(){
 return this.num ;
}
public String getEmail(){
 return this.email ;
}
public void setNom (String nom){
    this.nom=nom ;
    }
public void setPrename (String prename){
    this.prename=prename ;
    }
public void setNum (int num){
    this.num=num ;
    }
public void setEmail (String email){
    this.email=email ;
}

public String toString(){
    return ("etudant[nom="+this.nom+"prename="+this.prename+"number="+this.num+"email="+this.email);
    }
}