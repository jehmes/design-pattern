package br.com.cod3r.proxy.bank.services;

/*O PROXY É TIPO UM INTERCEPTADOR. O PROXY ESTÁ NO ATM. ONDE EXISTEM OPERACOES QUE SÃO REALIZADAS
NO BANCO QUE PODEM SER FEITAS TAMBÉM NO ATM, MAS O ATM TEM RESTRIÇÕES. EXISTEM RESTRIÇÕES DENTRO DO ATM
PARA LIMITAR ACESSOS.

* */
public class ATM implements BankOperations {
    BankOperations bankOperations;

    public ATM(BankOperations bankOperations) {
        this.bankOperations = bankOperations;
    }
    @Override
    public void deposit(Long account, Long amount) {
        System.out.println("Depositing through ATK");
        bankOperations.deposit(account, amount);
    }

    @Override
    public void withdraw(Long account, String passwd, Long amount) {
        if (amount > 300) {
            System.out.println("Denied! You may not withdraw amounts over 300 here");
            return;
        }
        System.out.println("Withdraw through ATK");
        bankOperations.withdraw(account, passwd, amount);
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {
        System.out.println("You can't change your password on ATK");
    }
}
