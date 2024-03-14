class Main {
    public static void main(String[] args){

        Count c2 = new Count("Francisco");

        Count c3 = new Count("Gleveson");

        Count c4 = new Count("Vanessa");


        PessoaFisica conta1 = new PessoaFisica("12345678901");

        PessoaFisica conta2 = new PessoaFisica("10987654321");

        PessoaFisica conta3 = new PessoaFisica("12332a78901");

        int Total = Count.gettotaldecontas();
        System.out.println("Total de contas no banco é: "+ Total);

        int j = Count.getidentificador();

        System.out.println("nome do titular C02: "+ c2.titular+ " Cpf da conta: "+ conta1.getCpf());
        System.out.println("nome do titular C03: "+ c3.titular+ " Cpf da conta: "+ conta2.getCpf());
        System.out.println("nome do titular C04: "+ c4.titular+ " Cpf da conta: "+ conta3.getCpf());
        System.out.println("Numero de identificaçao por ordem de chamada: ");
        for (j++; j< Count.gettotaldecontas()+1; j++){
            System.out.println(j+"°");
        }
    }

}