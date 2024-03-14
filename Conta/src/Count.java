class Count {
    private int numero;
    String titular;
    private double saldo;
    private static int totaldecontas ;
    static int identificador;

    public Count(){
        Count.identificador = 0;
    }

    public static int getidentificador(){     
        return identificador;
    }

    Count (String titular){
        this.titular = titular;
        Count.totaldecontas = totaldecontas + 1;
    }

    public static int gettotaldecontas(){
        return Count.totaldecontas;
    }

}

/*resposta da primeira pergunta: pode-se aplicar o conceito de encapsulamento. 
Isso significa que você deve declarar os atributos como private*/