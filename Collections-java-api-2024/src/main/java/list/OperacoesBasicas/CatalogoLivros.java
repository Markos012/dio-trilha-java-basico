package main.java.list.OperacoesBasicas;

import java.util.ArrayList;

public class CatalogoLivros {
    //atributos
    private List<Livro> livroList;

    public CatalogoLivros() { this.livroList = new ArrayList<>();  }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        if(!livroList.isEmpty()){
            for(livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }
return livrosPorAutor;

    }
public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    for(Livro l : livroList){
        if(l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao()<= anoFinal){
    livrosPorIntervaloAnos.add();
           }
         }
       }
       return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
if(!livroList.isEmpty()){
    for(livro l : livroList){
 if(l.getTitulo().equalsIgnoreCase(titulo)){
     livroPorTitulo = l;
     break;
        }
        }
}
return livroPorTitulo;
             }
}