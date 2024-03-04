
package tp2;
import java.util.ArrayList ;
public class Testeleve {
    public static void main(String[] args){
    ArrayList <Etudiant> L = new ArrayList <Etudiant>() ;
    SystemeGestionEtudiant S = new SystemeGestionEtudiant(L) ;
    S.ajouterEtudiant("fedi","khala",22,"fedikhala0@") ;
    S.ajouterEtudiant("samir","ben flen",12,"samirkhala0@") ;
    S.afficherEtudiant();
    S.modifierEmailEtudiant(12 ,"totot@") ;
    S.afficherEtudiant();
    S.supprimerEtudiant(12) ;
    S.afficherEtudiant();
    }}
