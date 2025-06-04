package com.mycompany.solucao1;

/**
 * Classe ProgPrincipal, que corresponde ao programa principal, tem apenas o método main
 *
 * @author Grupo10
 * @version 10/05/24
 * Notas versão :
 */
public class Solucao1
{
    private AppDesportiva controller;
    
    /**
     * Construtor vazio de ProgPrincipal
     */
    public Solucao1()
    {
        this.controller = new AppDesportiva();
    }
    
    /**
     * Construtor de ProgPrincipal quando é passado o nome do ficheiro a carregar
     */
    public Solucao1(String ficheiro)
    {
        this.controller = new AppDesportiva(ficheiro);
    }
    
    /**
     * Método main
     */
    public static void main(String[] args){
        if(args.length==0) new Solucao1();
        else new Solucao1(args[0]);
    }
}
