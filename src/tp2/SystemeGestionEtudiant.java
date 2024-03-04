
package tp2;

import java.util.ArrayList ;

public class SystemeGestionEtudiant {
    private ArrayList<Etudiant> liste ;
    
    public SystemeGestionEtudiant(ArrayList<Etudiant> liste){
            this.liste=liste;
            }
    
    public ArrayList getListe(){
        return this.liste ;}
    
    public void setList(ArrayList liste){
    this.liste=liste ;}
    
    
   public void ajouterEtudiant(String nom,String prename,int num,String email) {
    Etudiant E1 = new Etudiant(nom,prename,num,email);
    liste.add(E1);
   }  
   public void afficherEtudiant(){
   //affichage
   for (Etudiant e : liste){
       System.out.println(e.getNom()+e.getPrename()+e.getNum()+e.getEmail());
   }
  
   }
    public void modifierEmailEtudiant(int num ,String nouvelEmail){
        for (Etudiant E : liste ){
        if (E.getNum() == num ){
        E.setEmail(nouvelEmail); ;
                
        }}
    }
    public void supprimerEtudiant(int num){
     for (Etudiant E : liste){
     if (E.getNum() == num){liste.remove(E);}
     }
    }
 }
