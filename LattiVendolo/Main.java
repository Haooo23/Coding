package LattiVendolo;

public class Main {
    public static void main(String[] args) {
        CisternaBuffer cisternaBuffer = new CisternaBuffer();
        SecchioBuffer secchioBuffer = new SecchioBuffer(cisternaBuffer);
        ProduttoreMucca produttoreMucca1 = new ProduttoreMucca(secchioBuffer);
        ProduttoreMucca produttoreMucca2 = new ProduttoreMucca(secchioBuffer);
        ProduttoreMucca produttoreMucca3 = new ProduttoreMucca(secchioBuffer);
        ProduttoreMucca produttoreMucca4 = new ProduttoreMucca(secchioBuffer);
        ConsumatoreCamion consumatoreCamion = new ConsumatoreCamion(cisternaBuffer);
        ConsumatoreCamion consumatoreCamion1 = new ConsumatoreCamion(cisternaBuffer);

        produttoreMucca1.start();
        produttoreMucca2.start();
        produttoreMucca3.start();
        produttoreMucca4.start();
        consumatoreCamion.start();
        consumatoreCamion1.start();

    }
}
