package RipassoAlbero;

public class Albero {
    
    Nodo root = null;
    
    public void addNodo(Nodo newNodo){
        Nodo current = root;
        Nodo next;

        do {
            //prende il nodo maggiore/minore del nodo corrente
            if(current.valore < newNodo.valore){ 
                next = current.right; 
            }else{
                next = current.left; 
            }
            //se il nodo che ho preso esiste viene aggiornato il corrente con quello preso
            if(next != null){
                current = next;
            }
            //se no esce dal loop
        } while (next != null);

        //inserisci il nodo a dx o sx dell'ultimo nodo scelto
        if(current.valore < newNodo.valore){
            current.right = newNodo;
        }else{
            current.left = newNodo;
        }
    }

    public void viewNodo(Nodo root){
        if(root.left != null){
            viewNodo(root.left);
        }
        System.out.println(root.valore);

        if(root.right != null){
            viewNodo(root.right);
        }
    }

    public void viewNodo(){
        viewNodo(root);
    }
}
