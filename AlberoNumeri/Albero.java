package AlberoNumeri;


public class Albero {
    Nodo radice = null;

    public Albero(Nodo radice) {
        this.radice = radice;
    }

    public void inputNodo(Nodo nodo){
        Nodo attuale = radice;
        Nodo successivo; 

        do {
            if (attuale.value > nodo.value) {
                successivo = attuale.right;
            } else {
                successivo = attuale.left;
            }

            if(successivo != null){
                attuale = successivo;
            }

        } while (successivo != null);
        if(nodo.value > attuale.value){
            attuale.right = nodo;
        }else{
            attuale.left = nodo;
        }
    }

    public void viewTree(Nodo nodo){
        if(nodo.left != null){
            viewTree(nodo.left);
        }
        System.out.println(nodo.value);

        if(nodo.right != null){
            viewTree(nodo.right);  
        }
    }
}
